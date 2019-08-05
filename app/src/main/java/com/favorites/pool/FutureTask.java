package com.favorites.pool;

import java.util.concurrent.Callable;

public class FutureTask implements Callable<Integer> {


    public Integer call() throws Exception{
        System.out.println("子线程在进行计算");
        Thread.sleep(3000);
        int sum = 0;
        for(int i=0;i<100;i++)
            sum += i;
        return sum;
    }


}
