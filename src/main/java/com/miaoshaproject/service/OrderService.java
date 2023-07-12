package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

/**
 * @Auther:ZLY
 * @Date: 2023/7/7 - 07 - 07 - 17:11
 * @Description:
 * @version:1.0
 */
public interface OrderService {

 OrderModel creatOrder(Integer userId,Integer itemId,Integer amount) throws BusinessException;
}
