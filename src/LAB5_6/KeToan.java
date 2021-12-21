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
public class KeToan {
    private int id;
    private double luong;
    private String ten;
    private Boolean trangthai;

    public KeToan() {
    }

    public KeToan(int id, double luong, String ten, Boolean trangthai) {
        this.id = id;
        this.luong = luong;
        this.ten = ten;
        this.trangthai = trangthai;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTrangthai(Boolean trangthai) {
        this.trangthai = trangthai;
    }

    public int getId() {
        return id;
    }

    public double getLuong() {
        return luong;
    }

    public String getTen() {
        return ten;
    }

    public Boolean getTrangthai() {
        return trangthai;
    }
    
    void inRaManHinh(){
        System.out.println("ID: "+id+"\t Tên: "+ten+"\t Lương: "+luong+"\t Trạng thái: "+trangthai);
    }
}
