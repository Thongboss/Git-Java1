/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASIGNMENT_2;

/**
 *
 * @author PC
 */
public class Nguoi {
    private String ho;
    private String ten;
    private String tendem;
    private String gioitinh;
    private int ns;

    public Nguoi() {
    }

    public Nguoi(String ho, String ten, String tendem, String gioitinh, int ns) {
        this.ho = ho;
        this.ten = ten;
        this.tendem = tendem;
        this.gioitinh = gioitinh;
        this.ns = ns;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public String getTendem() {
        return tendem;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public int getNs() {
        return ns;
    }
    
    void inRRaManHinh(){
        
    }
}