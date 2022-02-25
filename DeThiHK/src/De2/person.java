/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class person {

    String hoTen;
    String ngaySinh;
    String diaChi;
    String gioiTinh;

    public person() {
    }

    public person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten :");
        this.setHoTen(sc.nextLine());
        System.out.println("Nhap ngay sinh :");
        this.setNgaySinh(sc.nextLine());
        System.out.println("Nhap dia chi :");
        this.setDiaChi(sc.nextLine());
        System.out.println("Nhap gioi tinh :");
        this.setGioiTinh(sc.nextLine());
    }
    public void hienThi(){
        System.out.println("Ho ten :"+this.getHoTen());
        System.out.println("Ngay sinh :"+this.getNgaySinh());
        System.out.println("Dia chi :"+this.getDiaChi());
        System.out.println("Gioi tinh :"+this.getGioiTinh());
    }
    @Override
    public String toString() {
        return "person{" + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + '}';
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
}
