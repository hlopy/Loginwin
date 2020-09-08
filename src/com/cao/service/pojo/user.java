package com.cao.service.pojo;

public class user {

    private Integer Id;
    private String username;
    private String passwd;
    private String email;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "user{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                ", password='" + passwd + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public user() {
    }

    public user(Integer id, String username, String passwd, String email) {
        Id = id;
        this.username = username;
        this.passwd = passwd;
        this.email = email;
    }
}
