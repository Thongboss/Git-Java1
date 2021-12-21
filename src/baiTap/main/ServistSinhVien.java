/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap.main;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServistSinhVien {
    Scanner sc= new Scanner(System.in);
    SinhVien sv;

    public ServistSinhVien() {
    }
    void tao2SVAo(){
        SinhVien sv1 = new SinhVien("thắng","PH0055",2000,6.5);
        
        SinhVien sv2 = new SinhVien();
        sv2.setTen("hoàng");
        sv2.setMasv("Ph0037");
        sv2.setNs(1999);
        sv2.setDiem(7.6);
        
        sv1.inRaManHinh();
        sv2.inRaManHinh();
    }
    void tao1SVDoNguoiDungNhapVao(){
        sv = new SinhVien();
        System.out.print("Mời bạn nhập vào tên: ");
        sv.setTen(sc.nextLine());
        System.out.print("Mời bạn nhập vào mã sinh viên: ");
        sv.setMasv(sc.nextLine());
        System.out.print("Mời bạn nhập vào năm sinh: ");
        sv.setNs(Integer.parseInt(sc.nextLine()));
        System.out.print("Mời bạn nhập vào điểm: ");
        sv.setDiem(Double.parseDouble(sc.nextLine()));
        sv.inRaManHinh();
        
    }
}
