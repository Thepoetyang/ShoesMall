package com.itdr.service;

import com.itdr.common.ServerResponse;
import com.itdr.pojo.User;

/**
 * ClassName: OrderService
 * 日期: 2020/2/29 11:14
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface OrderService {
    ServerResponse create(User user, Integer shippingId);
}
