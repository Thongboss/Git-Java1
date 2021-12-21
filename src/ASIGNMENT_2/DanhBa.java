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
public class DanhBa extends Nguoi{
    private String sdt1;
    private String sdt2;
    private String email;
    private String ghichu;

    public DanhBa() {
    }

    public DanhBa(String sdt1, String sdt2, String email, String ghichu, String ho, String ten, String tendem, String gioitinh, int ns) {
        super(ho, ten, tendem, gioitinh, ns);
        this.sdt1 = sdt1;
        this.sdt2 = sdt2;
        this.email = email;
        this.ghichu = ghichu;
    }

    public void setSdt1(String sdt1) {
        this.sdt1 = sdt1;
    }

    public void setSdt2(String sdt2) {
        this.sdt2 = sdt2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getSdt1() {
        return sdt1;
    }

    public String getSdt2() {
        return sdt2;
    }

    public String getEmail() {
        return email;
    }

    public String getGhichu() {
        return ghichu;
    }

    @Override
    void inRRaManHinh() {
        System.out.printf("Tên: %s\t Tên đệm: %s\t Họ: %s\t Năm sinh: %d\t Giới tính: %s\t Sdt1: %s\t Sdt2: %s\t Email: %s\t Ghi chú: %s\n",getTen(),getTendem(),getHo(),getNs(),getGioitinh(),sdt1,sdt2,email,ghichu);
    }
    
    
}
