package com.project.book_store.service;

import com.project.book_store.dto.UserInfoDto;

public interface UserInfoService {

    public UserInfoDto createUser(UserInfoDto userInfoDto);

    public String getUserInfo(UserInfoDto userInfoDto);
}
