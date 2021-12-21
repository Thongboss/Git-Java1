/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB34;

/**
 *
 * @author PC
 */
public class SinhVien {
    private String ten;
    private String masv;
    private Double diemjava;
    private Double diemcsharp;

    public SinhVien() {
    }

    public SinhVien(String ten, String masv, Double diemjava, Double diemcsharp) {
        this.ten = ten;
        this.masv = masv;
        this.diemjava = diemjava;
        this.diemcsharp = diemcsharp;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setDiemjava(Double diemjava) {
        this.diemjava = diemjava;
    }

    public void setDiemcsharp(Double diemcsharp) {
        this.diemcsharp = diemcsharp;
    }

    public String getTen() {
        return ten;
    }

    public String getMasv() {
        return masv;
    }

    public Double getDiemjava() {
        return diemjava;
    }

    public Double getDiemcsharp() {
        return diemcsharp;
    }

    void inRaManHinh(){
        System.out.printf("Tên: %s\t Mã sv: %s\t Điểm java: %.1f\t Điểm csharp: %.1f\n",ten,masv,diemjava,diemcsharp);
    }
}
