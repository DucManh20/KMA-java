/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiBanHang;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class KhachHang {
    private String maKH;
    private String tenKH;
    private int namSinh;
    private String diaChi;

    public KhachHang(String maKH, String tenKH, int namSinh, String diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public KhachHang() {
    }
    
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang :");
        this.setMaKH(sc.nextLine());
        System.out.println("Nhap ten khach hang :");
        this.setTenKH(sc.nextLine());
        System.out.println("Nhap nam sinh :");
        this.setNamSinh(sc.nextInt());
        System.out.println("Nhap dia chi :");
        this.setDiaChi(sc.nextLine());
    }
    
    public void HienThi(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", namSinh=" + namSinh + ", diaChi=" + diaChi + '}';
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
}
