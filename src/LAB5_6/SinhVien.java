/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_6;

/**
 *
 * @author PC
 */
public class SinhVien {
    private String ten;
    private String ma;
    private double diemjava;
    private double diemcsharp;

    public SinhVien() {
    }

    public SinhVien(String ten, String ma, double diemjava, double diemcsharp) {
        this.ten = ten;
        this.ma = ma;
        this.diemjava = diemjava;
        this.diemcsharp = diemcsharp;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setDiemjava(double diemjava) {
        this.diemjava = diemjava;
    }

    public void setDiemcsharp(double diemcsharp) {
        this.diemcsharp = diemcsharp;
    }

    public String getTen() {
        return ten;
    }

    public String getMa() {
        return ma;
    }

    public double getDiemjava() {
        return diemjava;
    }

    public double getDiemcsharp() {
        return diemcsharp;
    }
    
    void inRaManHinh(){
        System.out.printf("Tên: %s\t Mã: %s\t Điểm java: %.1f\t Điểm Csharp: %.1f\n",ten,ma,diemjava,diemcsharp);
    }
}
