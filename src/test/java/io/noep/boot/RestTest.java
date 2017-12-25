package io.noep.boot;

import io.noep.boot.entity.Notice;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.junit.Test;

/**
 * Created by Taehoon Yoo
 * User  : taehoon
 * Date  : 2017. 12. 25.
 * Time  : PM 5:47
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */

public class RestTest extends BaseRestTest {

    private long targetId = 5L;

    /**
     * get list
     */
    @Test
    public void getTest() {

        request = new Request.Builder()
                .url("http://localhost:8080/notices")
                .get()
                .build();
    }

    /**
     * get 1
     */
    @Test
    public void getTest2() {
        request = new Request.Builder()
                .url("http://localhost:8080/notices/1")
                .get()
                .build();
    }

    /**
     * add
     */
    @Test
    public void postTest() {

        Notice notice = new Notice();
        notice.setTitle("titleTest");
        notice.setContent("contentTest");
        requestBody =
                RequestBody.create(MediaType.parse("application/json"), super.write(notice));

        request = new Request.Builder()
                .url("http://localhost:8080/notices")
                .post(requestBody)
                .build();
    }

    /**
     * modify
     */
    @Test
    public void putTest() {

        Notice notice = new Notice();
        notice.setTitle("titleTestModify");
        notice.setContent("contentTestModify");
        requestBody =
                RequestBody.create(MediaType.parse("application/json"), super.write(notice));

        request = new Request.Builder()
                .url("http://localhost:8080/notices/"+3)
                .put(requestBody)
                .build();

    }

    /**
     * delete
     */
    @Test
    public void deleteTest() {

        request = new Request.Builder()
                .url("http://localhost:8080/notices/" + targetId)
                .delete()
                .build();
    }
}
