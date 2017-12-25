package io.noep.boot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.junit.After;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by Taehoon Yoo
 * User  : taehoon
 * Date  : 2017. 12. 25.
 * Time  : PM 5:58
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */
public abstract class BaseRestTest {

    protected static OkHttpClient client;
    protected static ObjectMapper objectMapper;

    protected Request request;
    protected RequestBody requestBody;
    protected Response response;
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @BeforeClass
    public static void beforeClass() {
        client = new OkHttpClient();
        objectMapper = new ObjectMapper();
    }

    @After
    public void after() throws IOException {
        response = client.newCall(request).execute();
        logger.info("response : {}", response);
        if (response.body() != null) {
            logger.info("result : {} ", response.body().string());
        }
    }

    protected String write(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("write error");
    }
}
