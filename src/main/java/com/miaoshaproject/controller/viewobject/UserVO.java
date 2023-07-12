package com.miaoshaproject.controller.viewobject;

/**
 * @Auther:ZLY
 * @Date: 2023/7/1 - 07 - 01 - 21:16
 * @Description:
 * @version:1.0
 */
public class UserVO {

 private Integer id;
 private String name;
 private Byte gender;
 private Integer age;
 private String telephone;

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
}
