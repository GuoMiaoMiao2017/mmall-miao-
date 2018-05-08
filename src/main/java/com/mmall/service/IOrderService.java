package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by 15295 on 2018/5/3.
 */
public interface IOrderService {
    ServerResponse pay(Long orderNo, Integer userId, String path);

}
