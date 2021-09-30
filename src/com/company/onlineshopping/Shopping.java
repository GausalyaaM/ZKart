package com.company.onlineshopping;
import java.util.*;

public class Shopping{
    static Map<String,ArrayList<OrderHistory>> historyMap=new HashMap<>();
    static List<Product> proList=new ArrayList<>();
    static int number=15000;
    static int amount=0;
    public static void shopProduct(String email){
        OrderHistory history=new OrderHistory();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the category:");
        String category=scan.nextLine();
        List<Product> list=new ArrayList<>();
        if(CreateObj.map1.get(category)!=null){
            list=CreateObj.map1.get(category);
        }
        else{
            System.out.println("Category not found!");
        }
        System.out.println(list);
        System.out.println("Enter the brand:");
        String brand= scan.nextLine();
        System.out.println("Enter the model:");
        String model= scan.nextLine();
        System.out.println("Enter the quantity:");
        int quantity= scan.nextInt();
        //1
        //int amount=0;
        for(int i=0;i< list.size();i++){
            Product pro=list.get(i);
            if((pro.getBrand().equals(brand))&&(pro.getModel().equals(model))){
                if(pro.getStock()>=quantity){
                    amount+=pro.getPrice()*quantity;
                    System.out.println(amount);
                    int stock=pro.getStock();
                    stock-=quantity;
                    pro.setStock(stock);
                    number += 100;
                    history.setInvoiceNumber(number);
                    history.setCategory(category);
                    history.setBrand(brand);
                    history.setModel(model);
                    history.setPrice(pro.getPrice());
                    Main.kart.add(history);
                    proList.add(pro);
                    System.out.println("Do you want to continue to purchase or add any item or cancel the process");
                    System.out.println("Enter 1 to continue:");
                    System.out.println("Enter 2 to add any item:");
                    System.out.println("Enter 3 to cancel the process:");
                    int choice= scan.nextInt();
                    if(choice==1){
                        System.out.println("Your order is placed!");
                        historyMap.put(email,(ArrayList<OrderHistory>) Main.kart);
                        //return;
                    }
                    else if(choice==2){
                        shopProduct(email);
                    }
                    else if(choice ==3){
                        return;
                    }
                }
                else {
                    System.out.println("Product stock is not enough!!");
                }
                history.setTotalCost(amount);
                System.out.println(history.getTotalCost());
            }
            //System.out.println(Main.kart);
        }
        Main.kart=new ArrayList<>();
    }
}
