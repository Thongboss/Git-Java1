/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array_ArrayList_List;

import baiTap.main.SinhVien;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class PhuongThucKhongTraVe {
    Scanner _sc = new Scanner(System.in);
//    phần 1: phương thức k trả về không tham số
    public void tinhTong(){
        int a,b;
        System.out.print("Mời bạn nhập số thứ 1: ");
        a = Integer.parseInt(_sc.nextLine());
        System.out.print("Mời bạn nhập số thứ 2: ");
        b = Integer.parseInt(_sc.nextLine());
        System.out.println("Tổng 2 số: "+(a+b));
    }
//    phần 2: phương thức không trả về có tham số
//    không được đặt tên phương thức trùng với phương thức khác cùng kiểu
//    public void tinhtong(){}
    
//    ĐỌC TÍNH ĐA HÌNH --> NẠP CHỒNG PHƯƠNG THỨC
    public void tinhTong(int a,int b){
        System.out.println("Tổng 2 số: "+(a+b));
    }
    public void tinhTong(int a,int b,int c){
        System.out.println("Tổng 2 số: "+(a+b+c));
    }
    public void tinhTong(int a,int b,int c,int d){
        System.out.println("Tổng 2 số: "+(a+b+c+d));
    }
//     có thể truyền rất nhiều kiểu dữ liệu khác nhau vào phương thức
    public void method1(int[] arrNumber,SinhVien sv,List<SinhVien> lstSinhVien,String name){
        
    }
}
