package io.noep.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * User : taehoon
 * Date : 2017. 5. 2.
 * Time : 오전 10:59
 * Desc :
 */

@Entity
public class Notice {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;
    @Column
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}


