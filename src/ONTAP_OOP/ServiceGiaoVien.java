/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ONTAP_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiceGiaoVien {

    Scanner _sc = new Scanner(System.in);
    GiaoVien[] _arrGiaoViens;
    List<GiaoVien> _1stGiaoVien = new ArrayList<>();
    GiaoVien _g;

    public ServiceGiaoVien() {
    }
//    tạo 1 thông tin giáo viên bằng 2 cách

    void tai1ThongTinGiaoVienBang2Cach() {
//        cách 1: có tham số
        GiaoVien g1 = new GiaoVien("Thông", "Hữu", "Võ Hữu Thông", "Ph13968", "thongboss@gmail.com", "VoHuuThong@fpt.edu.vn", "0368443774", 600, "giảng viên");
//        casch2: không tham số
        GiaoVien g2 = new GiaoVien();
        g2.setTen("Ngu");
        g2.setTendem("Rất");
        g2.setHoten("Thông Rất Ngu");
        g2.setMagv("NG123");
        g2.setEmail1("không tìm thấy");
        g2.setEmail2("không chộ");
        g2.setSdt("538722235");
        g2.setSogioday(56);
        g2.setChucvu("lính đánh thuê");

        g1.inThongTinGiangVien();
        g2.inThongTinGiangVien();
    }
//    tạo 1 đối tượng do người dùng nhập vào 

    void tao1DoiTuongDoNguoiDungNhap() {
        GiaoVien g3 = new GiaoVien();
        System.out.print("Mời bạn nhập vào tên giảng viên: ");
        g3.setTen(_sc.nextLine());
        System.out.print("Mời bạn nhập vào tên đệm giảng viên: ");
        g3.setTendem(_sc.nextLine());
        System.out.print("Mời bạn nhập vào họ tên giảng viên: ");
        g3.setHoten(_sc.nextLine());
        System.out.print("Mời bạn nhập vào mã giảng viên: ");
        g3.setMagv(_sc.nextLine());
        System.out.print("Mời bạn nhập vào email1 giảng viên: ");
        g3.setEmail1(_sc.nextLine());
        System.out.print("Mời bạn nhập vào email2 giảng viên: ");
        g3.setEmail2(_sc.nextLine());
        System.out.print("Mời bạn nhập vào sdt giảng viên: ");
        g3.setSdt(_sc.nextLine());
        System.out.print("Mời bạn nhập vào số giờ dạy giảng viên: ");
        g3.setSogioday(Integer.parseInt(_sc.nextLine()));
        System.out.print("Mời bạn nhập vào chức vụ của giảng viên: ");
        g3.setChucvu(_sc.nextLine());

        g3.inThongTinGiangVien();
    }
//    sử dụng arraylist

    void taoMangGiaoVien() {

        int size;
        System.out.print("Mời bạn nhập vào số lượng giáo viên: ");
        size = Integer.parseInt(_sc.nextLine());
        _arrGiaoViens = new GiaoVien[size];
        for (int i = 0; i < _arrGiaoViens.length; i++) {
            _arrGiaoViens[i] = new GiaoVien();
            System.out.print("Mời bạn nhập vào tên giảng viên thứ " + (i + 1) + " : ");
            _arrGiaoViens[i].setTen(_sc.nextLine());
            System.out.print("Mời bạn nhập vào tên đệm giảng viên " + (i + 1) + " : ");
            _arrGiaoViens[i].setTendem(_sc.nextLine());
            System.out.print("Mời bạn nhập vào họ tên giảng viên " + (i + 1) + " : ");
            _arrGiaoViens[i].setHoten(_sc.nextLine());
            System.out.print("Mời bạn nhập vào mã giảng viên " + (i + 1) + " : ");
            _arrGiaoViens[i].setMagv(_sc.nextLine());
            System.out.print("Mời bạn nhập vào email1 giảng viên " + (i + 1) + " : ");
            _arrGiaoViens[i].setEmail1(_sc.nextLine());
            System.out.print("Mời bạn nhập vào email2 giảng viên " + (i + 1) + " : ");
            _arrGiaoViens[i].setEmail2(_sc.nextLine());
            System.out.print("Mời bạn nhập vào sdt giảng viên" + (i + 1) + " : ");
            _arrGiaoViens[i].setSdt(_sc.nextLine());
            System.out.print("Mời bạn nhập vào số giờ dạy giảng viên " + (i + 1) + " : ");
            _arrGiaoViens[i].setSogioday(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập vào chức vụ của giảng viên " + (i + 1) + " : ");
            _arrGiaoViens[i].setChucvu(_sc.nextLine());
        }
    }

    void inArrayListGiaoVien() {
        for (int i = 0; i < _arrGiaoViens.length; i++) {
            _arrGiaoViens[i].inThongTinGiangVien();
        }
    }

    void themGiaoVienList() {
        int size;
        System.out.print("Mời bạn nhập vào số lượng giáo viên: ");
        size = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < size; i++) {
            _g = new GiaoVien();
            System.out.print("Mời bạn nhập vào tên giảng viên: ");
            _g.setTen(_sc.nextLine());
            System.out.print("Mời bạn nhập vào tên đệm giảng viên: ");
            _g.setTendem(_sc.nextLine());
            System.out.print("Mời bạn nhập vào họ tên giảng viên: ");
            _g.setHoten(_sc.nextLine());
            System.out.print("Mời bạn nhập vào mã giảng viên: ");
            _g.setMagv(_sc.nextLine());
            System.out.print("Mời bạn nhập vào email1 giảng viên: ");
            _g.setEmail1(_sc.nextLine());
            System.out.print("Mời bạn nhập vào email2 giảng viên: ");
            _g.setEmail2(_sc.nextLine());
            System.out.print("Mời bạn nhập vào sdt giảng viên: ");
            _g.setSdt(_sc.nextLine());
            System.out.print("Mời bạn nhập vào số giờ dạy giảng viên: ");
            _g.setSogioday(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập vào chức vụ của giảng viên: ");
            _g.setChucvu(_sc.nextLine());
            _1stGiaoVien.add(_g);
        }
    }
    void getListGiaoVien(){
        for (int i = 0; i < _1stGiaoVien.size(); i++) {
            _1stGiaoVien.get(i).inThongTinGiangVien();
        }
    }
}
