package com.company;

public class first_task {
    public static void main(String[] args){
        System.out.println("FOR");
        for(int i=500; i<=650; i=i+10){
            System.out.println(i);
        }


        System.out.println("WHILE");
        int a=500;
        while(a<=650){
            System.out.println(a);
            a=a+10;
        }

        System.out.println("DO WHILE");
        int c=500;
        do
        {
            System.out.println(c);
            c=c+10;
        }
        while(c<=650);
    }
}
