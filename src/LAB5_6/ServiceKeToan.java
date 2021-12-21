/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_6;

import com.sun.source.tree.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ServiceKeToan {
    Scanner _sc = new Scanner(System.in);
    List<KeToan> _1stKeToan = new ArrayList<>();
    KeToan _kt;
    
    void them5KeToanCoThamSo(){
        KeToan kt1 = new KeToan(135,3950000,"long",true);
        KeToan kt2 = new KeToan(136,4950000,"thong",false);
        KeToan kt3 = new KeToan(137,3650000,"hoc",true);
        KeToan kt4 = new KeToan(138,3750000,"linh",false);
        KeToan kt5 = new KeToan(139,3350000,"chien",true);
        
        _1stKeToan.add(kt1);
        _1stKeToan.add(kt2);
        _1stKeToan.add(kt3);
        _1stKeToan.add(kt4);
        _1stKeToan.add(kt5);
        
        kt1.inRaManHinh();
        kt2.inRaManHinh();
        kt3.inRaManHinh();
        kt4.inRaManHinh();
        kt4.inRaManHinh();
    }
    void removeKeToan(){
        if (_1stKeToan.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return;
        }
        int temp = getIndex(Integer.parseInt(getInputValue("id cần xóa: ")));
        if (temp == -1) {
            System.out.println("id Kế toán cần tìm không tồn tại!");
            return;
        }
        _1stKeToan.remove(temp);
        System.out.println("Đã xóa thành công!");
    }
    void sortKeToan(){
        if (_1stKeToan.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return;
        }
        Collections.sort(_1stKeToan, new Comparator<KeToan>() {
            @Override
            public int compare(KeToan o1, KeToan o2) {
                if (o1.getId() < o2.getId()) {
                    return 1;
                }else{
                    return -1;
                    }
            }
        });
        inds(_1stKeToan);
    }
    
    String getInputValue(String text){
        System.out.print("Mời bạn nhập "+text);
        return _sc.nextLine();
    }
    int getIndex(int id){
        if (_1stKeToan.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return -1;
        }
        for (int i = 0; i < _1stKeToan.size(); i++) {
            if (id == (_1stKeToan.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }
    void inds(List<KeToan> lst){
        if (_1stKeToan.isEmpty()) {
            System.out.println("Danh sách đang rỗng!");
            return;
        }
        for (KeToan x : lst) {
            x.inRaManHinh();
        }
    }
}
