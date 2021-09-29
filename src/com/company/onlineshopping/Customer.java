package com.company.onlineshopping;

public class Customer {
    private String emailId;
    private String encryptedPwd;
    private String name;
    private String mobileNo;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEncryptedPwd(String s) {
        return encryptedPwd;
    }

    public void setEncryptedPwd(String encryptedPwd) {
        this.encryptedPwd = encryptedPwd;
    }

    public String getName(String s) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo(String s) {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String toString(){
        return this.emailId+" "+this.encryptedPwd+" "+this.name+" "+this.mobileNo;
    }
}
