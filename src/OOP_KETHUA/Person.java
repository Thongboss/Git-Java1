/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
1. đưa thuộc tính chung lên lớp cha
2.lớp cha cũng là một lớp đối tượng thông thường
*/
package OOP_KETHUA;

/**
 *
 * @author PC
 */
public class Person {
    private String ho;
    private String tendem;
    private String ten;
    private int namsinh;

    public Person() {
    }

    public Person(String ho, String tendem, String ten, int namsinh) {
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
        this.namsinh = namsinh;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getHo() {
        return ho;
    }

    public String getTendem() {
        return tendem;
    }

    public String getTen() {
        return ten;
    }

    public int getNamsinh() {
        return namsinh;
    }
    
    void inRaManHinh(){
        System.out.println("Đây là phương thức inRaManHinh() ở class person");
    }
}
