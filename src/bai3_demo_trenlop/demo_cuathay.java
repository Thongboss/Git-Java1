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
public class demo_cuathay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double diem;
        System.out.print("Mời bạn nhập vào điểm: ");
        diem = Double.parseDouble(sc.nextLine());
        if (0<= diem && diem <= 10) {
        if (diem >= 9 && diem <= 10) {
            System.out.println("Bạn đạt sinh viên xuất sắc!");
        }else if (diem >= 8) {
            System.out.println("Bạn đạt sinh viên giỏi!");
        }else if (diem >= 7 ) {
            System.out.println("Bạn đạt học sinh khá!");
        }else if (diem >=5) {
            System.out.println("Bạn đạt học sinh trung bình!");
        }else{
            System.out.println("Bạn học lại!");
        }
    }else{
            System.out.println("Mời bạn nhập lại điểm từ 0 đến 10!");
    }
}
}
