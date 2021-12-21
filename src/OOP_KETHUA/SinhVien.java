/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_KETHUA;

/**
 *
 * @author PC
 */
/*
1.để kế thừa sử dụng từ khóa extends <tên lớp cha>
2. 1 con chỉ có 1 lớp cha
3.khi lớp con kế thừ thì sẽ thừa hưởng thuộc tính và phương thức mà cha cho phép
*/
public class SinhVien extends Person{
    private String masv;
    private Double diemJava;

    public SinhVien() {
    }
    
    

    public SinhVien(String masv, Double diemJava, String ho, String tendem, String ten, int namsinh) {
        super(ho, tendem, ten, namsinh);
        this.masv = masv;
        this.diemJava = diemJava;// từ khóa this dùng để tham chiếu đến thuộc tính và phương thức của lớp hiện tại
//        super dùng để tham chiếu đến thuộc tính và tham số của lớp cha
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setDiemJava(Double diemJava) {
        this.diemJava = diemJava;
    }

    public String getMasv() {
        return masv;
    }

    public Double getDiemJava() {
        return diemJava;
    }
    
    // kế thừa phương thức của cha 
    // alt + insert ---> Override Method --->chọn tên phương thức muốn kế thừa
    /*
    1.khi lớp con kế thừa phương thức lớp cha không đk sửa tên,thêm hoặc sủa tham số
    2.body code bên trong thì có quyền viết lại theo nghiệp vụ riêng
    */
    void inRaManHinh(){
//        super.inRaManHinh();
          System.out.println("Đây là text từ lớp sinh viên");
    }
    
}
