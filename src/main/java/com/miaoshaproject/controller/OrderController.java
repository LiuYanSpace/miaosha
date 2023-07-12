package com.miaoshaproject.controller;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.error.EmBusinessError;
import com.miaoshaproject.response.CommonReturnType;
import com.miaoshaproject.service.OrderService;
import com.miaoshaproject.service.model.OrderModel;
import com.miaoshaproject.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther:ZLY
 * @Date: 2023/7/8 - 07 - 08 - 16:06
 * @Description:
 * @version:1.0
 */
@Controller("/order")
@RequestMapping("/order")
@CrossOrigin(origins = {"*"}, allowCredentials = "true")
public class OrderController extends BaseController {
    //封装下单请求
    @Autowired
    private OrderService orderService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @RequestMapping(value = "/creatorder", method = {RequestMethod.POST}, consumes = {CONTENT_TYPE_FORMED})
    @ResponseBody
    public CommonReturnType creatOrder(@RequestParam(name = "itemId") Integer itemId, @RequestParam(name = "amount") Integer amount) throws BusinessException {

        //判断用户是否登录
        Boolean isLogin = (Boolean) httpServletRequest.getSession().getAttribute("IS_LOGIN");
        if (isLogin == null || !isLogin.booleanValue()) {
            throw new BusinessException(EmBusinessError.USER_NOT_LOGIN, "用户还未登录");
        }

        //获取登录用户的信息
        UserModel userModel = (UserModel) httpServletRequest.getSession().getAttribute("LOGIN_USER");

        OrderModel orderModel = orderService.creatOrder(userModel.getId(), itemId, amount);

        return CommonReturnType.create(null);

    }
}
