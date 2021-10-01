package com.company.onlineshopping;

import java.util.Random;

public class GenerateDiscount {
    public static String generateCouponCode(){
    String discountCode="";
    String str="Ajdgeul";
    char[] chars=str.toCharArray();
    char[] digit={'1','2','3','4','5','6','7','8','9'};
    Random random=new Random();
    int num=random.nextInt(10000);
    while(num>0){
        int i=num%10;
        discountCode+=chars[i];
        num=num/10;
        if(num!=0){
            i=num%10;
            discountCode+=digit[i];
        }
    }
    System.out.println(discountCode);
    return discountCode;
    }
}