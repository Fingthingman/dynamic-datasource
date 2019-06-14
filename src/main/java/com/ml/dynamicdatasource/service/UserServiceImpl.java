package com.ml.dynamicdatasource.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ml.dynamicdatasource.aspect.DataSource;
import com.ml.dynamicdatasource.datasource.enums.DS;
import com.ml.dynamicdatasource.entity.User;
import com.ml.dynamicdatasource.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @NAME: UserServiceImpl
 * @DATE: 2019/6/12
 * @Author Mr.MaL
 * @Description TODO
 **/
@Service
@DataSource(DS.DS1)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public boolean save(User entity) {
        return super.save(entity);
    }

    @Override
    public List<User> getUSerList() {
        return baseMapper.selectList(Wrappers.<User>lambdaQuery());
    }
}
