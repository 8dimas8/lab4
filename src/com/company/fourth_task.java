package com.company;

public class fourth_task {
    public static void main(String[] args){
        int i, fact=1;
        int numb=10;
        System.out.println("FOR");
    for (i=1; i<=numb; i=i+1){
        fact=fact*i;
    }
    System.out.println("Факторіал числа 10:"+fact);

    System.out.println("WHILE");
    while(i<=numb){
        fact=fact*i;
    }
    System.out.println("Факторіал числа 10:"+fact);
    }
}
