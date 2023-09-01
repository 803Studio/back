package com.kptl.user.service.impl;

import com.kptl.user.dao.UserMapper;
import com.kptl.user.dto.UserDTO;
import com.kptl.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserDTO findUser(String id) {
        return userMapper.findUser(id);
    }

    @Override
    public void save(UserDTO userDTO) {
        userMapper.save(userDTO);
    }
}
