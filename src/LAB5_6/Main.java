/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_6;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ServiceSinhVien sv = new ServiceSinhVien();
        ServiceKeToan kt = new ServiceKeToan();
        String input;
//        do {
//            System.out.println("---------------MENU-------------");
//            System.out.println("1. thêm 5 sinh viên");
//            System.out.println("2. tìm kiếm sinh viên theo mã");
//            System.out.println("3. sắp xếp danh sách tăng dần theo mã");
//            System.out.println("4. thoát!");
//            System.out.print("Mời bạn chọn chức năng: ");
//            input = sc.nextLine();
//            switch (input) {
//                case "1":
//                    sv.them5SinhVienKhongThamSo();
//                    break;
//                case "2":
//                    sv.findSinhVien();
//                    break;
//                case "3":
//                    sv.sortSinhVien();
//                    break;
//                case "4":
//                    System.out.println("bạn chọn thoát!");
//                    break;
//                default:
//                    System.out.println("Chức năng không tồn tại!");
//            }
//            
//        } while (!(input.equals("4")));
          do {
              System.out.println("------------------MENU----------------");
              System.out.println("1. thêm 5 kế toán");
              System.out.println("2. xóa kế toán theo id");
              System.out.println("3. sắp xếp kế toán giảm dần theo id");
              System.out.println("4. thoát!");
              System.out.print("Mời bạn chọn chức năng: ");
              input = sc.nextLine();
              switch (input) {
                  case "1":
                      kt.them5KeToanCoThamSo();
                      break;
                  case "2":
                      kt.removeKeToan();
                      break;
                  case "3":
                      kt.sortKeToan();
                      break;
                  case "4":
                      System.out.println("Bạn chọn thoát!");
                      break;
                  default:
                      System.out.println("Chức năng không tồn tại!");
              }
            
        } while (!(input.equals("4")));
        
        
    }
}
