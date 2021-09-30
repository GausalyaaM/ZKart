package com.company.onlineshopping;

import java.util.ArrayList;
import java.util.HashMap;

public class CreateObj {
    static HashMap<String,Customer> map=new HashMap<>();
    static HashMap<String, ArrayList<Product>> map1 = new HashMap<>();
    public static void getCustomerObj(){
        for(int i=0;i<Main.customerList.size();i++){
            int j=0;
            Customer details=new Customer();
            String arr[]=Main.customerList.get(i).split("      ");
            details.setEmailId(arr[j++]);
            details.setEncryptedPwd(arr[j++]);
            details.setName(arr[j++]);
            details.setMobileNo(arr[j++]);
            map.put(details.getEmailId(),details);
            System.out.println(details);
        }
        //System.out.println(map);
    }
    public static void getProductObj() {
        for (int i = 0; i < Main.productList.size(); i++) {
            int j = 0;
            ArrayList<Product> list = new ArrayList<>();
            Product details1 = new Product();
            //CompositeKey obj=new CompositeKey();
            String arr[] = Main.productList.get(i).split("      ");
            // details1.setCategory(arr[j++]);
            String category = arr[j++];
            details1.setBrand(arr[j++]);
            details1.setModel(arr[j++]);
            details1.setPrice(Integer.parseInt(arr[j++]));
            details1.setStock(Integer.parseInt(arr[j++]));
            //map.put(details1.getEmailId(),details);
            //System.out.println(details);
            list.add(details1);
            //System.out.println(list);
            if (map1.get(category) == null) {
                map1.put(category, list);
            } else {
                ArrayList<Product> newList = new ArrayList<>();
                ArrayList<Product> details = map1.get(category);
                Product obj = details.get(0);
                newList.add(obj);
                newList.add(details1);
                map1.put(category, newList);
            }
        }
        System.out.println(map1);
    }
}
