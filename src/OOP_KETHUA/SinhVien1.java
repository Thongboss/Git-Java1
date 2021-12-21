/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_KETHUA;

/**
 *
 * @author PC
 */
public class SinhVien1 {
    private String ho;
    private String tendem;
    private String ten;
    private int namsinh;
    private String masv;
    private Double diemjava;

    public SinhVien1() {
    }

    public SinhVien1(String ho, String tendem, String ten, int namsinh, String masv, Double diemjava) {
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
        this.namsinh = namsinh;
        this.masv = masv;
        this.diemjava = diemjava;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setDiemjava(Double diemjava) {
        this.diemjava = diemjava;
    }

    public String getHo() {
        return ho;
    }

    public String getTendem() {
        return tendem;
    }

    public String getTen() {
        return ten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getMasv() {
        return masv;
    }

    public Double getDiemjava() {
        return diemjava;
    }
    
    
    
}
