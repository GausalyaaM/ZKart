package com.company.onlineshopping;

import java.io.FileWriter;
import java.io.IOException;

public class AccountCreation {
        public static boolean checkAccount(String email){
            if(CreateObj.map.get(email)==null) {
                return true;
            }
            return false;
        }
        public static boolean createAccount(String email,Customer details){
            CreateObj.map.put(email,details);
            try(FileWriter writer=new FileWriter("/home/inc7/IdeaProjects/ZKart/src/com/company/onlineshopping/zusers_db",true)){
                writer.write("\n");
                //writer.write(email);
                writer.write(String.valueOf(details));
            }
            catch(IOException e){
                e.printStackTrace();
            }
            return true;
        }
    }

