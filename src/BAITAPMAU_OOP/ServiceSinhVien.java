/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAITAPMAU_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiceSinhVien {

    Scanner _sc = new Scanner(System.in);
    SinhVien[] _arrSinhViens;//khai báo mảng sinh viên
    List<SinhVien> _1stSinhVien = new ArrayList<>();
    SinhVien _sv;

    public ServiceSinhVien() {
    }
    // bài 1: tạo 2 đối tượng sinh viên bằng 2 cách có tham số và ngược lại

    void bai1Tao2DoiTuong() {
        // cách 1:contructor có tham số
        SinhVien sv1 = new SinhVien("Long", "PH0000", 2000, 5.6);
        //cách 2:contructor không tham số
        SinhVien sv2 = new SinhVien();
        sv2.setTen("Hoang");
        sv2.setMsv("PH0001");
        sv2.setNamsinh(2000);
        sv2.setDiemjava(5.9);
        //in ra màn hình
        sv1.inRaManHinh();
        sv2.inRaManHinh();
    }

    //bài 2: tạo 1 đối tượng do người dùng nhập vào
    void bai2Tao1DoiTuongDoNguoiDungNhap() {

        SinhVien sv1 = new SinhVien();

        System.out.print("Mời bạn nhập vào tên: ");
        sv1.setTen(_sc.nextLine());
        System.out.print("Mời bạn nhập vào mã sv: ");
        sv1.setMsv(_sc.nextLine());
        System.out.print("Mời bạn nhập vào năm sinh: ");
        sv1.setNamsinh(Integer.parseInt(_sc.nextLine()));
        System.out.print("Mời bạn nhập vào điểm java: ");
        sv1.setDiemjava(Double.parseDouble(_sc.nextLine()));

        sv1.inRaManHinh();
    }
// bài 3: sử dụng arraylist sinh viên

    void bai3Tao1MangSinhVien() {

        int size;
        System.out.println("Mời bạn nhập vào số lượng sinh viên: ");
        size = Integer.parseInt(_sc.nextLine());
        // khởi tạo mảng sinhvien sau khi người dùng nhập
        _arrSinhViens = new SinhVien[size];
        for (int i = 0; i < _arrSinhViens.length; i++) {
            _arrSinhViens[i] = new SinhVien();// phải khởi tạo đối tượng theo index
            System.out.print("Mời bạn nhập vào tên: ");
            _arrSinhViens[i].setTen(_sc.nextLine());
            System.out.print("Mời bạn nhập vào mã sv: ");
            _arrSinhViens[i].setMsv(_sc.nextLine());
            System.out.print("Mời bạn nhập vào năm sinh: ");
            _arrSinhViens[i].setNamsinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập vào điểm java: ");
            _arrSinhViens[i].setDiemjava(Double.parseDouble(_sc.nextLine()));
        }
    }

    void inRaManHinhArraySinhVien() {
        for (int i = 0; i < _arrSinhViens.length; i++) {
            _arrSinhViens[i].inRaManHinh();
        }
    }

    void themSinhVienList() {
        int size;
        System.out.print("Mời bạn nhập vào số lượng sinh viên: ");
        size = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < size; i++) {
            _sv = new SinhVien();
            System.out.print("Mời bạn nhập vào tên: ");
            _sv.setTen(_sc.nextLine());
            System.out.print("Mời bạn nhập vào mã sv: ");
            _sv.setMsv(_sc.nextLine());
            System.out.print("Mời bạn nhập vào năm sinh: ");
            _sv.setNamsinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời bạn nhập vào điểm java: ");
            _sv.setDiemjava(Double.parseDouble(_sc.nextLine()));
            _1stSinhVien.add(_sv);// thêm đối tượng sau vòng chạy vào trong list
            
        }
    }
    void getListSinhVien(){
        for (int i = 0; i < _1stSinhVien.size(); i++) {
            _1stSinhVien.get(i).inRaManHinh();
        }
    }
}
