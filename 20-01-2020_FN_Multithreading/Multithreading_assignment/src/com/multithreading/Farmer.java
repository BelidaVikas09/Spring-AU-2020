package com.multithreading;

import java.util.Map;
interface functionalinterface{
    int get_present_cap(Map<String,Integer> map);
}
interface functionalmapping{
    void add_fruits_into_the_market(String s,int x);
}

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
                    funcm.add_fruits_into_the_market(Main.fruits[0],1);
                    funcm.add_fruits_into_the_market(Main.fruits[0],1);
                    funcm.add_fruits_into_the_market(Main.fruits[0],1);
                    funcm.add_fruits_into_the_market(Main.fruits[0],1);
                    try{
                        Main.fruitmap.wait();
                    } catch (Exception e) {
                        System.out.println("Exception occurred: "+e.getMessage());
                    }
            }
        }
    }
    functionalinterface func=(Map<String,Integer> m)->{  //lambda function
        int total=0;
        for(Map.Entry<String,Integer> entry :m.entrySet()){
            total+=entry.getValue();
        }
        return total;
    };
    functionalmapping funcm=(String fruit,int value )->{  //lambda function
        int total_cap=Main.total_capacity_of_market;
        int present_cap_of_market=func.get_present_cap(Main.fruitmap);
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
    };

}
