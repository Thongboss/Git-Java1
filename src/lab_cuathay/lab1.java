/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_cuathay;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
         System.out.println("----------Chương trình 1-----------");
         System.out.println("  1. In bảng cửu chương đơn    ");
         System.out.println("  2. In bảng cửu chương theo khoảng");
         System.out.println("  3. Kiểm tra học lực sinh viên Fpoly");
         System.out.println("  4. Nhập thông tin người yêu cũ ");
         System.out.println("  5. Thoát.");
         String nhap;
         System.out.print("Mời bạn chọn chức năng: ");
         nhap = sc.nextLine();
         switch (nhap) {
            case "1":
                int a;
                System.out.print("Bạn muốn in bảng cửu chương: ");
                a = Integer.parseInt(sc.nextLine());
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d x %d = %d\n",a,i,a*i);
                }
                break;
            case "2":
                int e,d;
                System.out.print("Bạn muốn in từ bảng cửu chương: ");
                e = Integer.parseInt(sc.nextLine());
                System.out.print("đến bảng cửu chương: ");
                d = Integer.parseInt(sc.nextLine());
//                cách 1:
//                if (e <= d) {
//                    for (int i = e; i <= d; i++) {
//                    for (int j = 1; j <= 10; j++) {
//                        System.out.printf("%d x %d = %d\n",i,j,i*j);
//                    }
//                    System.out.println("");
//                }
//                }else{
//                    for (int i = d; i <= e; i++) {
//                    for (int j = 1; j <= 10; j++) {
//                        System.out.printf("%d x %d = %d\n",i,j,i*j);
//                    }
//                    System.out.println("");
//                }
//                        }
//                cách 2:
                if ( d < e ) {
                    int temp = e;
                    e = d;
                    d = temp;
                    }
                for (int i = e; i <= d; i++) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.printf("%d x %d = %d\n",i,j,i*j);
                    }
                    System.out.println("");
                }
                break;
            case "3":
                Float mark;
                System.out.println("Mời bạn nhập vào điểm tb môn C : ");
                mark = Float.parseFloat(sc.nextLine());
                if (0 <= mark && mark <= 10) {
                    if (mark >= 9) {
                        System.out.println("Bạn là sinh viên xuất sắc!");
                    }
                    else if(mark >= 8){
                        System.out.println("Bạn là sinh viên giỏi!");
                    }
                    else if(mark >= 7){
                        System.out.println("Bạn là sinh viên khá!");
                    }
                    else if(mark >= 5){
                        System.out.println("Bạn là sinh viên trung bình!");
                    }else{
                        System.out.println("Bạn chưa qua môn!");
                    }
                }else{
                    System.out.println("Mời bạn nhập lại điểm từ 0 đến 10!");
                }
                break;
            case "4":
                int n;
                System.out.print("Mời bạn nhập vào số người yêu cũ: ");
                n = Integer.parseInt(sc.nextLine());
                String[] arrname = new String[n] ;
                String[] arrgioitinh = new String[n];
                int[] arryear = new int[n];
                int[] arrage = new int[n];
                int[] arrtall = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("mời bạn nhập vào thông tin nyc thứ "+(i+1));
                    System.out.print("Mời bạn nhập vào tên: ");
                    arrname[i] = sc.nextLine();
                    System.out.print("Mời bạn nhập vào năm sinh: ");
                    arryear[i] = Integer.parseInt(sc.nextLine());
                    System.out.print("Mời bạn nhập vào tuổi: ");
                    arrage[i] = Integer.parseInt(sc.nextLine());
                    System.out.print("Mời bạn nhập vào giới tính: ");
                    arrgioitinh[i] = sc.nextLine();
                    System.out.print("Mời bạn nhập vào chiều cao đơn vị centimet: ");
                    arrtall[i] = Integer.parseInt(sc.nextLine());
                }
                System.out.println("Thông tin của các nàng nyc lần lượt là: ");
                System.out.println("");
                for (int i = 0; i < n; i++) {
                    System.out.println("nyc thứ "+(i+1));
                    System.out.println("tên: "+arrname[i]);
                    System.out.println("năm sinh: "+arryear[i]);
                    System.out.println("tuổi: "+arrage[i]);
                    System.out.println("giới tính: "+arrgioitinh[i]);
                    System.out.println("chiều cao: "+arrtall[i]+" centimeters");
                    System.out.println("");
                }
                break;
            case "5":
                System.out.println("Bạn đã chọn thoát!");
                System.exit(0);
                break;
            default:
                System.out.println("Bạn k chọn chức năng trong chương trình!");
        }
        }
    }
}
