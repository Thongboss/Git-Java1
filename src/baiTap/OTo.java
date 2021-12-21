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
public class OTo {
    private String maoto;
    private String hang;
    private String dongco;
    private String nhienlieu;
    private int giatien;

    public OTo() {
    }

    public OTo(String maoto, String hang, String dongco, String nhienlieu, int giatien) {
        this.maoto = maoto;
        this.hang = hang;
        this.dongco = dongco;
        this.nhienlieu = nhienlieu;
        this.giatien = giatien;
    }

    public void setMaoto(String maoto) {
        this.maoto = maoto;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setDongco(String dongco) {
        this.dongco = dongco;
    }

    public void setNhienlieu(String nhienlieu) {
        this.nhienlieu = nhienlieu;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }

    public String getMaoto() {
        return maoto;
    }

    public String getHang() {
        return hang;
    }

    public String getDongco() {
        return dongco;
    }

    public String getNhienlieu() {
        return nhienlieu;
    }

    public int getGiatien() {
        return giatien;
    }
    
    void inThongTinOTo(){
        System.out.printf("%s %s %s %s %d\n",maoto,hang,dongco,nhienlieu,giatien);
    }
}
