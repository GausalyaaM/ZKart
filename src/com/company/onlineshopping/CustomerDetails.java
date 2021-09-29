package com.company.onlineshopping;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class CustomerDetails {
    public static List<String> readCustomerDetailsFromFile(){
        List<String> list=new ArrayList<>();
        File file=new File("/home/inc7/IdeaProjects/ZKart/src/com/company/onlineshopping/zusers_db");
        try(FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr)){
            String line;
            while((line=br.readLine())!=null){
                list.add(line);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static List<String> readProductDetailsFromFile(){
        List<String> list1=new ArrayList<>();
        File file=new File("/home/inc7/IdeaProjects/ZKart/src/com/company/onlineshopping/z-kart_db");
        try(FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr)){
            String line;
            while((line=br.readLine())!=null){
                list1.add(line);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
        return list1;
    }
}
