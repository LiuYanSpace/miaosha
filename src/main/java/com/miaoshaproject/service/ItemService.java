package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.ItemModel;

import java.util.List;

/**
 * @Auther:ZLY
 * @Date: 2023/7/6 - 07 - 06 - 21:05
 * @Description:
 * @version:1.0
 */
public interface ItemService {

    //创建商品
    ItemModel creatItem(ItemModel itemModel) throws BusinessException;

    //商品列表浏览
    List<ItemModel> listItem();

    //商品详情
    ItemModel getItemById(Integer id);

    //库存扣减
    boolean decreaseStock(Integer itemId, Integer amount)throws BusinessException;
}
