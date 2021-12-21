/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THEM_SUA_XOA_DOITUONG;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceStudent sv = new ServiceStudent();
        String input;
        do {
            System.out.println("------------menu------------");
            System.out.println("1.Thêm");
            System.out.println("2.Sửa");
            System.out.println("3.Xóa");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Xuất ds");
            System.out.println("6. Sắp xếp");
            System.out.println("7. Thoát");
            System.out.print("Mời bạn chọn chức năng: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    sv.addStudent();
                    break;
                case "2":
                    sv.editStudent();
                    break;
                case "3":
                    sv.removeStudent();
                    break;
                case "4":
                    sv.findStudent();
                    break;
                case "5":
                    sv.getListStudent();
                    break;
                case "6":
                    sv.sortStudent();
                    break;
                case "7":
                    System.out.println("Tạm biệt");
                    break;
                default:
                    System.out.println("Chức năng không tồn tại");
            }
            
        } while (!(input.equals("7")));
        
    }
}
