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
public class ServiceMeo {

    Scanner _sc = new Scanner(System.in);
    Meo[] _arrMeos;
    List<Meo> _1stMeo = new ArrayList<>();
    Meo _m;

    public ServiceMeo() {
    }

    // tạo 1 thông tin mèo bằng 2 cách
    void tao1ThongTinMeoBang2Cach() {
//        cách 1: contructor có tham số
        Meo m1 = new Meo("Nghèo", 7, "Nhà tôi", "cái", "22/03/2014");
//        cách 2: contructor không tham số
        Meo m2 = new Meo();
        m2.setTen("Giàu");
        m2.setTuoi(4);
        m2.setDiachi("Vẫn là nhà tôi");
        m2.setGioitinh("đực");
        m2.setNgaysinh("07/04/2017");

        m1.inThongTinMeo();
        m2.inThongTinMeo();
    }
//   tạo 1 đối tượng do người dùng nhập vào

    void tao1ThongTinMeoDoNguoiDungNhap() {
        Meo m3 = new Meo();
        System.out.print("Mời bạn nhập vào tên mèo: ");
        m3.setTen(_sc.nextLine());
        System.out.print("Mời bạn nhập vào tuổi mèo: ");
        m3.setTuoi(Integer.parseInt(_sc.nextLine()));
        System.out.print("Mời bạn nhập vào địa chỉ của mèo: ");
        m3.setDiachi(_sc.nextLine());
        System.out.print("Mời bạn nhập vào giới tính của mèo: ");
        m3.setGioitinh(_sc.nextLine());
        System.out.print("Mời bạn nhập vào ngày sinh của mèo: ");
        m3.setNgaysinh(_sc.nextLine());

        m3.inThongTinMeo();
    }
//    sử dụng arraylist

    void taoMangMeo() {
        int size;
        System.out.print("Mời bạn nhập vào số lượng mèo: ");
        size = Integer.parseInt(_sc.nextLine());
        _arrMeos = new Meo[size];
        for (int i = 0; i < _arrMeos.length; i++) {
            _arrMeos[i] = new Meo();
            System.out.print("Mời bạn nhập vào tên mèo: ");
            _arrMeos[i].setTen(_sc.nextLine());
            System.out.print("Mời bạn nhập vào tuổi mèo: ");
            _arrMeos[i].setTuoi(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập vào địa chỉ của mèo: ");
            _arrMeos[i].setDiachi(_sc.nextLine());
            System.out.print("Mời bạn nhập vào giới tính của mèo: ");
            _arrMeos[i].setGioitinh(_sc.nextLine());
            System.out.print("Mời bạn nhập vào ngày sinh của mèo: ");
            _arrMeos[i].setNgaysinh(_sc.nextLine());
        }
    }

    void inRaManHinhArrayListMeo() {
        for (int i = 0; i < _arrMeos.length; i++) {
            _arrMeos[i].inThongTinMeo();
        }
    }

    void themMeoList() {
        int size;
        System.out.print("Mời bạn nhập vào số lượng mèo: ");
        size = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < size; i++) {
            _m = new Meo();
            System.out.print("Mời bạn nhập vào tên mèo: ");
            _m.setTen(_sc.nextLine());
            System.out.print("Mời bạn nhập vào tuổi mèo: ");
            _m.setTuoi(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập vào địa chỉ của mèo: ");
            _m.setDiachi(_sc.nextLine());
            System.out.print("Mời bạn nhập vào giới tính của mèo: ");
            _m.setGioitinh(_sc.nextLine());
            System.out.print("Mời bạn nhập vào ngày sinh của mèo: ");
            _m.setNgaysinh(_sc.nextLine());
            _1stMeo.add(_m);
        }
    }
    void getListMeo(){
        for (int i = 0; i < _1stMeo.size(); i++) {
            _1stMeo.get(i).inThongTinMeo();
        }
    }
}
