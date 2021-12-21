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
public class KeToan1 {
    private String ho;
    private String tendem;
    private String ten;
    private int namsinh;
    private String manv;
    private int ngaycong;

    public KeToan1() {
    }

    public KeToan1(String ho, String tendem, String ten, int namsinh, String manv, int ngaycong) {
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
        this.namsinh = namsinh;
        this.manv = manv;
        this.ngaycong = ngaycong;
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

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setNgaycong(int ngaycong) {
        this.ngaycong = ngaycong;
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

    public String getManv() {
        return manv;
    }

    public int getNgaycong() {
        return ngaycong;
    }
    
    
}
