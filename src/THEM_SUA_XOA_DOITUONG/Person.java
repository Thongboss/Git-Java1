/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THEM_SUA_XOA_DOITUONG;

/**
 *
 * @author PC
 */
public class Person {
    private String ten;
    private String sdt;
    private String email;

    public Person() {
    }

    public Person(String ten, String sdt, String email) {
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }
    
    void inRaManHinh(){
        
    }
}
