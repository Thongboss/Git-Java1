/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASIGNMENT_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PC
 */
public class ServiceDanhBa {

    Scanner _sc = new Scanner(System.in);
    List<DanhBa> _lstDanhBas = new ArrayList<>();
    DanhBa _db;
    String _input;

    void themNguoi() {
        int songuoi;
        String ho,ten,tendem;
        songuoi = Integer.parseInt(getValueInput("số người muốn thêm: "));
        for (int i = 0; i < songuoi; i++) {
            _db = new DanhBa();
            do {
                _db.setHo(vietHoa(getValueInput("họ người thứ " + (i + 1) + " : ")));
                ho = _db.getHo();
            } while (!(checkHoTen(ho)));
            do {
                _db.setTendem(vietHoa(getValueInput("tên đệm người thứ " + (i + 1) + " : ")));
                tendem = _db.getTendem();
            } while (!(checkHoTen(tendem)));
            do {
                _db.setTen(vietHoa(getValueInput("tên người thứ " + (i + 1) + " : ")));
                ten = _db.getTen();
            } while (!(checkHoTen(ten)));
            _db.setNs(Integer.parseInt(getValueInput("năm sinh người thứ " + (i + 1) + " : ")));
            _db.setGioitinh(getValueInput("giới tính người thứ " + (i + 1) + " : "));
            _db.setSdt1(getValueInput("số điện thoại 1 người thứ " + (i + 1) + " : "));
            _db.setSdt2(getValueInput("số điện thoại 2 người thứ " + (i + 1) + " : "));
            _db.setEmail(getValueInput("email người thứ " + (i + 1) + " : "));
            _db.setGhichu(getValueInput("ghi chú người thứ " + (i + 1) + " : "));
            _lstDanhBas.add(_db);
        }
        System.out.println("Thêm thành công!");
    }
    
        public void them15DB() {
        DanhBa db1 = new DanhBa( "0368443774","0327145145", "Thong@gmail","Nghệ An", "Võ","Thông", "Hữu", "nam", 1999);
        DanhBa db2 = new DanhBa("0362214456", "0348152152", "Son@gmail", "Điện Biên","Lò","Sơn", "Văn", "nam", 1998);
        DanhBa db3 = new DanhBa( "031441478", "0352532533", "Duc@gmail", "Hòa Bình","Nguyễn","Đức", "Văn" ,"nam", 2002);
        DanhBa db4 = new DanhBa( "0356789789", "0323233235", "Thai@gmail", "Thái Bình", "Hoàng","Thái", "Xuân", "nam", 2002);
        DanhBa db5 = new DanhBa( "0368914762", "0344658834", "Bang@gmail", "Đô Lương","Trần","Bằng", "Văn", "nam", 2007);

        _lstDanhBas.add(db1);
        _lstDanhBas.add(db2);
        _lstDanhBas.add(db3);
        _lstDanhBas.add(db4);
        _lstDanhBas.add(db5);
        System.out.println("Thêm thành công!");
    }

    void suaNguoi() {
        if (_lstDanhBas.isEmpty()) {
            System.out.println("Danh sách đang rỗng.");
            return;
        }
        int temp = getIndex(getValueInput("tên thanh niên muốn sửa: "));
        if (temp == -1) {
            System.out.println("Tên không tồn tại trong danh sách!");
        } else {
            String nhap;
            do {
                System.out.println("Bạn muốn sửa thông tin nào?");
                System.out.println("1. sdt1");
                System.out.println("2. sdt2");
                System.out.println("3. email");
                System.out.println("4. quay lại menu chính");
                System.out.print("Mời bạn chọn: ");
                nhap = _sc.nextLine();
                switch (nhap) {
                    case "1":
                        System.out.println("số điện thoại 1 hiện tại: " + (_lstDanhBas.get(temp).getSdt1()));
                        _lstDanhBas.get(temp).setSdt1(getValueInput("số điện thoại 1 mới: "));
                        break;
                    case "2":
                        System.out.println("số điện thoại 2 hiện tại: " + (_lstDanhBas.get(temp).getSdt2()));
                        _lstDanhBas.get(temp).setSdt2(getValueInput("số điện thoại 2 mới: "));
                        break;
                    case "3":
                        System.out.println("Email hiện tại: " + (_lstDanhBas.get(temp).getEmail()));
                        _lstDanhBas.get(temp).setEmail(getValueInput("email mới: "));
                        break;
                    case "4":
                        System.out.println("BẠn chọn quay lại menu chính!");
                        break;
                    default:
                        System.out.println("Chức năng không tồn tại!");
                }
            } while (!(nhap.equals("4")));
        }
    }
    void xoaNguoi(){
        if (_lstDanhBas.isEmpty()) {
            System.out.println("Danh sách đang rỗng.");
            return;
        }
        int temp = getIndex(getValueInput("tên thanh niên muốn xóa: "));
        if (temp == -1) {
            System.out.println("Tên không tồn tại trong danh sách.");
            return;
        }
        _lstDanhBas.remove(temp);
        System.out.println("Xóa thành công!");
    }
    
    void timKiemNguoi(){
        if (_lstDanhBas.isEmpty()) {
            System.out.println("Danh sách đnag rỗng.");
            return;
        }
        int tep = getIndex(getValueInput("tên muốn tìm kiếm: "));
        if (tep == -1) {
            System.out.println("Tên bạn tìm không tồn tại trong Danh bạ.");
            return;
        }
        _lstDanhBas.get(tep).inRRaManHinh();
    }
    
    void sortNguoi(){
        String nhap;
        do {
            System.out.println("Chức năng sắp xếp: ");
            System.out.println("1. sắp xếp xuôi theo tên.");
            System.out.println("2. sắp xếp ngược theo tên.");
            System.out.println("3. quay lại menu chính");
            System.out.print("Mời bạn chọn chức năng: ");
            nhap = _sc.nextLine();
            switch (nhap) {
                case "1":
                    _lstDanhBas.sort((o1,o2) -> o1.getTen().compareTo(o2.getTen()));
                    System.out.println("sắp xếp xuôi theo tên thành công!");
                    break;
                case "2":
                    _lstDanhBas.sort((o1,o2) -> o2.getTen().compareTo(o1.getTen()));
                    System.out.println("sắp xếp ngược theo tên thành công!");
                    break;
                case "3":
                    System.out.println("Bạn chọn quay lại menu chính!");
                    break;
                default:
                    System.out.println("Chức năng không tồn tại!");
            }
        } while (!(nhap.equals("3")));
        
    }
    void loadThongTin(){
        for (int i = 0; i < _lstDanhBas.size(); i++) {
           _input = (_lstDanhBas.get(i).getNs() < 1999) && (_lstDanhBas.get(i).getGioitinh().equalsIgnoreCase("nam"))
                   ? ("Anh "+_lstDanhBas.get(i).getTen()) : (_lstDanhBas.get(i).getNs() < 1999) && (_lstDanhBas.get(i).getGioitinh().equalsIgnoreCase("nữ"))
                   ? ("Chị "+_lstDanhBas.get(i).getTen()) : (_lstDanhBas.get(i).getNs() > 1999) ? ("Em "+_lstDanhBas.get(i).getTen())
                   : ("Bạn "+_lstDanhBas.get(i).getTen());
           _lstDanhBas.get(i).setTen(_input);
        }
        inDS(_lstDanhBas);
    }
    
    void inDS(List<DanhBa> lst){
        if (_lstDanhBas.isEmpty()) {
            System.out.println("Danh sách đang rỗng.");
            return;
        }
        for (DanhBa x : lst) {
            x.inRRaManHinh();
        }
    }
    
    void findGanDungSDT(){
        if (_lstDanhBas.isEmpty()) {
            System.out.println("Danh sách đang rỗng.");
            return;
        }
        String sdt = getValueInput("3 số cuối điện thoại cần tìm: ");
        int temp = 0;
        for (int i = 0; i < _lstDanhBas.size(); i++) {
            if (_lstDanhBas.get(i).getSdt1().endsWith(sdt) || _lstDanhBas.get(i).getSdt2().endsWith(sdt)) {
                _lstDanhBas.get(i).inRRaManHinh();
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Không tìm thây số điện thoại gần đúng theo bạn tìm!");
        }
    }
    
    void findGanDungTen(){
        if (_lstDanhBas.isEmpty()) {
            System.out.println("Danh sách đang rỗng.");
            return;
        }
        String ten = getValueInput("hai ký tự đầu tên bạn muốn tìm: ");
        ten = ten.toLowerCase();
        int temp = 0;
        for (int i = 0; i < _lstDanhBas.size(); i++) {
            String name = _lstDanhBas.get(i).getTen();
            name = name.toLowerCase();
            if (name.startsWith(ten)) {
                _lstDanhBas.get(i).inRRaManHinh();
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Không tồn tại tên gần đúng mà bạn muốn tìm.");
        }
    }
    
    String vietHoa(String text){
        text = text.toLowerCase();
        return String.valueOf(text.charAt(0)).toUpperCase() + text.substring(1, text.length());
    }
    
    boolean checkHoTen(String text){
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    int getIndex(String ten) {
        if (_lstDanhBas.isEmpty()) {
            System.out.println("Danh sách đang rỗng.");
            return -1;
        }
        for (int i = 0; i < _lstDanhBas.size(); i++) {
            if (ten.equalsIgnoreCase(_lstDanhBas.get(i).getTen())) {
                return i;
            }
        }
        return -1;
    }

    String getValueInput(String text) {
        System.out.print("Mời bạn nhập " + text);
        return _sc.nextLine();
    }
}
