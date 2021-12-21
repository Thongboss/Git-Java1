/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array_ArrayList_List;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class PhuongThucTraVeCoThamSo {
    Scanner _sc = new Scanner(System.in);
    
    public String[] getYears(){
//        Tạo 1 mảng 200 năm dạng String để in ra màn hình từ năm 1900
        String[] arrYears = new String[200];
        int temp = 1900;
        for (int i = 0; i < arrYears.length; i++) {
            arrYears[i] = String.valueOf(temp);//String.valueOf đưa số veef chuỗi
            temp++;
        }
        return arrYears;
    }
//    phương thức trả về dạng đối tượng
    public SinhVien getSV(){
        SinhVien sv = new SinhVien("thông","hn34578",2000,8.8);
        return sv;
    }
}
