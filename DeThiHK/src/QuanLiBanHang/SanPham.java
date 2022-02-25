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
// 4 : 34
public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private String ngaySX;
    private int soLuong;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double donGia, String ngaySX, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.soLuong = soLuong;
    }
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham :");
        this.setMaSP(sc.nextLine());
        System.out.println("Nhap ten san pham :");
        this.setTenSP(sc.nextLine());
        System.out.println("Nhap don gia :");
        this.setDonGia(sc.nextDouble());
        System.out.println("Nhap ngay san xuat :");
        this.setNgaySX(sc.nextLine());
        System.out.println("Nhap so luong san pham :");
        this.setSoLuong(sc.nextInt());
    }
    public void NhapTT1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham :");
        this.setTenSP(sc.nextLine());
        System.out.println("Nhap don gia :");
        this.setDonGia(sc.nextDouble());
        System.out.println("Nhap ngay san xuat :");
        this.setNgaySX(sc.nextLine());
        System.out.println("Nhap so luong san pham :");
        this.setSoLuong(sc.nextInt());
    }
    
    public void HienThi(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", donGia=" + donGia + ", ngaySX=" + ngaySX + ", soLuong=" + soLuong + '}';
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
