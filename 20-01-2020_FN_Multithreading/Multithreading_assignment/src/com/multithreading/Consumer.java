package com.multithreading;

import java.util.Random;

public class Consumer implements Runnable{
    public Consumer(){

    }
    int i;
    String name;
    @Override
    public void run() {
        name = Thread.currentThread().getName();
        System.out.println(name + " wants to buy some fruit");
        Random rand=new Random();
        while (true) {
           synchronized (Main.fruitmap) {
               int i=rand.nextInt(4);
                int capacity_of_the_fruit=Main.fruitmap.get(Main.fruits[i]);
                if(capacity_of_the_fruit-- > 0) {
                  System.out.println(name+"  bought  "+Main.fruits[i]);
                  Main.fruitmap.put(Main.fruits[i],capacity_of_the_fruit);
                  Main.fruitmap.notifyAll();
                  System.out.println(" ");
                  Main.getMarketInfo();
                  try {
                      Thread.sleep(1000);
                   }catch(Exception e){
                         System.out.println("Exception caught:"+ e.getMessage());
                    }
                }
                else{
                    System.out.println(name+" please wait man! "+ Main.fruits[i] +" are about to fill ");
                }
                try{
                    Main.fruitmap.wait();
                 }catch (Exception e) {
                    System.out.println("Exception occurred:"+e.getMessage());
                 }

           }
        }
    }
}
