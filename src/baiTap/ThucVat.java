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
public class ThucVat {
    private String matv;
    private String tenloai;
    private String khuvuc;

    public ThucVat() {
    }

    public ThucVat(String matv, String tenloai, String khuvuc) {
        this.matv = matv;
        this.tenloai = tenloai;
        this.khuvuc = khuvuc;
    }

    public void setMatv(String matv) {
        this.matv = matv;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }

    public void setKhuvuc(String khuvuc) {
        this.khuvuc = khuvuc;
    }

    public String getMatv() {
        return matv;
    }

    public String getTenloai() {
        return tenloai;
    }

    public String getKhuvuc() {
        return khuvuc;
    }
    
    void inThongTinThucVat(){
        System.out.printf("%s %s %s\n",matv,tenloai,khuvuc);
    }
}
