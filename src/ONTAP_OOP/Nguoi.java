/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ONTAP_OOP;

/**
 *
 * @author PC
 */
public class Nguoi {
    private String ten;
    private String sdt;
    private String diachi;
    private int namsinh;
    private String quequan;
    private String trinhdo;

    public Nguoi() {
    }

    public Nguoi(String ten, String sdt, String diachi, int namsinh, String quequan, String trinhdo) {
        this.ten = ten;
        this.sdt = sdt;
        this.diachi = diachi;
        this.namsinh = namsinh;
        this.quequan = quequan;
        this.trinhdo = trinhdo;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public String getTrinhdo() {
        return trinhdo;
    }
    
    void inThongTinNguoi(){
        System.out.printf("%s %s %s %d %s %s\n",ten,sdt,diachi,namsinh,quequan,trinhdo);
    }
}
