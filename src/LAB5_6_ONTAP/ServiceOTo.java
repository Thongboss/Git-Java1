/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_6_ONTAP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiceOTo {
    Scanner _sc = new Scanner(System.in);
    List<OTo> _1stOto = new ArrayList<>();
    
    void them5OTo(){
        OTo o1 = new OTo(153,450000,"vinfart",true,"dầu thô");
        OTo o2 = new OTo(154,950000,"huyndai",false,"dầu nhờn");
        OTo o3 = new OTo(155,650000,"ronroy",false,"xăng");
        OTo o4 = new OTo(156,890000,"vinfart",true,"điện");
        OTo o5 = new OTo(157,530000,"vinfart",true,"nước");
        
        _1stOto.add(o1);
        _1stOto.add(o2);
        _1stOto.add(o3);
        _1stOto.add(o4);
        _1stOto.add(o5);
    }
    void removeOTo(){
        if (_1stOto.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return;
        }
        int temp = getIndexM(Integer.parseInt(getInputValue("mã ô tô muốn xóa: ")));
        if (temp == -1) {
            System.out.println("mã bạn tìm không có trong danh sách.");
            return;
        }
        _1stOto.remove(temp);
        System.out.println("Xóa thành công!");
    }
    void removeH(){
        if (_1stOto.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return;
        }
        int temp = getIndexH(getInputValue("hãng xe muốn xóa: "));
        if (temp == -1) {
            System.out.println("hãng bạn tìm không có trong danh sách.");
            return;
        }
        _1stOto.remove(temp);
        System.out.println("Xóa thành công!");
    }
    void sortM(){
        _1stOto.sort((OTo d1 , OTo d2) -> d2.getMa()-d1.getMa());
        inDS(_1stOto);
    }
//    void sortG(){
//        if (_1stOto.isEmpty()) {
//            System.out.println("Danh sách đang rỗng!");
//            return;
//        }
//       _1stOto.sort((OTo o1 , OTo o2) -> o2.getGiatien()-o1.getGiatien());
//        inDS(_1stOto);
//    }
    void sortG(){
        Collections.sort(_1stOto, Comparator.comparing(OTo::getGiatien));
        Collections.reverse(_1stOto);
        inDS(_1stOto);
    }
    void xuatThongTin(){
        inDS(_1stOto);
    }
    
    String getInputValue(String text){
        System.out.println("Mời bạn nhập "+text);
        return _sc.nextLine();
    }
    int getIndexM(int ma){
        if (_1stOto.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return -1;
        }
        for (int i = 0; i < _1stOto.size(); i++) {
            if (ma == (_1stOto.get(i).getMa())) {
                return i;
            }
        }
        return -1;
    }
    int getIndexH(String hang){
        if (_1stOto.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return -1;
        }
        for (int i = 0; i < _1stOto.size(); i++) {
            if (hang.equalsIgnoreCase(_1stOto.get(i).getHang())) {
                return i;
            }
        }
        return -1;
    }
    void inDS(List<OTo> lst){
        if (_1stOto.isEmpty()) {
            System.out.println("Danh sách đamg rỗng!");
            return;
        }
        for (OTo x : lst) {
            x.inRaManHinh();
        }
    }
}
