package com.kptl.user.service;

import com.kptl.user.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDTO findUser(String id);

    void save(UserDTO userDTO);
}
