package com.github.r_sneto.NoticeBoard.controller;

import com.github.r_sneto.NoticeBoard.entity.User;
import com.github.r_sneto.NoticeBoard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> obj = userService.findAll();
        return ResponseEntity.ok().body(obj);
    }
}
