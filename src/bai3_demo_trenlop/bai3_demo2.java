/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_demo_trenlop;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class bai3_demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nhap;
        System.out.println("MENU:");
        System.out.println("a.phép cộng");
        System.out.println("b.phép trừ");
        System.out.println("c.phép nhân");
        System.out.println("d.phép chia");
        System.out.print("Mời bạn chọn chức năng: ");
        nhap = sc.nextLine();
        switch (nhap) {
            case "a":
                System.out.println("phép cộng");
                break;
            case "b":
                System.out.println("phép trừ");
                break;
            case "c":
                System.out.println("phép nhân");
                break;
            case "d":
                System.out.println("phép chia");
                break;
            default:
                System.out.println("Bạn chọn sai chương trình!");
        }
    }
}
