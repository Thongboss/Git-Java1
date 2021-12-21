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
public class ServiceDongVat {

    Scanner _sc = new Scanner(System.in);
    DongVat[] _arrDongVats;
    List<DongVat> _1stDongVat = new ArrayList<>();
    DongVat _d;

    public ServiceDongVat() {
    }
//    tạo 1 thông tin động vật bằng 2 cách

    void tao1ThongTinDongvatBang2Cach() {
//        cách 1: contructor có tham số
        DongVat d1 = new DongVat("GA033", "động vật lông vũ", "chim", "đồi núi", "tạp chất");
//          cách 2: contructor không tham số
        DongVat d2 = new DongVat();
        d2.setMadv("CHO12");
        d2.setTenloai("động vật có vú");
        d2.setGiongloai("chó bắc mỹ");
        d2.setKhuvucsong("bắc mỹ");
        d2.setThucan("thịt");

        d1.inThongTinDongVat();
        d2.inThongTinDongVat();
    }
//    tạo 1 thông tin động vật do người dùng nhập

    void tao1ThongTinDoNguoiDungNhap() {
        DongVat d3 = new DongVat();
        System.out.print("Mời bạn nhập vào mã động vật: ");
        d3.setMadv(_sc.nextLine());
        System.out.print("Mời bạn nhập vào tên loài: ");
        d3.setTenloai(_sc.nextLine());
        System.out.print("Mời bạn nhập vào giống loài: ");
        d3.setGiongloai(_sc.nextLine());
        System.out.print("Mời bạn nhập vào khu vực sống: ");
        d3.setKhuvucsong(_sc.nextLine());
        System.out.print("Mời bạn nhập vào thức ăn: ");
        d3.setThucan(_sc.nextLine());

        d3.inThongTinDongVat();
    }
//    sử dụng arraylist

    void taoMangDongVat() {

        int size;
        System.out.print("Mời bạn nhập vào số động vật: ");
        size = Integer.parseInt(_sc.nextLine());
        _arrDongVats = new DongVat[size];
        for (int i = 0; i < _arrDongVats.length; i++) {
            _arrDongVats[i] = new DongVat();
            System.out.print("Mời bạn nhập vào mã động vật thứ " + (i + 1) + " : ");
            _arrDongVats[i].setMadv(_sc.nextLine());
            System.out.print("Mời bạn nhập vào tên loài thứ " + (i + 1) + " : ");
            _arrDongVats[i].setTenloai(_sc.nextLine());
            System.out.print("Mời bạn nhập vào giống loài thứ " + (i + 1) + " : ");
            _arrDongVats[i].setGiongloai(_sc.nextLine());
            System.out.print("Mời bạn nhập vào khu vực sống thứ " + (i + 1) + " : ");
            _arrDongVats[i].setKhuvucsong(_sc.nextLine());
            System.out.print("Mời bạn nhập vào thức ăn thứ " + (i + 1) + " : ");
            _arrDongVats[i].setThucan(_sc.nextLine());
        }
    }

    void inArrayListDongVat() {
        for (int i = 0; i < _arrDongVats.length; i++) {
            _arrDongVats[i].inThongTinDongVat();
        }
    }

    void themDongVatList() {
        int size;
        System.out.print("Mời bạn nhập vào số lượng động vật: ");
        size = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < size; i++) {
            _d = new DongVat();
            System.out.print("Mời bạn nhập vào mã động vật: ");
            _d.setMadv(_sc.nextLine());
            System.out.print("Mời bạn nhập vào tên loài: ");
            _d.setTenloai(_sc.nextLine());
            System.out.print("Mời bạn nhập vào giống loài: ");
            _d.setGiongloai(_sc.nextLine());
            System.out.print("Mời bạn nhập vào khu vực sống: ");
            _d.setKhuvucsong(_sc.nextLine());
            System.out.print("Mời bạn nhập vào thức ăn: ");
            _d.setThucan(_sc.nextLine());
            _1stDongVat.add(_d);
        }
    }

    void getListDongVat() {
        for (int i = 0; i < _1stDongVat.size(); i++) {
            _1stDongVat.get(i).inThongTinDongVat();
        }
    }
}
