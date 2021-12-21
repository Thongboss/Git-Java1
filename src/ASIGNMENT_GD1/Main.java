/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASIGNMENT_GD1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceDanhba db = new ServiceDanhba();
        String input;
        do {
            System.out.println("Chương trình quản lý danh bạ Fpoly!");
            System.out.println("1. ADD 15 danh bạ tạo sẵn");
            System.out.println("2. Thêm");
            System.out.println("3. Sửa");
            System.out.println("4. Xóa");
            System.out.println("5. In thông tin danh bạ");
            System.out.println("6. Tìm kiếm theo tên");
            System.out.println("7. sắp xếp danh bạ theo tên");
            System.out.println("8. Thoát");
            System.out.println("9. tìm kiếm gần đúng theo SDT");
            System.out.println("10. tìm kiếm gần đúng theo tên");
            System.out.print("Mời bạn chọn chức năng: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    db.them15DB();
                    System.out.println("Thêm danh sách thành công!");
                    break;
                case "2":
                    db.addDB();
                    break;
                case "3":
                    db.editDB();
                    break;
                case "4":
                    db.removeDB();
                    break;
                case "5":
                    System.out.println("List danh bạ: ");
                    db.getListDanhBa();
                    break;
                case "6":
                    db.findDB();
                    break;
                case "7":
                    db.sortDB();
                    break;
                case "8":
                    System.out.println("Bạn đã thoát chương trình!");
                    break;
                case "9":
                    db.timGanDungSDT();
                    break;
                case "10":
                    db.timGanDungTen();
                    break;
                default:
                    System.out.println("Chức năng không tồn tại!Mời chọ lại!");
            }
            System.out.println("");
        } while (!(input.equals("8")));
        
    }
}
