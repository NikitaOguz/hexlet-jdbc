package io.hexlet;

public class User {
    private Long id;
    private String username;
    private String phone;

    public User(String username, String phone) {
        this.username = username;
        this.phone = phone;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
