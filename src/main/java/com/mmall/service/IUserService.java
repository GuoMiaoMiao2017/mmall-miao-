package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by 15295 on 2018/4/19.
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);
    ServerResponse<String> register(User user);
    ServerResponse checkAdminRole(User user);
    ServerResponse<User> updateInformation(User user);
    ServerResponse<String> checkValid(String str, String type);
    ServerResponse<String> selectQuestion(String username);
    ServerResponse<User> getInformation(Integer userId);
    ServerResponse<String> checkAnswer(String username, String question, String answer);
    ServerResponse<String> resetPassword(User user, String passwordOld, String passwordNew);
    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);
}
