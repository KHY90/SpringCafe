package com.ohgiraffers.springcafe.user.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class UserDTO {

    private String userName;
    private int userAge;
    private String postalCode;
    private String address;
    private String detailAddress;

    public UserDTO() {
    }

    public UserDTO(String userName, int userAge, String postalCode, String address, String detailAddress) {
        this.userName = userName;
        this.userAge = userAge;
        this.postalCode = postalCode;
        this.address = address;
        this.detailAddress = detailAddress;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", postalCode='" + postalCode + '\'' +
                ", address='" + address + '\'' +
                ", detailAddress='" + detailAddress + '\'' +
                '}';
    }

}
