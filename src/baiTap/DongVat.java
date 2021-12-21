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
public class DongVat {
    private String madv;
    private String tenloai;
    private String giongloai;
    private String khuvusong;
    private String thucan;

    public DongVat() {
    }

    public DongVat(String madv, String tenloai, String giongloai, String khuvusong, String thucan) {
        this.madv = madv;
        this.tenloai = tenloai;
        this.giongloai = giongloai;
        this.khuvusong = khuvusong;
        this.thucan = thucan;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }

    public void setGiongloai(String giongloai) {
        this.giongloai = giongloai;
    }

    public void setKhuvusong(String khuvusong) {
        this.khuvusong = khuvusong;
    }

    public void setThucan(String thucan) {
        this.thucan = thucan;
    }

    public String getMadv() {
        return madv;
    }

    public String getTenloai() {
        return tenloai;
    }

    public String getGiongloai() {
        return giongloai;
    }

    public String getKhuvusong() {
        return khuvusong;
    }

    public String getThucan() {
        return thucan;
    }
    
    void inThongTinDongVat(){
        System.out.printf("%s %s %s %s %s\n",madv,tenloai,giongloai,khuvusong,thucan);
    }
}
