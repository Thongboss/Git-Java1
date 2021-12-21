/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap;

/**
 *
 * @author PC
 */
public class GiaoVien {
    private String ten;
    private String tendem;
    private String hoten;
    private String magv;
    private String email1;
    private String email2;
    private String sdt;
    private int sogioday;
    private String chucvu;

    public GiaoVien() {
        System.out.println("thông tin giảng viên: ");
    }

    public GiaoVien(String ten, String tendem, String hoten, String magv, String email1, String email2, String sdt, int sogioday, String chucvu) {
        this.ten = ten;
        this.tendem = tendem;
        this.hoten = hoten;
        this.magv = magv;
        this.email1 = email1;
        this.email2 = email2;
        this.sdt = sdt;
        this.sogioday = sogioday;
        this.chucvu = chucvu;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setSogioday(int sogioday) {
        this.sogioday = sogioday;
    }

    public void setChuvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getTen() {
        return ten;
    }

    public String getTendem() {
        return tendem;
    }

    public String getHoten() {
        return hoten;
    }

    public String getMagv() {
        return magv;
    }

    public String getEmail1() {
        return email1;
    }

    public String getEmail2() {
        return email2;
    }

    public String getSdt() {
        return sdt;
    }

    public int getSogioday() {
        return sogioday;
    }

    public String getChucvu() {
        return chucvu;
    }
    
    void inThongTinGiangVien(){
        System.out.printf("%s %s %s %s %s %s %s %d %s\n",ten,tendem,hoten,magv,email1,email2,sdt,sogioday,chucvu);
    }
    
}
