package com.company.onlineshopping;

public class AdminInfo {
    static private String email="admin@zoho.com";
    static private String password="xyzzy";
    //public AdminInfo(){
       // email="admin@zoho.com";
      //  password="xyzzy";
    //}

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        AdminInfo.password = password;
    }
    public String toString(){
        return this.email+" "+this.password;
    }
}
