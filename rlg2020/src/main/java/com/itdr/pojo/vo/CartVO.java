package com.itdr.pojo.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName: CartVO
 * 日期: 2020/2/21 11:27
 *
 * @author Air张
 * @since JDK 1.8
 */
public class CartVO {
    private List<CartProductVO> cartProductVOList;

    private Boolean allChecked;

    private BigDecimal cartTotalPrice;

    public List<CartProductVO> getCartProductVOList() {
        return cartProductVOList;
    }

    public void setCartProductVOList(List<CartProductVO> cartProductVOList) {
        this.cartProductVOList = cartProductVOList;
    }

    public Boolean isAllChecked() {
        return allChecked;
    }

    public void setAllChecked(Boolean allChecked) {
        this.allChecked = allChecked;
    }

    public BigDecimal getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(BigDecimal cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }
}
