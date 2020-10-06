package com.example.myapplication.model;

public class user {
    private String idUser;
    public String name;
    public String gmail;
    public int tel;
    public String password;

    public user() {
    }

    public user(String idUser, String name, String gmail, int tel, String password) {
        this.idUser = idUser;
        this.name = name;
        this.gmail = gmail;
        this.tel = tel;
        this.password = password;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
