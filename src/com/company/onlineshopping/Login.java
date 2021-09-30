package com.company.onlineshopping;

public class Login {
    public static boolean accountLogin(String emailId,String passwor){
        if(CreateObj.map.get(emailId)==null){
            return false;
        }
        else{
            Customer details=CreateObj.map.get(emailId);
            String password=details.getEncryptedPwd();
            String decryptedPwd="";
            for(int i=0;i<password.length();i++){
                decryptedPwd+=(char)((int)password.charAt(i)-1);
            }
            System.out.println(decryptedPwd);
            if(decryptedPwd.equals(passwor)){
                return true;
            }
            else{
                System.out.println("Password doesn't match");
            }
        }
        return false;
    }
}
