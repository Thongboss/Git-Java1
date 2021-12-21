/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_lamquenvoi_java;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class lab1 {
    public static void main(String[] args) {
//        bài 1 lab1
        Scanner sc = new Scanner(System.in);
        String hoten;
        Float diem;
        System.out.print("mời bạn nhập vào tên: ");
        hoten = sc.nextLine();
        System.out.print("mời bạn nhập vào điểm: ");
        diem = Float.parseFloat(sc.nextLine());
        System.out.println("Sinh viên " + hoten +" có " +diem +" điểm");
//        bai2 lab1
        int chieurong,chieudai,chuvi,dientich;
        System.out.print("Mời bạn nhập vào chiều rộng: ");
        chieurong = Integer.parseInt(sc.nextLine());
        System.out.print("Mời bạn nhập vào chiều dài: ");
        chieudai = Integer.parseInt(sc.nextLine());
        chuvi = ( chieurong + chieudai ) * 2 ;
        dientich = chieurong * chieudai ;
        System.out.println("chu vi là: " +chuvi);
        System.out.println("diện tích là: " +dientich);
        System.out.println("cạnh nhỏ nhất là: " +Math.min(chieurong,chieudai));
//        bài 3 lab1
        int canh;
        System.out.println("Mời bạn nhập vào độ dài cạnh: ");
        canh = Integer.parseInt(sc.nextLine());
        System.out.println("thể tích khối lập phương là: " +Math.pow(canh,3));
//        bài 4 lab1
        Float a,b,c,delta;
        System.out.println("Mời bạn nhập vào lần lượt hệ số của phương trình: ");
        a = Float.parseFloat(sc.nextLine());
        b = Float.parseFloat(sc.nextLine());
        c = Float.parseFloat(sc.nextLine());
        delta = b*b - 4*(a*c);
        System.out.println("căn delta của phương trình bạn nhập là: " +Math.sqrt(delta));
    }
}
