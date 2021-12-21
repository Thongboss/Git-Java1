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
public class Nguoi {
    private String ten;
    private String sdt;
    private String diachi;
    private String ngaysinh;
    private String quequan;
    private String trinhdo;
    private int tuoi;

    public Nguoi() {
        System.out.println("Thông tin sinh viên: ");
    }

    public Nguoi(String ten, String sdt, String diachi, String ngaysinh, String quequan, String trinhdo, int tuoi) {
        this.ten = ten;
        this.sdt = sdt;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.trinhdo = trinhdo;
        this.tuoi = tuoi;
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

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
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

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public int getTuoi() {
        return tuoi;
    }
    
    void inThongTinSinhVien(){
        System.out.printf("%s %d %s %s %s %s %s\n",ten,tuoi,sdt,diachi,ngaysinh,quequan,trinhdo);
    }
    
}
