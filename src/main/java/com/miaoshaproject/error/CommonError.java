package com.miaoshaproject.error;

/**
 * @Auther:ZLY
 * @Date: 2023/7/3 - 07 - 03 - 11:36
 * @Description:
 * @version:1.0
 */
public interface CommonError {

 public int getErrCode();
 public String getErrMsg();
 public CommonError setErrMsg(String errMsg);


}
