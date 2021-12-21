/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_nhapdulieu_java.newpackage;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class BaitapDemo_Lab1 {
    public static void main(String[] args) {
//   demo 1
        System.out.println("Demo 1 slide 1:");
       int a=5,b=7,c;
       c = a + b;
        System.out.println("tổng là: " +c);
//        Demo 2
        System.out.println("Demo 2 slide 1:");
        Scanner sc = new Scanner(System.in);
        double x,y,z,tb;
        System.out.println("xin mời bạn nhập vào điểm từng môn lần lượt: ");
        x = Double.parseDouble(sc.nextLine());
        y = Double.parseDouble(sc.nextLine());
        z = Double.parseDouble(sc.nextLine());
        tb = (2*x + b +c) / 4 ;
        System.out.println("điểm trung bình là: "+ tb);
//        Demo 3
        String hoten;
        int tuoi;
        System.out.println("xin mời bạn nhập vào họ tên: ");
        hoten = sc.nextLine();
        System.out.println("xin mời bạn nhập vào tuổi: ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.print(hoten + " năm nay " + tuoi);
        System.out.print("tuổi\n");
        System.out.println(hoten + " năm nay " + tuoi + "tuổi");
        System.out.printf(" %s năm nay %d tuổi",hoten,tuoi); 
    }
}
