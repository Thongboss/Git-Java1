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
public class nhapdulieu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ns;
        String ten,masv;
        
        System.out.print("Mời bạn nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Mời bạn nhập năm sinh: ");
        ns = Integer.parseInt(sc.nextLine());
        System.out.print("Mời bạn nhập mã sinh viên: ");
        masv = sc.nextLine();
        
        System.out.printf("chao ban: %s | %d |%s\n",ten ,ns ,masv);
        
        int so1,so2,so3,so4,so5;
        System.out.println("Mời bạn nhập vào 5 số nguyên: ");
        so1 = Integer.parseInt(sc.nextLine());
        so2 = Integer.parseInt(sc.nextLine());
        so3 = Integer.parseInt(sc.nextLine());
        so4 = Integer.parseInt(sc.nextLine());
        so5 = Integer.parseInt(sc.nextLine());
        System.out.println("Tổng của năm số bạn nhập là: "+(so1 + so2 +so3 +so4 +so5));
    }
}
