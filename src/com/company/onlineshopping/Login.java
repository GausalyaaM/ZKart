package com.company.onlineshopping;

public class Login {
    static AdminInfo info=new AdminInfo();
    public static boolean accountLogin(String emailId,String password){
        if(CreateObj.map.get(emailId)==null){
            return false;
        }
        else{
            Customer details=CreateObj.map.get(emailId);
            String pass=details.getEncryptedPwd();
            String newPass = "";
            for (int j = 0; j < password.length(); j++) {
                if (password.charAt(j) != 'z' && password.charAt(j) != 'Z') {
                    newPass += (char) (((int) password.charAt(j) + 1));
                } else if (password.charAt(j) == 'z') {
                    newPass += "a";
                } else if (password.charAt(j) == 'Z') {
                    newPass += "A";
                } else if (password.charAt(j) == '9') {
                    newPass += "0";
                }}
            //String decryptedPwd="";
            //for(int i=0;i<password.length();i++){
              //  decryptedPwd+=(char)((int)password.charAt(i)-1);
            //}
            System.out.println(newPass);
            if(newPass.equals(pass)){
                return true;
            }
            else{
                System.out.println("Password doesn't match");
            }
        }
        return false;
    }}
    /* public static void initialiseAdminInfo(){
        info.setEmail("admin@zoho.com");
        info.setPassword("xyzzy");
    }*/


