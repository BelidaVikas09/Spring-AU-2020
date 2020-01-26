package com.multithreading;

import java.util.HashMap;
import java.util.Map;

public class Main {
   public static String fruits[]={"Apple","Orange","Grape","Watermelon"};
   public static int total_capacity_of_market=40;
   public static int threshold=1;
   public static Map<String,Integer>fruitmap=new HashMap<String,Integer>();
   public static void main(String args[]){
       fruitmap.put(fruits[0],10);
       fruitmap.put(fruits[1],10);
       fruitmap.put(fruits[2],10);
       fruitmap.put(fruits[3],10);
       for(int i=0;i<4;i++){
           new Thread(new Farmer(),"Farmer_"+i).start();
       }
       for(int i=0;i<4;i++){
             new Thread(new Consumer(),"Consumer_"+i).start();
       }

   }
    public static void getMarketInfo(){
        System.out.println("MarketInfo:"+fruitmap.toString());
    }
}
