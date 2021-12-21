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
public class Meo {
    private String ten;
    private int tuoi;
    private String diachi;
    private String gioitinh;
    private String ngaysinh;

    public Meo() {
    }

    public Meo(String ten, int tuoi, String diachi, String gioitinh, String ngaysinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
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

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
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
    
    void inThongTinMeo(){
        System.out.printf("Tên: %s\t Tuổi: %d\t Địa chỉ: %s\t Giới tính: %s\t Ngày sinh: %s\n",ten,tuoi,diachi,gioitinh,ngaysinh);
    }
}
