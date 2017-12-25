package io.noep.boot.repository;

import io.noep.boot.entity.Notice;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Taehoon Yoo
 * User  : taehoon
 * Date  : 2017. 12. 25.
 * Time  : PM 5:40
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  : JpaRepository는 못 쓰나?
 */
@RepositoryRestResource(collectionResourceRel = "notice", path = "notices")
public interface NoticeRepository extends PagingAndSortingRepository<Notice, Long> {
}
