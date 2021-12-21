/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiceKeToan {
    Scanner _sc = new Scanner(System.in);
    KeToan _kt = new KeToan();
    List<KeToan> _1stKeToan = new ArrayList<>();
    KeToan _kt2;
    
    void them1KeToanBangCoThamSo(){
        KeToan kt1 = new KeToan(Integer.parseInt(getInputValue("ID: ")),Double.parseDouble(getInputValue("lương: ")),getInputValue("tên: "),Boolean.parseBoolean(getInputValue("trạng thái: ")));
         _kt = kt1;
    }
    void themKeToanList(){
        int size;
        size = Integer.parseInt(getInputValue("số lượng kế toán: "));
        for (int i = 0; i < size; i++) {
            _kt2 = new KeToan();
            _kt2.setId(Integer.parseInt(getInputValue("ID: ")));
            _kt2.setLuong(Double.parseDouble(getInputValue("lương: ")));
            _kt2.setTen(getInputValue("tên: "));
            _kt2.setTrangthai(Boolean.parseBoolean(getInputValue("trạng thái: ")));
            _1stKeToan.add(_kt2);
        }
    }
    void inThongTinKeToan(){
        _kt.inRaManHinh();
        for (int i = 0; i < _1stKeToan.size(); i++) {
            _1stKeToan.get(i).inRaManHinh();
        }
    }
    
    String getInputValue(String text){
        System.out.println("Mời bạn nhập "+text);
        return _sc.nextLine();
    }

    
    
}
