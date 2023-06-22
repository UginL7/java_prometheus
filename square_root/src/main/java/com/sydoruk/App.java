package com.sydoruk;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        double a = 0.0;
        double b = 10.0;
        double c = 0.0;
        
        double D = 0.0;
        double x1 = 0.0;
        double x2 = 0.0;
        
        if(a == 0 & b == 0){
            System.out.println("x1=");
            System.out.println("x2=");
            return;
        }

        if(a == 0.0 & c==0.0){
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
            return;
        }


        if(a!=0 & b!=0 & c == 0){
            x2 = - b/a;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);        
            return;
        }

        if(a!=0 & b == 0 & c!=0){

            if(-c/a < 0){
                System.out.println("x1=");
                System.out.println("x2=");
                return;    
            }
            x1 = Math.sqrt(-c/a);
            x2 = -Math.sqrt(-c/a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);        
            return;
        }


        if(a!=0 & b == 0 & c==0){
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);        
            return;
        }


        if(a!=0 & b!=0 & c!=0){
            D = b*b - 4*a*c;
            if(D>=0){
                x1 = (-b + Math.sqrt(D))/(2*a);
                x2 = (-b - Math.sqrt(D))/(2*a);
            
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
                return;
            }            
        }
    }

    
}
