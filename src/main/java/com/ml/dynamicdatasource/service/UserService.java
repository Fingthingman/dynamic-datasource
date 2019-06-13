package com.ml.dynamicdatasource.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ml.dynamicdatasource.entity.User;


import java.util.List;

public interface UserService extends IService<User> {

    boolean save(User user);

    List<User> getUSerList();

}
