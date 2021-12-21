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
public class KeToan {
    private int id;
    private Double luong;
    private String ten;
    private boolean trangthai;

    public KeToan() {
    }

    public KeToan(int id, Double luong, String ten, boolean trangthai) {
        this.id = id;
        this.luong = luong;
        this.ten = ten;
        this.trangthai = trangthai;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public int getId() {
        return id;
    }

    public Double getLuong() {
        return luong;
    }

    public String getTen() {
        return ten;
    }

    public boolean isTrangthai() {
        return trangthai;
    }
    
    void inRaManHinh(){
        System.out.println("ID: "+id+"   Lương: "+luong+"     Tên: "+ten+"     Trạng thái: "+trangthai);
    }
    
}
