/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB34;

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
    SinhVien _sv1 = new SinhVien();
    
    void them1SinhVienKhongThamSo(){
        _sv1.setTen(getInputValue("tên: "));
        _sv1.setMasv(getInputValue("mã sv: "));
        _sv1.setDiemjava(Double.parseDouble(getInputValue("điểm java: ")));
        _sv1.setDiemcsharp(Double.parseDouble(getInputValue("điểm scharp: ")));
    }
    
    void themSinhVienList(){
        int size;
        size = Integer.parseInt(getInputValue("số lượng: "));
        for (int i = 0; i < size; i++) {
            _sv = new SinhVien();
            _sv.setTen(getInputValue("tên: "));
            _sv.setMasv(getInputValue("mã sv: "));
            _sv.setDiemjava(Double.parseDouble(getInputValue("điểm java: ")));
            _sv.setDiemcsharp(Double.parseDouble(getInputValue("điểm csharp: ")));
            _1stSinhVien.add(_sv);
        }
    }
    void inThongTinSinhVien(){
        _sv1.inRaManHinh();
        for (int i = 0; i < _1stSinhVien.size(); i++) {
            _1stSinhVien.get(i).inRaManHinh();
        }
    }
    String getInputValue(String text){
        System.out.println("Mời bạn nhập "+text);
        return _sc.nextLine();
    }
}
