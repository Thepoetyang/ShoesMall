package com.itdr.service;

import com.itdr.common.ServerResponse;
import com.itdr.pojo.User;

/**
 * ClassName: CartService
 * 日期: 2020/2/21 10:27
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface CartService {
    ServerResponse list(User user);

    ServerResponse add(Integer productId, Integer count, Integer type, User user);

    ServerResponse update(Integer productId, Integer count,Integer type, User user);

    ServerResponse delete(Integer productId, User user);

    ServerResponse deleteAll(User user);

    ServerResponse getCartProductCount(User user);

    ServerResponse checked(Integer productId, Integer type,User user);

    ServerResponse over(User user);
}
