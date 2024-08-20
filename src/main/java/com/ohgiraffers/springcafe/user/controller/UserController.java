package com.ohgiraffers.springcafe.user.controller;

import com.ohgiraffers.springcafe.user.model.UserDTO;
import com.ohgiraffers.springcafe.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 전체 조회


    // 상세 조회


    // 등록
    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody UserDTO userDTO){

        if(userDTO.getUserName() == null || userDTO.getUserName().equals("")){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("이름3글자를 입력해");
        }
        if(userDTO.getUserAge() < 20) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("20살 이상만");
        }
        userService.addUser(userDTO);
        return ResponseEntity.ok(userDTO);
    }

    // 수정


    // 삭제
}
