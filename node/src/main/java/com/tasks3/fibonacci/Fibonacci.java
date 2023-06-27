package com.tasks3.fibonacci;

public class Fibonacci {
    public long getNumber(int position){
        int i = 0;
        long fibonacci = 0l;
        long fn1 = 1l;
        long fn2 = 0l;
        if(position <= 0 | position > 2147483647){
            return -1;
        }

        do{          
            fn2 = fn1;
            fn1 = fibonacci;
            fibonacci = fn1 + fn2;
            System.out.println(i++ + " ) " + fibonacci);
        }while(i < position);
       
        return fibonacci;
    }
}
