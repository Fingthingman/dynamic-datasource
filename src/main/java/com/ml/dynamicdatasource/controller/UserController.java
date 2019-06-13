package com.ml.dynamicdatasource.controller;


import com.ml.dynamicdatasource.entity.User;
import com.ml.dynamicdatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @NAME: UserController
 * @DATE: 2019/6/12
 * @Author Mr.MaL
 * @Description TODO
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/select")
    public List<User> select() {
        return userService.getUSerList();
    }

    @GetMapping("/insert")
    public Boolean insert(User user) {
        return userService.save(user);
    }

}
