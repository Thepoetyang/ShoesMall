package com.itdr.service;

import com.itdr.common.ServerResponse;
import com.itdr.pojo.Category;
import com.itdr.pojo.Product;
import com.itdr.pojo.vo.ProductVO;

/**
 * ClassName: ProductService
 * 日期: 2020/2/20 10:38
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface ProductService {
    ServerResponse<Category> baseCategory(Integer pid);

    ServerResponse<ProductVO> detail(Integer productId);

    ServerResponse<ProductVO> list(String keyword,Integer pageNum,Integer pageSize,String orderBy);
}
