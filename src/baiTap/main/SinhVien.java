/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap.main;

/**
 *
 * @author PC
 */
public class SinhVien {
    private String ten;
    private String masv;
    private int ns;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String ten, String masv, int ns, double diem) {
        this.ten = ten;
        this.masv = masv;
        this.ns = ns;
        this.diem = diem;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public String getMasv() {
        return masv;
    }

    public int getNs() {
        return ns;
    }

    public double getDiem() {
        return diem;
    }
    
    void inRaManHinh(){
        System.out.printf("Tên: %s\n Mã sinh viên: %s\n Tuổi: %d\n Điểm: %.1f\n",ten,masv,2021-ns,diem);
    }


}
