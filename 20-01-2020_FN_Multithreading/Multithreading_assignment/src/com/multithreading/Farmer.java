package com.multithreading;

import java.util.Map;

public class Farmer implements Runnable{
    public Farmer(){
        super();
    }
    String name;
    @Override
    public void run() {
        name=Thread.currentThread().getName();
        System.out.println(name + "  started");
        while(true) {
            synchronized (Main.fruitmap) {
                    add_fruits_into_the_market(Main.fruits[0],1);
                    add_fruits_into_the_market(Main.fruits[1],1);
                    add_fruits_into_the_market(Main.fruits[2],1);
                    add_fruits_into_the_market(Main.fruits[3],1);
                    try{
                        Main.fruitmap.wait();
                    } catch (Exception e) {
                        System.out.println("Exception occurred: "+e.getMessage());
                    }
            }
        }
    }
    public void add_fruits_into_the_market(String fruit,int value){
        int total_cap=Main.total_capacity_of_market;
        int present_cap_of_market=get_present_cap(Main.fruitmap);
        int capacity_of_fruit=Main.fruitmap.get(fruit);
        if(capacity_of_fruit<=Main.threshold){
            Main.fruitmap.put(fruit,capacity_of_fruit+1);
            System.out.println(name+" added 1 "+fruit);
            Main.fruitmap.notifyAll();
        }
        else if(capacity_of_fruit>Main.threshold){
            System.out.println("please wait   "+ name +"   current capacity of the  " +fruit +" is more than the threshold!");
        }
        try{
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Exception occured: "+e.getMessage());
        }
    }
    public int get_present_cap(Map<String,Integer> map){
        int cap=0;
        for(int val:map.values()){
            cap+=val;
        }
        return cap;
    }
}
