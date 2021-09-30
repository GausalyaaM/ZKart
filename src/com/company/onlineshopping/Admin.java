package com.company.onlineshopping;

import java.util.Scanner;

public class Admin {
    public static void getAdminSec(){
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<Shopping.proList.size();i++){
            Product details=Shopping.proList.get(i);
            if(details.getStock()<10){
                System.out.println(details);
                System.out.println("Enter the "+details.getBrand()+" quantity to reorder");
                int number=scan.nextInt();
                details.setStock(details.getStock()+number);
            }
        }
        //System.out.println(Main.productList);

    }
}
