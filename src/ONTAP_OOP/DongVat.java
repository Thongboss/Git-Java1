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
public class DongVat {
    private String madv;
    private String tenloai;
    private String giongloai;
    private String khuvucsong;
    private String thucan;

    public DongVat() {
    }

    public DongVat(String madv, String tenloai, String giongloai, String khuvucsong, String thucan) {
        this.madv = madv;
        this.tenloai = tenloai;
        this.giongloai = giongloai;
        this.khuvucsong = khuvucsong;
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

    public void setKhuvucsong(String khuvucsong) {
        this.khuvucsong = khuvucsong;
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

    public String getKhuvucsong() {
        return khuvucsong;
    }

    public String getThucan() {
        return thucan;
    }
    
    void inThongTinDongVat(){
        System.out.printf("Mã dv: %s\t Tên loài: %s\t Giống loài: %s\t Khu vực sống: %s\t Thức ăn: %s\n",madv,tenloai,giongloai,khuvucsong,thucan);
    }
}
