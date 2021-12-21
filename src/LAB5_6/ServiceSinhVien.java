/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiceSinhVien {
    Scanner _sc = new Scanner(System.in);
    List<SinhVien> _1stSinhVien = new ArrayList<>();
    SinhVien _sv;
    
    void them5SinhVienKhongThamSo(){
        SinhVien sv1 = new SinhVien();
        sv1.setTen("Thong");
        sv1.setMa("PH13968");
        sv1.setDiemjava(9);
        sv1.setDiemcsharp(9);
        SinhVien sv2 = new SinhVien();
        sv2.setTen("Thai");
        sv2.setMa("PH15472");
        sv2.setDiemjava(9.4);
        sv2.setDiemcsharp(9.5);
        SinhVien sv3 = new SinhVien();
        sv3.setTen("Duc");
        sv3.setMa("PH11253");
        sv3.setDiemjava(9.2);
        sv3.setDiemcsharp(7.9);
        SinhVien sv4 = new SinhVien();
        sv4.setTen("Son");
        sv4.setMa("DH13579");
        sv4.setDiemjava(5.8);
        sv4.setDiemcsharp(7.3);
        SinhVien sv5 = new SinhVien();
        sv5.setTen("Tra");
        sv5.setMa("PH14725");
        sv5.setDiemjava(7.4);
        sv5.setDiemcsharp(5.2);
        
        _1stSinhVien.add(sv1);
        _1stSinhVien.add(sv2);
        _1stSinhVien.add(sv3);
        _1stSinhVien.add(sv4);
        _1stSinhVien.add(sv5);
        
        sv1.inRaManHinh();
        sv2.inRaManHinh();
        sv3.inRaManHinh();
        sv4.inRaManHinh();
        sv5.inRaManHinh();
    }
    void findSinhVien(){
        if (_1stSinhVien.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return;
        }
        int temp = getIndex(getInputValue("nhập mã sinh viên muốn tìm: "));
        if (temp == -1) {
            System.out.println("Sinh Viên bạn tìm không có trong Danh sách!");
            return;
        }
        _1stSinhVien.get(temp).inRaManHinh();
    }
    void sortSinhVien(){
        if (_1stSinhVien.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return;
        }
        _1stSinhVien.sort((o1,o2) -> o1.getMa().compareTo(o2.getMa()));
        System.out.println("Sắp xếp thành công!");
        inds(_1stSinhVien);
    }
    String getInputValue(String text){
        System.out.println("Mời bạn nhập "+text);
        return _sc.nextLine();
    }
    int getIndex(String ma){
        if (_1stSinhVien.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < _1stSinhVien.size(); i++) {
            if (ma.equalsIgnoreCase(_1stSinhVien.get(i).getMa())) {
                return i;
            }
        }
        return -1;
    }
    void inds(List<SinhVien> lst){
        if (_1stSinhVien.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return;
        }
        for (SinhVien x : lst) {
            x.inRaManHinh();
        }
    }
}
