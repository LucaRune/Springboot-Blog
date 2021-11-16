package com.example.myblogproject.test;

public class Member {
    //자바에서 변수는 다 private로 만듬
    //private 변수를 수정할 수 있게 게터앤세터를 만들어줌
    //단축키 [ALT]+[INS]

    private  int id;
    private String username;
    private String password;
    private String email;

    //constructor
    public Member(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
