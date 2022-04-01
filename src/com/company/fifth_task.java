package com.company;

public class fifth_task {
    public static void main(String[] args) {
        int i=0;
        for (int hours = 0; hours <=23; hours++) {

            for (int minutes = 0; minutes <= 60; minutes++) {

                int a,b,c,d;
                a=hours/10;
                b=hours%10;
                c=minutes/10;
                d=minutes%10;

                if(a==c && b==d && d<=5) {
                    i++;

                }
                }
                }
        System.out.println("Кількість симетричних комбінацій:"+i);
            }
    }



