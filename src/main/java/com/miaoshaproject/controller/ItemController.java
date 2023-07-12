package com.miaoshaproject.controller;

import com.miaoshaproject.controller.viewobject.ItemVO;
import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.response.CommonReturnType;
import com.miaoshaproject.service.ItemService;
import com.miaoshaproject.service.model.ItemModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFutureCallbackRegistry;
import org.springframework.web.bind.annotation.*;

import javax.swing.border.TitledBorder;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther:ZLY
 * @Date: 2023/7/6 - 07 - 06 - 23:04
 * @Description:
 * @version:1.0
 */
@Controller("/item")
@RequestMapping("/item")
@CrossOrigin(origins = {"*"}, allowCredentials = "true")
public class ItemController extends BaseController {

    /*
    private Integer id; String title;
    private BigDecimal price;
    private Integer stock;
    private String description;
    private Integer sales;
    private String imgUrl;
     */

    @Autowired
    private ItemService itemService;

    //创建商品(sales和创建商品无关）
    @RequestMapping(value = "/creat", method = {RequestMethod.POST}, consumes = {CONTENT_TYPE_FORMED})
    @ResponseBody
    public CommonReturnType creatItem(@RequestParam(name = "title") String title,
                                      @RequestParam(name = "price") BigDecimal price,
                                      @RequestParam(name = "stock") Integer stock,
                                      @RequestParam(name = "description") String description,
                                      @RequestParam(name = "imgUrl") String imgUrl) throws BusinessException {

        //封装service请求用来创建商品
        ItemModel itemModel = new ItemModel();
        itemModel.setTitle(title);
        itemModel.setPrice(price);
        itemModel.setStock(stock);
        itemModel.setDescription(description);
        itemModel.setImgUrl(imgUrl);

        ItemModel itemModelForReturn = itemService.creatItem(itemModel);

        //返回给前端
        ItemVO itemVO = convertVOFromModel(itemModelForReturn);
        return CommonReturnType.create(itemVO);
    }

    //商品详情页浏览
    @RequestMapping(value = "/get", method = {RequestMethod.GET})
    @ResponseBody
    public CommonReturnType getItem(@RequestParam(name = "id") Integer id) {
        ItemModel itemModel = itemService.getItemById(id);
        ItemVO itemVO = this.convertVOFromModel(itemModel);

        return CommonReturnType.create(itemVO);
    }

    //商品列表浏览
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ResponseBody
    public CommonReturnType listItem() {
        List<ItemModel> itemModelList = itemService.listItem();

        //使用stream
        List<ItemVO> itemVOList = itemModelList.stream().map(itemModel -> {
                    ItemVO itemVO = this.convertVOFromModel(itemModel);
                    return itemVO; }
        ).collect(Collectors.toList());

        return CommonReturnType.create(itemVOList);
    }

    //转换成itemVO
    private ItemVO convertVOFromModel(ItemModel itemModel) {

        if (itemModel == null) {
            return null;
        }

        ItemVO itemVO = new ItemVO();
        BeanUtils.copyProperties(itemModel, itemVO);
        return itemVO;

    }
}
