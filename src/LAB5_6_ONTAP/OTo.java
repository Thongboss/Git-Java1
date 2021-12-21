/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_6_ONTAP;

/**
 *
 * @author PC
 */
public class OTo {
    private int ma;
    private double giatien;
    private String hang;
    private boolean dongco;
    private String nhienlieu;

    public OTo() {
    }

    public OTo(int ma, double giatien, String hang, boolean dongco, String nhienlieu) {
        this.ma = ma;
        this.giatien = giatien;
        this.hang = hang;
        this.dongco = dongco;
        this.nhienlieu = nhienlieu;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setDongco(boolean dongco) {
        this.dongco = dongco;
    }

    public void setNhienlieu(String nhienlieu) {
        this.nhienlieu = nhienlieu;
    }

    public int getMa() {
        return ma;
    }

    public double getGiatien() {
        return giatien;
    }

    public String getHang() {
        return hang;
    }

    public boolean isDongco() {
        return dongco;
    }

    public String getNhienlieu() {
        return nhienlieu;
    }
    
    void inRaManHinh(){
        System.out.println("Mã: "+ma+"\t Giá tiền: "+giatien+"\t Hãng: "+hang+"\t Động cơ: "+dongco+"\t Nhiên liệu: "+nhienlieu);
    }
}
