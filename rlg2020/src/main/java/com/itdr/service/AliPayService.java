package com.itdr.service;

import com.itdr.common.ServerResponse;
import com.itdr.pojo.User;

import java.util.Map;

/**
 * ClassName: AliPayService
 * 日期: 2020/2/26 16:18
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface AliPayService {
    ServerResponse pay(User user, Long orderNo);

    ServerResponse alipayCallback(Map<String, String> params);

    ServerResponse queryOrderPayStatus(User user, Long orderNo);
}
