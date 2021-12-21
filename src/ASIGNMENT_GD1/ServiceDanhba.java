/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASIGNMENT_GD1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PC
 */
public class ServiceDanhba {

    Scanner _sc = new Scanner(System.in);
    List<DanhBa> _1stDanhBas = new ArrayList<>();
    DanhBa _DanhBa;
    String _input;

    public ServiceDanhba() {
    }

    public void addDB() {
        String ho,tendem,ten,ns,genter,sdt1,sdt2,email;
        _input = getValueInput("số lượng danh bạ muốn thêm: ");
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _DanhBa = new DanhBa();
            System.out.println("Mời bạn nhập thông tin danh bạ thứ " + (i + 1) + " : ");
            do {
                _DanhBa.setHo(vietHoa(getValueInput("họ: ")));
                ho = _DanhBa.getHo();
            } while (!checkHoTen(ho));
            do {
                _DanhBa.setTendem(vietHoa(getValueInput("tên đệm: ")));
                tendem = _DanhBa.getTendem();
            } while (!checkHoTen(tendem));
            do {
                _DanhBa.setTen(vietHoa(getValueInput("tên: ")));
                ten = _DanhBa.getTen();
            } while (!checkHoTen(ten));
            do {
                _DanhBa.setNamsinh(Integer.parseInt(getValueInput("năm sinh: ")));
                ns = String.valueOf(_DanhBa.getNamsinh());
            } while (!checkNamSinh(ns));
            do {
                _DanhBa.setGioitinh(getValueInput("giới tính: "));
                genter = _DanhBa.getGioitinh();
            } while (!checkgenter(genter));
            do {
                _DanhBa.setSdt1(getValueInput("sdt1: "));
                sdt1 = _DanhBa.getSdt1();
            } while (!checkSDT(sdt1));
            do {
                _DanhBa.setSdt2(getValueInput("sdt2: "));
                sdt2 = _DanhBa.getSdt2();
            } while (!checkSDT(sdt2));
            do {
                _DanhBa.setEmail(getValueInput("email: "));
                email = _DanhBa.getEmail();
            } while (!checkEmail(email));
            
            _DanhBa.setGhichu(getValueInput("ghi chú: "));
            _1stDanhBas.add(_DanhBa);
        }
        System.out.println("Thêm thành công!");
    }

    public void editDB() {
        if (_1stDanhBas.isEmpty()) {
            System.out.println("Danh bạ đang rỗng!");
            return;
        }
        _input = getValueInput("tên danh bạ muốn sửa: ");
        int temp = getIndex(_input);
        if (temp == -1) {
            System.out.println("Tên bạn muốn tìm không tồn tại!");
            return;
        }
        String nhap;
        do {
            System.out.println("Bạn muốn sửa thuộc tính nào?");
            System.out.println("1. sdt1");
            System.out.println("2. sdt2");
            System.out.println("3. email");
            System.out.println("4. năm sinh");
            System.out.println("5. ghi chú");
            System.out.println("6. thoát!");
            System.out.print("Mời bạn chọn chức năng:");
            nhap = _sc.nextLine();
            switch (nhap) {
                case "1":
                    System.out.println("Sdt1 hiện tại: " + _1stDanhBas.get(temp).getSdt1());
                    _1stDanhBas.get(temp).setSdt1(getValueInput("sdt1 mới: "));
                    break;
                case "2":
                    System.out.println("Sdt2 hiện tại: " + _1stDanhBas.get(temp).getSdt2());
                    _1stDanhBas.get(temp).setSdt2(getValueInput("sdt2 mới: "));
                    break;
                case "3":
                    System.out.println("email hiện tại: " + _1stDanhBas.get(temp).getEmail());
                    _1stDanhBas.get(temp).setEmail(getValueInput("email mới: "));
                    break;
                case "4":
                    System.out.println("năm sinh hiện tại: " + _1stDanhBas.get(temp).getNamsinh());
                    _1stDanhBas.get(temp).setNamsinh(Integer.parseInt(getValueInput("năm sinh mới: ")));
                    break;
                case "5":
                    System.out.println("ghi chú hiện tại: " + _1stDanhBas.get(temp).getGhichu());
                    _1stDanhBas.get(temp).setGhichu(getValueInput("ghi chú mới: "));
                    break;
                case "6":
                    System.out.println("kết thúc sửa danh bạ!");
                    break;
                default:
                    System.out.println("Chức năng không tồn tại!");
            }
        } while (!(nhap.equals("6")));

    }

    public void removeDB() {
        if (_1stDanhBas.isEmpty()) {
            System.out.println("Danh bạ đang rỗng!");
            return;
        }
        int temp = getIndex(getValueInput("tên muốn xóa: "));
        if (temp == -1) {
            System.out.println("Tên bạn muốn tìm không tồn tại!");
            return;
        }
        _1stDanhBas.remove(temp);
        System.out.println("Đã xóa thành công!");
    }

    public void them15DB() {
        DanhBa db1 = new DanhBa("Thông", "Võ", "Hữu", 1999, "nam", "0368443774", "0327145145", "Thong@gmail", "Nghệ An");
        DanhBa db2 = new DanhBa("Sơn", "Lò", "Văn", 1998, "nam", "0362214456", "0348152152", "Son@gmail", "Điện Biên");
        DanhBa db3 = new DanhBa("Đức", "Nguyễn", "Văn", 2002, "nam", "031441478", "0352532533", "Duc@gmail", "Hòa Bình");
        DanhBa db4 = new DanhBa("Thái", "Hoàng", "Xuân", 2002, "nam", "0356789789", "0323233235", "Thai@gmail", "Thái Bình");
        DanhBa db5 = new DanhBa("Bằng", "Trần", "Văn", 2007, "nam", "0368914762", "0344658834", "Bang@gmail", "Đô Lương");
        DanhBa db6 = new DanhBa("Thuận", "Võ", "Hữu", 2005, "nam", "0312987789", "0343343333", "Thuan@gmail", "Nhân Sơn");
        DanhBa db7 = new DanhBa("Hợi", "Đinh", "Văn", 1996, "nam", "0352252345", "0354423786", "Hoi@gmail", "Nghệ An");
        DanhBa db8 = new DanhBa("Thu Trang", "Hoàng", "Thị", 1999, "nữ", "0368368368", "0322345790", "ThuTrang@gmail", "Thái Sơn");
        DanhBa db9 = new DanhBa("Thắng", "Vương", "Ngọc", 1998, "nam", "0314314456", "0327327456", "Thang@gmail", "Lạng Sơn");
        DanhBa db10 = new DanhBa("Bắc", "Ngọc", "Văn", 1997, "nam", "0367367789", "0354354852", "Bac@gmail", "Bắc Giang");
        DanhBa db11 = new DanhBa("Nguyệt", "Nguyễn", "Thị", 2000, "nữ", "0398658342", "0367259340", "Nguyet@gmail", "Yên Dũng");
        DanhBa db12 = new DanhBa("Hà", "Thái", "Thu", 2003, "nữ", "0347584379", "0310059723", "Ha@gmail", "Quảng Ninh");
        DanhBa db13 = new DanhBa("Trúc", "Mạc", "Hà", 2001, "nữ", "0357512378", "0354782377", "truc@gmail", "Ninh Thuận");
        DanhBa db14 = new DanhBa("Thúy", "Sầm", "Mai", 1993, "nữ", "0329057057", "0304034340", "Thuy@gmail", "Vũng Tàu");
        DanhBa db15 = new DanhBa("Hầu", "Hoài", "Văn", 1995, "nam", "0364354782", "0384357290", "Hau@gmail", "Cà Mau");

        _1stDanhBas.add(db1);
        _1stDanhBas.add(db2);
        _1stDanhBas.add(db3);
        _1stDanhBas.add(db4);
        _1stDanhBas.add(db5);
        _1stDanhBas.add(db6);
        _1stDanhBas.add(db7);
        _1stDanhBas.add(db8);
        _1stDanhBas.add(db9);
        _1stDanhBas.add(db10);
        _1stDanhBas.add(db11);
        _1stDanhBas.add(db12);
        _1stDanhBas.add(db13);
        _1stDanhBas.add(db14);
        _1stDanhBas.add(db15);
    }

    public void findDB() {
        if (_1stDanhBas.isEmpty()) {
            System.out.println("Danh bạ đang rỗng!");
            return;
        }
        int temp = getIndex(getValueInput("tên muốn tìm kiếm: "));
        if (temp == -1) {
            System.out.println("Tên bạn muốn tìm không tồn tại!");
            return;
        }
        _1stDanhBas.get(temp).inRaManHinh();
    }

    public void getListDanhBa() {
        for (int i = 0; i < _1stDanhBas.size(); i++) {
            _input = (_1stDanhBas.get(i).getNamsinh() < 1999)
                    && (_1stDanhBas.get(i).getGioitinh().equalsIgnoreCase("nam"))
                    ? ("Anh " + _1stDanhBas.get(i).getTen()) : (_1stDanhBas.get(i).getNamsinh() < 1999)
                    && (_1stDanhBas.get(i).getGioitinh().equalsIgnoreCase("nữ")) ? ("Chị " + _1stDanhBas.get(i).getTen())
                    : (_1stDanhBas.get(i).getNamsinh() > 1999) ? ("Em " + _1stDanhBas.get(i).getTen()) : ("Bạn " + _1stDanhBas.get(i).getTen());
            _1stDanhBas.get(i).setTen(_input);
        }
        inds(_1stDanhBas);
    }

//    public void AnhChi() {
//        int nsbanthan = 1999, ns;
//        String ten, gioitinh;
//        // mờ người dùng nhập vào năm sinh và giới tính và tên hiển thị ra chào anh/chị /em + tên
//        do {
//            ten = getValueInput("tên: ");
//            gioitinh = getValueInput("giới tính: ");
//            ns = Integer.parseInt(getValueInput("năm sinh: "));
//            //cách 1
//            System.out.printf("chào %s %s \n", (gioitinh.equalsIgnoreCase("nam") && (nsbanthan > ns)) ? "Anh"
//                    : (gioitinh.equalsIgnoreCase("nữ") && (nsbanthan > ns)) ? "Chị"
//                    : (nsbanthan < ns) ? "Em" : "Bạn", ten);
//        } while (true);
//
//    }
    public void sortDB() {
        String nhap;
        do {
            System.out.println("Mời bạn chọn chức năng sắp xếp theo tên: ");
            System.out.println("1. xuôi theo tên");
            System.out.println("2. ngược theo tên");
            System.out.println("3. quay lại menu chính");
            System.out.print("Mời bạn chọn chức năng: ");
            nhap = _sc.nextLine();
            switch (nhap) {
                case "1":
                    System.out.println("bạn chọn sắp xếp xuôi theo tên: ");
                    _1stDanhBas.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));
                    System.out.println("Sắp xếp thành công!");
                    break;
                case "2":
                    System.out.println("bạn chọn sắp xếp ngược theo tên: ");
                    _1stDanhBas.sort((o1, o2) -> o2.getTen().compareTo(o1.getTen()));
                    System.out.println("Sắp xếp thành công!");
                    break;
                case "3":
                    System.out.println("quay lại menu chính!");
                default:
                    System.out.println("Chức năng không tồn tại!");
            }
        } while (!(nhap.equals("3")));

    }

    void timGanDungSDT() {
        if (_1stDanhBas.isEmpty()) {
            System.out.println("Danh sách đang rỗng.");
            return;
        }
        int temp = 0;
        String sdt = getValueInput("ba số cuối điện thoại: ");
        for (int i = 0; i < _1stDanhBas.size(); i++) {
            if ((_1stDanhBas.get(i).getSdt1()).endsWith(sdt) || (_1stDanhBas.get(i).getSdt2().endsWith(sdt))) {
                _1stDanhBas.get(i).inRaManHinh();
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Danh sách không tồn tại số điện thoại gần đúng với yêu cầu!");
        }
    }

    void timGanDungTen() {
        if (_1stDanhBas.isEmpty()) {
            System.out.println("Danh sách đang rỗng.");
            return;
        }
        int temp = 0;
        String name = getValueInput("hai ký tự đầu của tên: ");
        name = name.toLowerCase();
        for (int i = 0; i < _1stDanhBas.size(); i++) {
            String name1 = _1stDanhBas.get(i).getTen();
            name1 = name1.toLowerCase();
            if ((name1.startsWith(name))) {
                _1stDanhBas.get(i).inRaManHinh();
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Không tìm thấy thên gần đúng với yêu cầu!");
        }
    }

    boolean checkHoTen(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    boolean checkgenter(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z]{2,3}");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    boolean checkEmail(String text) {
        Pattern pattern = Pattern.compile("\\w+@\\w+(\\.\\w+){1,2}");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    boolean checkSDT(String text){
        Pattern pattern = Pattern.compile("0\\d{9,10}");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    boolean checkNamSinh(String text){
        Pattern pattern = Pattern.compile("\\d{4}");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    String vietHoa(String chu) {
        chu = chu.toLowerCase();
        return String.valueOf(chu.charAt(0)).toUpperCase() + chu.substring(1, chu.length());
    }

    public String getValueInput(String text) {
        System.out.print("Mời bạn nhập " + text);
        return _sc.nextLine();
    }

    private void inds(List<DanhBa> lst) {
        if (_1stDanhBas.isEmpty()) {
            System.out.println("Danh bạ đang rỗng!");
            return;
        }
        for (DanhBa x : lst) {
            x.inRaManHinh();
        }
    }

    private int getIndex(String ten) {
        if (_1stDanhBas.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < _1stDanhBas.size(); i++) {
            if (ten.equalsIgnoreCase(_1stDanhBas.get(i).getTen())) {
                return i;
            }
        }
        return -1;
    }
}
