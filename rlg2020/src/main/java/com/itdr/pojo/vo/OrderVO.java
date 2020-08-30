package com.itdr.pojo.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * ClassName: OrderVO
 * 日期: 2019/9/24 15:06
 *
 * @author Air张
 * @since JDK 1.8
 */

@Getter
@Setter
public class OrderVO {

    private Long orderNo;

    private Integer shippingId;

    private BigDecimal payment;

    private Integer paymentType;

    private Integer postage;

    private Integer status;

    private List<OrderItemVO> orderItemVoList;

    private ShippingVO shippingVO;

    //图片服务器地址
    private String imageHost;


}
