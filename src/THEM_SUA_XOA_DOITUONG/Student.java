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
public class Student extends Person{
    private String msv;
    private double diemjava;

    public Student() {
    }

    public Student(String msv, double diemjava, String ten, String sdt, String email) {
        super(ten, sdt, email);
        this.msv = msv;
        this.diemjava = diemjava;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public void setDiemjava(double diemjava) {
        this.diemjava = diemjava;
    }

    public String getMsv() {
        return msv;
    }

    public double getDiemjava() {
        return diemjava;
    }

    @Override
    void inRaManHinh() {
        System.out.printf("Tên: %s\t Sdt: %s\t Email: %s\t Msv: %s\t Điểm java: %.1f\n",getTen(),getSdt(),getEmail(),msv,diemjava);
    }
    
    
}
