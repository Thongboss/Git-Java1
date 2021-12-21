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
public class GiaoVien1 {
    private String ho;
    private String tendem;
    private String ten;
    private int namsinh;
    private String magv;
    private int gioday;

    public GiaoVien1() {
    }

    public GiaoVien1(String ho, String tendem, String ten, int namsinh, String magv, int gioday) {
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
        this.namsinh = namsinh;
        this.magv = magv;
        this.gioday = gioday;
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

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public void setGioday(int gioday) {
        this.gioday = gioday;
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

    public String getMagv() {
        return magv;
    }

    public int getGioday() {
        return gioday;
    }
    
    
}
