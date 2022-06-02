package com.example.vcare;

public class UserProfile {
    private String name;
    private String email;
    private String user_type;
    private String status;
    public void UserProfile()
    {

    }
    public UserProfile(String name, String email, String user_type, String status) {
        this.name=name;
        this.email=email;
        this.user_type=user_type;
        this.status=status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
