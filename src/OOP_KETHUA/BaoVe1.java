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
public class BaoVe1 {
    private String ho;
    private String tendem;
    private String ten;
    private int namsinh;
    private String mabv;
    private String calamviec;

    public BaoVe1() {
    }

    public BaoVe1(String ho, String tendem, String ten, int namsinh, String mabv, String calamviec) {
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
        this.namsinh = namsinh;
        this.mabv = mabv;
        this.calamviec = calamviec;
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

    public void setMabv(String mabv) {
        this.mabv = mabv;
    }

    public void setCalamviec(String calamviec) {
        this.calamviec = calamviec;
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

    public String getMabv() {
        return mabv;
    }

    public String getCalamviec() {
        return calamviec;
    }
    
    
}
