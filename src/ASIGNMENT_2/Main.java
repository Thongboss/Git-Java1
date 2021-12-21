/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASIGNMENT_2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceDanhBa db = new ServiceDanhBa();
        String input;
        do {
            System.out.println("-------------Menu----------");
            System.out.println("1. thêm người vào danh bạ");
            System.out.println("2. sửa người trong danh bạ");
            System.out.println("3. xóa người trong danh bạ");
            System.out.println("4. thêm người mặc định vào danh bạ");
            System.out.println("5. load TT");
            System.out.println("6. tìm kiếm theo tên");
            System.out.println("7. tìm kiếm gần đúng theo sdt");
            System.out.println("8. tìm kiếm gần đúng theo tên");
            System.out.println("9. sắp xếp");
            System.out.println("0. thoát");
            System.out.print("Mời bạn chọn chức năng: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    db.themNguoi();
                    break;
                case "2":
                    db.suaNguoi();
                    break;
                case "3":
                    db.xoaNguoi();
                    break;
                case "4":
                    db.them15DB();
                    break;
                case "5":
                    db.loadThongTin();
                    break;
                case "6":
                    db.timKiemNguoi();
                    break;
                case "7":
                    db.findGanDungSDT();
                    break;
                case "8":
                    db.findGanDungTen();
                    break;
                case "9":
                    db.sortNguoi();
                    break;
                case "0":
                    System.out.println("Bạn đã chọn thoát!");
                    break;
                default:
                    System.out.println("Chức năng không tồn tại!");
            }
        } while (!(input.equals("0")));
        
    }
}
