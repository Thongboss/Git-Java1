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
public class ServiceNguoi {

    Scanner _sc = new Scanner(System.in);
    Nguoi[] _arrNguois;// khai báo mảng người
    List<Nguoi> _1stNguoi = new ArrayList<>();
    Nguoi _n;

    public ServiceNguoi() {
    }
//    tạo 1 sinh viên bằng 2 cách

    void tao1NguoiBang2Cach() {
        //    cách 1: contructor không tham số
        Nguoi n1 = new Nguoi();
        n1.setTen("Thông");
        n1.setSdt("0368443774");
        n1.setDiachi("Nghệ An");
        n1.setNamsinh(1999);
        n1.setQuequan("Đô Lương");
        n1.setTrinhdo("Cao Đẳng");
//        casch2: contructor có tham số
        Nguoi n2 = new Nguoi("Thái", "0357412435", "Thái Bình", 2002, "Thái bình", "Cao Đẳng");

        n1.inThongTinNguoi();
        n2.inThongTinNguoi();
    }
//    tạo 1 đối tượng do người dùng nhập vào

    void tao1DoiTuongDoNguoiDungNhap() {
        Nguoi n3 = new Nguoi();
        System.out.print("Mời bạn nhập vào tên: ");
        n3.setTen(_sc.nextLine());
        System.out.print("Mời bạn nhập vào số điện thoại: ");
        n3.setSdt(_sc.nextLine());
        System.out.print("Mời bạn nhập vào địa chỉ: ");
        n3.setDiachi(_sc.nextLine());
        System.out.print("Mời bạn nhập vào năm sinh: ");
        n3.setNamsinh(Integer.parseInt(_sc.nextLine()));
        System.out.print("Mời bạn nhập quê quán: ");
        n3.setQuequan(_sc.nextLine());
        System.out.print("Mời bạn nhập trình độ: ");
        n3.setTrinhdo(_sc.nextLine());

        n3.inThongTinNguoi();
    }
//     sử dụng arraylist người

    void taoMangNguoi() {
        int size;
        System.out.print("Mời bạn nhập vào số lượng người: ");
        size = Integer.parseInt(_sc.nextLine());
        // khởi tạo mảng người sau khi người dùng nhập
        _arrNguois = new Nguoi[size];
        for (int i = 0; i < _arrNguois.length; i++) {
            _arrNguois[i] = new Nguoi();
            System.out.print("Mời bạn nhập vào tên người thứ " + (i + 1) + " : ");
            _arrNguois[i].setTen(_sc.nextLine());
            System.out.print("Mời bạn nhập vào số điện thoại người thứ " + (i + 1) + " : ");
            _arrNguois[i].setSdt(_sc.nextLine());
            System.out.print("Mời bạn nhập vào địa chỉ người thứ " + (i + 1) + " : ");
            _arrNguois[i].setDiachi(_sc.nextLine());
            System.out.print("Mời bạn nhập vào năm sinh người thứ " + (i + 1) + " : ");
            _arrNguois[i].setNamsinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập quê quán người thứ " + (i + 1) + " : ");
            _arrNguois[i].setQuequan(_sc.nextLine());
            System.out.print("Mời bạn nhập trình độ người thứ " + (i + 1) + " : ");
            _arrNguois[i].setTrinhdo(_sc.nextLine());
        }
    }

    void inArrayListNguoi() {
        for (int i = 0; i < _arrNguois.length; i++) {
            _arrNguois[i].inThongTinNguoi();
        }
    }

    void themNguoiList() {
        int size;
        System.out.print("Mời bạn nhập vào số người: ");
        size = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < size; i++) {
            _n = new Nguoi();
            System.out.print("Mời bạn nhập vào tên: ");
            _n.setTen(_sc.nextLine());
            System.out.print("Mời bạn nhập vào số điện thoại: ");
            _n.setSdt(_sc.nextLine());
            System.out.print("Mời bạn nhập vào địa chỉ: ");
            _n.setDiachi(_sc.nextLine());
            System.out.print("Mời bạn nhập vào năm sinh: ");
            _n.setNamsinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập quê quán: ");
            _n.setQuequan(_sc.nextLine());
            System.out.print("Mời bạn nhập trình độ: ");
            _n.setTrinhdo(_sc.nextLine());
            _1stNguoi.add(_n);
        }
    }
    void getListNguoi(){
        for (int i = 0; i < _1stNguoi.size(); i++) {
            _1stNguoi.get(i).inThongTinNguoi();
        }
    }

}
