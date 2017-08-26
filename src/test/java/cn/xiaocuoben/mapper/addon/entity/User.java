package cn.xiaocuoben.mapper.addon.entity;

import javax.persistence.Table;

/**
 * @author Frank
 */
@Table(name = "user")
public class User {
    private Long id;
    private String userName;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }
}
