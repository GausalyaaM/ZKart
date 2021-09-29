package com.company.onlineshopping;

import java.util.List;

public class Main {
    static List<String> customerList=CustomerDetails.readCustomerDetailsFromFile();
    static List<String> productList=CustomerDetails.readProductDetailsFromFile();
    public static void main(String[] args) {
        CreateObj.getCustomerObj();
        CreateObj.getProductObj();
       // System.out.println(customerList);

        //System.out.println(productList);
    }
}
