package com.miaoshaproject.controller.viewobject;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @Auther:ZLY
 * @Date: 2023/7/6 - 07 - 06 - 23:04
 * @Description:
 * @version:1.0
 */
public class ItemVO {

 private Integer id;

 //商品名称

 private String title;

 //商品价格

 private BigDecimal price;

 //商品库存

 private Integer stock;

 //商品描述

 private String description;

 //商品的销量
 private Integer sales;

 //商品描述的URL

 private String imgUrl;
}
