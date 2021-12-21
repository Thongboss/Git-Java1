/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB34;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ServiceSinhVien sv = new ServiceSinhVien();/
        ServiceKeToan kt = new ServiceKeToan();
        double a=2.4,b=2,c= -25;
        double po =  Math.round(a);
        System.out.println(po);
        
//        while (true) {
//            String nhap;
//            System.out.println("-----------MENU-----------");
//            System.out.println("1.thêm sinh viên bằng contructor không tham số");
//            System.out.println("2.thêm sinh list viên ");
//            System.out.println("3.xuất thông tin sinh viên ");
//            System.out.println("4.thoát");
//            System.out.print("Mời bạn chọn chức năng: ");
//            nhap = sc.nextLine();
//            switch (nhap) {
//                case "1":
//                    System.out.println("Bạn chọn chức năng 1: ");
//                    sv.them1SinhVienKhongThamSo();
//                    break;
//                case "2":
//                    System.out.println("Bạn chọn chức năng 2: ");
//                    sv.themSinhVienList();
//                    break;
//                case "3":
//                    System.out.println("Bạn chọn chức năng 3: ");
//                    sv.inThongTinSinhVien();
//                    break;
//                case "4":
//                    System.out.println("bạn chọn thoát!");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Bạn chọn sai! Mời chọn lại!");
//            }
//        }

          while (true) {
          String nhap;
              System.out.println("---------------MENU--------------");
              System.out.println("1. thêm 1 kế toán bằng contructor có tham số");
              System.out.println("2. thêm nhiều kế toán");
              System.out.println("3. in thông tin kế toán");
              System.out.println("4. thoát!");
              System.out.print("Mời bạn chọ chức năng: ");
              nhap = sc.nextLine();
              switch (nhap) {
                  case "1":
                      System.out.println("Bạn chọn chức năng 1!");
                      kt.them1KeToanBangCoThamSo();       
                      break;
                  case "2":
                      System.out.println("Bạn chọn chức năng 2!");
                      kt.themKeToanList();
                      break;
                  case "3":
                      System.out.println("Bạn chọn chức năng 3!");
                      kt.inThongTinKeToan();
                      break;
                  case "4":
                      System.out.println("Bạn chọn thoát!");
                      System.exit(0);
                      break;
                  default:
                      System.out.println("Bạn chọn sai! Mời chọ lại!");
              }
        }
    }
}
