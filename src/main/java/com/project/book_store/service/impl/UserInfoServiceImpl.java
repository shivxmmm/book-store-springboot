package com.project.book_store.service.impl;

import com.project.book_store.dto.UserInfoDto;
import com.project.book_store.repository.UserInfoRepository;
import com.project.book_store.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Override
    public UserInfoDto createUser(UserInfoDto userInfoDto) {
        return null;
    }
}
