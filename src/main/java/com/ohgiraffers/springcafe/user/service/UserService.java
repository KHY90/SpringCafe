package com.ohgiraffers.springcafe.user.service;

import com.ohgiraffers.springcafe.user.model.User;
import com.ohgiraffers.springcafe.user.model.UserDTO;
import com.ohgiraffers.springcafe.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 전체 조회


    // 상세 조회


    // 등록
    // 메소드를 만들려면 접근제어자부터 반환타입 메소드명 (전달하는 매게변수){
    // dto 생성
    // setter를 이용해서 데이터를 받아온 다음 repository에 저장
    // }

    @Transactional //독립적으로 이루어지며, 과정 중에 다른 연산이 끼어들 수 없다. 오류가 생긴 경우 연산을 취소하고 원래대로 되돌린다. 성공할 경우 결과를 반영
    public ResponseEntity addUser(UserDTO userDTO){ //성공을 의미하는 OK(200 code)와 함께 user 객체를 Return 하는 코드
        User user = new User
                .Builder()
                .setUserName(userDTO.getUserName())
                .setUserAge(userDTO.getUserAge())
                .setUserPostalCode(userDTO.getPostalCode())
                .setUserAddress(userDTO.getAddress())
                .setUserDetailAddress(userDTO.getDetailAddress())
                .builder();
        System.out.println(user.toString());
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }


    // 수정


    // 삭제

}
