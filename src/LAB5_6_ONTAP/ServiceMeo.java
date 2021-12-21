/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_6_ONTAP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiceMeo {
    Scanner _sc = new Scanner(System.in);
    List<Meo> _1stMeo = new ArrayList<>();
    
    void them5Meo(){
        Meo m1 = new Meo();
        m1.setTen("Cat");
        m1.setDiachi("Binh phuoc");
        m1.setGioitinh(true);
        m1.setNs(2017);
        Meo m2 = new Meo();
        m2.setTen("teo");
        m2.setDiachi("my tho");
        m2.setGioitinh(false);
        m2.setNs(2018);
        Meo m3 = new Meo();
        m3.setTen("heo");
        m3.setDiachi("sai gon");
        m3.setGioitinh(true);
        m3.setNs(2015);
        Meo m4 = new Meo();
        m4.setTen("lien");
        m4.setDiachi("binh dinh");
        m4.setGioitinh(false);
        m4.setNs(2020);
        Meo m5 = new Meo();
        m5.setTen("orn");
        m5.setDiachi("quang nam");
        m5.setGioitinh(true);
        m5.setNs(2019);
        
        _1stMeo.add(m1);
        _1stMeo.add(m2);
        _1stMeo.add(m3);
        _1stMeo.add(m4);
        _1stMeo.add(m5);
    }
    void findMeoT(){
        if (_1stMeo.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return;
        }
        int temp = getIndexT(getInputValue("tên mèo muốn tìm: "));
        if (temp == -1) {
            System.out.println("Tên mèo không tồn tại trong danh sách.");
            return;
        }
        _1stMeo.get(temp).inRaManHinh();
    }
    void findMeoA(){
        if (_1stMeo.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return;
        }
        int temp = getIndexA(Integer.parseInt(getInputValue("năm sinh mèo muốn tìm: ")));
        if (temp == -1) {
            System.out.println("năm sinh mèo không có trong danh sách.");
            return;
        }
        _1stMeo.get(temp).inRaManHinh();
    }
    void sortTen(){
        _1stMeo.sort((o1,o2) -> o1.getTen().compareTo(o2.getTen()));
        inDS(_1stMeo);
    }
    void sortNS(){
        _1stMeo.sort((Meo m1 , Meo m2) -> m1.getNs()-m2.getNs());
        inDS(_1stMeo);
    }
    
    String getInputValue(String text){
        System.out.print("Mời bạn nhập "+text);
        return _sc.nextLine();
    }
    void xuatThongTin(){
        inDS(_1stMeo);
    }
    private int getIndexT(String ten){
        if (_1stMeo.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return -1;
        }
        for (int i = 0; i < _1stMeo.size(); i++) {
            if (ten.equalsIgnoreCase(_1stMeo.get(i).getTen())) {
                return i;
            }
        }
        return -1;
    }
    private int getIndexA(int ns){
        if (_1stMeo.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return -1;
        }
        for (int i = 0; i < _1stMeo.size(); i++) {
            if (ns == (_1stMeo.get(i).getNs())) {
                return i;
            }
        }
        return -1;
    }
    void inDS(List<Meo> lst){
        if (_1stMeo.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return;
        }
        for (Meo x : lst) {
            x.inRaManHinh();
        }
    }
}
