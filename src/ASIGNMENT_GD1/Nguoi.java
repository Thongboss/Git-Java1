/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASIGNMENT_GD1;

/**
 *
 * @author PC
 */
public class Nguoi {
    private String ho;
    private String ten;
    private String tendem;
    private int namsinh;
    private String gioitinh;

    public Nguoi() {
    }

    public Nguoi(String ho, String ten, String tendem, int namsinh, String gioitinh) {
        this.ho = ho;
        this.ten = ten;
        this.tendem = tendem;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
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

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
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

    public int getNamsinh() {
        return namsinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }
    
    void inRaManHinh(){
        
    }
    
}
