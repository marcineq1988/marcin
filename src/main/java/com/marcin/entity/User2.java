package com.marcin.entity;

public class User2 {

    private String login;
    private String password;

    private String registerLogin;
    private String registerPassword;
    private String registerRepeatPassword;

    private String name;
    private String surName;
    private String city;
    private String postCode;
    private String street;
    private int streetNumber;
    private int houseNumber;
    private String phone;

    public User2(String marcineq1988, String haslo, String marcin, String pikula, String wroclaw, String s, String kamienna, int i, int i1, String s1) {}

    public User2(String login, String password, String registerLogin,
                 String registerPassword, String registerRepeatPassword, String name,
                 String surName, String city, String postCode, String street,
                 int streetNumber, int houseNumber, String phone) {
        this.login = login;
        this.password = password;
        this.registerLogin = registerLogin;
        this.registerPassword = registerPassword;
        this.registerRepeatPassword = registerRepeatPassword;
        this.name = name;
        this.surName = surName;
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegisterLogin() {
        return registerLogin;
    }

    public void setRegisterLogin(String registerLogin) {
        this.registerLogin = registerLogin;
    }

    public String getRegisterPassword() {
        return registerPassword;
    }

    public void setRegisterPassword(String registerPassword) {
        this.registerPassword = registerPassword;
    }

    public String getRegisterRepeatPassword() {
        return registerRepeatPassword;
    }

    public void setRegisterRepeatPassword(String registerRepeatPassword) {
        this.registerRepeatPassword = registerRepeatPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
