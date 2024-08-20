package com.ohgiraffers.springcafe.user.model;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_age", nullable = false)
    private Integer userAge;

    @Column(name = "user_postalCode")
    private String postalCode; // 우편번호

    @Column(name = "user_address")
    private String address; // 주소

    @Column(name = "user_detailAddress")
    private String detailAddress; // 상세주소

    private User(Builder builder) {
        this.userName = builder.userName;
        this.userAge = builder.userAge;
        this.postalCode = builder.postalCode;
        this.address = builder.address;
        this.detailAddress = builder.detailAddress;
    }

    public User() {
    }

    public static class Builder {
        private String userName;
        private Integer userAge;
        private String postalCode;
        private String address;
        private String detailAddress;

        public User builder() {
            return new User(this);


        }

        public Builder setUserName(String userName) {
            // 글자가 3글자이고 한글인지 확인하는 검증로직
            if (userName.trim().length() == 3 && userName.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*")) {
                this.userName = userName;
                return this;
            } else {
                return null;
            }
        }

        public Builder setUserAge(Integer userAge) {
            if (userAge < 20) {
                return null; // 엔티티에서 검증
            } else {
                this.userAge = userAge;
                return this;
            }
        }

        public Builder setUserPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setUserAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setUserDetailAddress(String detailAddress) {
            this.detailAddress = detailAddress;
            return this;
        }
    }



    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getAddress() {
        return address;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", postalCode='" + postalCode + '\'' +
                ", address='" + address + '\'' +
                ", detailAddress='" + detailAddress + '\'' +
                '}';
    }
}
