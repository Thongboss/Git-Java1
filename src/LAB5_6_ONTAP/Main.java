/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_6_ONTAP;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ServiceMeo m = new ServiceMeo();
        ServiceOTo o = new ServiceOTo();
        String input;
//        do {
//            System.out.println("------------Menu-------------");
//            System.out.println("1. thêm 5 mèo");
//            System.out.println("2. tìm kiếm mèo theo tên");
//            System.out.println("3. tìm kiếm mèo theo năm sinh");
//            System.out.println("4. Sắp xếp tăng dần theo tên");
//            System.out.println("5. Sắp xếp tăng dần theo ns");
//            System.out.println("6. xuất thông tin");
//            System.out.println("7. thoát");
//            System.out.print("Mời bạn chọn chức năng: ");
//            input = sc.nextLine();
//            switch (input) {
//                case "1":
//                    m.them5Meo();
//                    System.out.println("thêm thành công!");
//                    break;
//                case "2":
//                    m.findMeoT();
//                    break;
//                case "3":
//                    m.findMeoA();
//                    break;
//                case "4":
//                    m.sortTen();
//                    break;
//                case "5":
//                    m.sortNS();
//                    break;
//                case "6":
//                    m.xuatThongTin();
//                    break;
//                case "7":
//                    System.out.println("Bạn chọn thoát!");
//                    break;
//                default:
//                    System.out.println("Chức năng không tồn tại!");
//            }
//        } while (!(input.equals("7")));
         
          do {
              System.out.println("-------------------Menu------------------");
              System.out.println("1. thêm 5 ô tô");
              System.out.println("2. xóa ô tô theo mã");
              System.out.println("3. xóa ô tô theo hãng");
              System.out.println("4. sắp xếp giảm dần theo mã");
              System.out.println("5. sắp xếp giảm dần theo giá tiền");
              System.out.println("6. xuất thông tin");
              System.out.println("7. thoát");
              System.out.print("Mời bạn chọn chức năng: ");
              input = sc.nextLine();
              switch (input) {
                  case "1":
                      o.them5OTo();
                      System.out.println("Thêm thành công!");
                      break;
                  case "2":
                      o.removeOTo();
                      break;
                  case "3":
                      o.removeH();
                      break;
                  case "4":
                      o.sortM();
                      break;
                  case "5":
                      o.sortG();
                      break;
                  case "6":
                      o.xuatThongTin();
                      break;
                  case "7":
                      System.out.println("bạn chọn thoát!");
                      break;
                  default:
                      System.out.println("Chức năng không tồn tại!");
              }
        } while (!(input.equals("7")));
        
        
    }
}
