/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package THEM_SUA_XOA_DOITUONG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiceStudent {

    Scanner _sc = new Scanner(System.in);
    List<Student> _1stStudent = new ArrayList<>();
    Student _Student;
    String _input;

    public ServiceStudent() {
        Student st1 = new Student("PH1", 5, "hoàng", "0123", "hoang@gmail");
        Student st2 = new Student("PH2", 5, "long", "0124", "long@gmail");
        _1stStudent.add(st1);
        _1stStudent.add(st2);
    }

    public void addStudent() {
        _input = getInputValue(" số lượng sinh viên: ");
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _Student = new Student();
            _Student.setTen(getInputValue(" tên: "));
            _Student.setSdt(getInputValue(" số điện thoại: "));
            _Student.setEmail(getInputValue(" email: "));
            _Student.setMsv(getInputValue(" mã sinh viên: "));
            _Student.setDiemjava(Double.parseDouble(getInputValue(" điểm java: ")));
            _1stStudent.add(_Student);
        }
    }

    public String getInputValue(String text) {
        System.out.println("Mời bạn nhập" + text);
        return _sc.nextLine();
    }

    public void getListStudent() {//chức năng xuất danh sách sinh viên
        inDs(_1stStudent);
    }

    public void findStudent() {
        _input = getInputValue(" mã sinh viên cần tìm: ");
        int temp = getIndexObj(_input);
        if (temp == -1) {
            System.out.println("không tìm thấy mã sinh viên!");
            return;
        }
        _1stStudent.get(temp).inRaManHinh();
    }

    public void removeStudent() {
        _input = getInputValue(" mã sinh viên cần xóa: ");
        int temp = getIndexObj(_input);
        if (temp == -1) {
            System.out.println("không tìm thấy mã sinh viên!");
            return;
        }
        _1stStudent.remove(temp);
        System.out.println("xóa thành công!");
    }

    public void editStudent() {
        _input = getInputValue(" mã sinh viên cần cập nhật: ");
        int temp = getIndexObj(_input);
        if (temp == -1) {
            System.out.println("không tìm thấy mã sinh viên!");
            return;
        }
        do {
            System.out.println("Bạn muốn sửa thuộc tính nào?");
            System.out.println("1. Tên");
            System.out.println("2. sdt");
            System.out.println("3. email");
            System.out.println("4. Thoát");
            System.out.print("Mời bạn chọ chức năng: ");
            switch (_input) {
                case "1":
                    System.out.println("Tên hiện tại: " + _1stStudent.get(temp).getTen());
                    _1stStudent.get(temp).setTen(getInputValue(" tên mới: "));
                    break;
                case "2":
                    System.out.println("Sdt hiện tại: " + _1stStudent.get(temp).getTen());
                    _1stStudent.get(temp).setSdt(getInputValue(" sdt mới: "));
                    break;
                case "3":
                    System.out.println("email hiện tại: " + _1stStudent.get(temp).getTen());
                    _1stStudent.get(temp).setEmail(getInputValue(" email mới: "));
                    break;
                case "4":
                    System.out.println("kết thúc thuộc tính sửa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không tồn tại!");
            }
        } while (!(_input.equals("4")));

    }

    public void sortStudent() {
//        cách 1:
//        Collections.sort(_1stStudent, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.getDiemjava() > o2.getDiemjava()) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        });

//cách 2: dùng lamda để sắp xếp
        _1stStudent.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));
}
//    Phương thức 1: in danh sách đối tượng

    private void inDs(List<Student> lst){
        for (Student x : lst) {
            x.inRaManHinh();
        }
    }

    // phương thức 2: lấy vị trí của đối tượng trong danh sách
    private int getIndexObj(String msv) {
        for (int i = 0; i < _1stStudent.size(); i++) {
            if (_1stStudent.get(i).getMsv().equalsIgnoreCase(msv)) {
                return i;
            }
        }
        return -1;
    }
}
