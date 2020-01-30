package com.mockito.dbtest;

public class Myservice {

 private MyDao myDao;

 public Myservice(MyDao myDao) {
   this.myDao = myDao;
 }

 public MyEntity findById(long id) {
   return myDao.findById(id);
 }
}