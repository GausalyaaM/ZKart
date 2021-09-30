package com.company.onlineshopping;

public class PrintOrderHistory {
    public static void printHistory(String email) {
        if(Shopping.historyMap.get(email)!=null) {
            System.out.println("InvoiceNumber  Category  Brand  Model Price");
            System.out.println(Shopping.historyMap.get(email));
            System.out.println("TotalCost: "+OrderHistory.getTotalCost());
        }
    }
}
