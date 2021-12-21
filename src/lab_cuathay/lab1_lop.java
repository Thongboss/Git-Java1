/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_cuathay;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class lab1_lop {
    static Scanner _sc = new Scanner(System.in);
    static List _lst = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {            
            menu();
        }
    }
    static void menu(){
        System.out.println("------------menu-------------");
        System.out.println("1. addList");
        System.out.println("2. loadList");
        System.out.println("3. Exit");
        String temp = getInput("chức năng");
        switch (Integer.parseInt(temp)) {
            case 1:
                addLst();
                break;
            case 2:
                loadLst();
                break;
            case 3:
                System.out.println("Thoát thành công");
                System.exit(0);
                break;
            default:
                System.out.println("Nhập sai vcl / nhập lại!");
        }
        
        
    }
    
    static String getInput(String input){
        System.out.printf("Xin mời nhập %s: ",input);
        return _sc.nextLine();
    }
    
    static void addLst() {
        _lst.add(getInput("Tên NYC"));
        _lst.add(Integer.parseInt(getInput("Tuổi NYC")));
        _lst.add(Integer.parseInt(getInput("số lần lén lút: ")));
    }
    
    static void loadLst() {
        for (int i = 0; i < _lst.size(); i++) {
            System.out.println(_lst.get(i));
        }
    }
}
