package com.itdr.pojo.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: OrderItemVO
 * 日期: 2019/9/24 14:48
 *
 * @author Air张
 * @since JDK 1.8
 */

@Getter
@Setter
public class OrderItemVO {
    private Long orderNo;

    private Integer productId;

    private String productName;

    private String productImage;

    private BigDecimal currentUnitPrice;

    private Integer quantity;

    private BigDecimal totalPrice;
}
