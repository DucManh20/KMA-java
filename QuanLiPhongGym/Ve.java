/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiPhongGym;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Ve implements IInputOutput{

    private String tenKhachHang;
    private String ngayMua;
    private String ngayHetHan;

    public Ve() {
    }

    public Ve(String tenKhachHang, String ngayMua, String ngayHetHan) {
        this.tenKhachHang = tenKhachHang;
        this.ngayMua = ngayMua;
        this.ngayHetHan = ngayHetHan;
    }
    
    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ten khach hang : ");
        tenKhachHang = sc.nextLine();
        
        System.out.println("Nhap ngay mua : ");
        ngayMua = sc.nextLine();
        
        System.out.println("Nhap ngay het han : ");
        ngayHetHan = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Ve{" + "tenKhachHang=" + tenKhachHang + ", ngayMua=" + ngayMua + ", ngayHetHan=" + ngayHetHan + '}';
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    
}
