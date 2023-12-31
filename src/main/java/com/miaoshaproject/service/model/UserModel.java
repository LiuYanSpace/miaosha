package com.miaoshaproject.service.model;

/**
 * @Auther:ZLY
 * @Date: 2023/7/1 - 07 - 01 - 18:46
 * @Description:
 * @version:1.0
 */
public class UserModel {

 private Integer id;
 private String name;
 private Byte gender;
 private Integer age;
 private String telephone;
 private String registerMode;
 private String thirdPartyId;

 private String encrptPassword;

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Byte getGender() {
  return gender;
 }

 public void setGender(Byte gender) {
  this.gender = gender;
 }

 public Integer getAge() {
  return age;
 }

 public void setAge(Integer age) {
  this.age = age;
 }

 public String getTelephone() {
  return telephone;
 }

 public void setTelephone(String telephone) {
  this.telephone = telephone;
 }

 public String getRegisterMode() {
  return registerMode;
 }

 public void setRegisterMode(String registerMode) {
  this.registerMode = registerMode;
 }

 public String getThirdPartyId() {
  return thirdPartyId;
 }

 public void setThirdPartyId(String thirdPartyId) {
  this.thirdPartyId = thirdPartyId;
 }

 public String getEncrptPassword() {
  return encrptPassword;
 }

 public void setEncrptPassword(String encrptPassword) {
  this.encrptPassword = encrptPassword;
 }
}
