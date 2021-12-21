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
public class SinhVien {
    private String ten;
    private String tendem;
    private String hoten;
    private String masv;
    private String email;
    private String sdt;
    private String sdtnguoinhan;
    private String nganhhoc;

    public SinhVien() {
        System.out.println("Thông tin sinh viên: ");
    }

    public SinhVien(String ten, String tendem, String hoten, String masv, String email, String sdt, String sdtnguoinhan, String nganhhoc) {
        this.ten = ten;
        this.tendem = tendem;
        this.hoten = hoten;
        this.masv = masv;
        this.email = email;
        this.sdt = sdt;
        this.sdtnguoinhan = sdtnguoinhan;
        this.nganhhoc = nganhhoc;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setSdtnguoinhan(String sdtnguoinhan) {
        this.sdtnguoinhan = sdtnguoinhan;
    }

    public void setNganhhoc(String nganhhoc) {
        this.nganhhoc = nganhhoc;
    }

    public String getTen() {
        return ten;
    }

    public String getTendem() {
        return tendem;
    }

    public String getHoten() {
        return hoten;
    }

    public String getMasv() {
        return masv;
    }

    public String getEmail() {
        return email;
    }

    public String getSdt() {
        return sdt;
    }

    public String getSdtnguoinhan() {
        return sdtnguoinhan;
    }

    public String getNganhhoc() {
        return nganhhoc;
    }
    
    void inThongTinSinhVien(){
        System.out.printf("%s %s %s %s %s %s %s %s\n",ten,tendem,hoten,masv,sdt,sdtnguoinhan,nganhhoc);
    }
    
}
