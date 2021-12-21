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
public class Meo {
    private String ten;
    private String diachi;
    private String gioitinh;
    private String ngaysinh;
    private int tuoi;

    public Meo() {
        System.out.println("thong tin mèo: ");
    }

    public Meo(String ten, String diachi, String gioitinh, String ngaysinh, int tuoi) {
        this.ten = ten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.tuoi = tuoi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public int getTuoi() {
        return tuoi;
    }
    
    void inThongTinMeo(){
        System.out.printf("%s %d %s %s %s\n",ten,tuoi,diachi,gioitinh,ngaysinh);
    }
    
    
}
