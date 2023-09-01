package com.kptl.user.dao;

import com.kptl.user.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    UserDTO findUser(@Param("id") String id);

    void save(UserDTO userDTO);
}
