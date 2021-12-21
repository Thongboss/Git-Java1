/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_6_ONTAP;

/**
 *
 * @author PC
 */
public class Meo {
    private String ten;
    private String diachi;
    private boolean gioitinh;
    private int ns;

    public Meo() {
    }

    public Meo(String ten, String diachi, boolean gioitinh, int ns) {
        this.ten = ten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.ns = ns;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public int getNs() {
        return ns;
    }
    
    void inRaManHinh(){
        System.out.println("Tên: "+ten+"\t Địa chỉ: "+diachi+"\t Giới tính: "+gioitinh+"\t Năm sinh: "+ns);
    }
}
