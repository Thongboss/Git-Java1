/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array_ArrayList_List;

import BAITAPMAU_OOP.*;

/**
 *
 * @author PC
 */
public class SinhVien {
    private String ten;
    private String msv;
    private int namsinh;
    private Double diemjava;

    public SinhVien() {
    }

    public SinhVien(String ten, String msv, int namsinh, Double diemjava) {
        this.ten = ten;
        this.msv = msv;
        this.namsinh = namsinh;
        this.diemjava = diemjava;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setDiemjava(Double diemjava) {
        this.diemjava = diemjava;
    }

    public String getTen() {
        return ten;
    }

    public String getMsv() {
        return msv;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public Double getDiemjava() {
        return diemjava;
    }
    
    void inRaManHinh(){
        System.out.printf("Tên: %s\n Mã SV: %s\n Tuổi: %d\n Điểm:%.1f\n",ten,msv,2021-namsinh,diemjava);
    }


}
