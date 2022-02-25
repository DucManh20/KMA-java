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
public class nhanVien extends person{
    private String maNV, donVi;
    private float heSoLuong;

    public nhanVien() {
    }
    
    public nhanVien(String maNV, String donVi, float heSoLuong, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maNV = maNV;
        this.donVi = donVi;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien :");
        this.setMaNV(sc.nextLine());
        System.out.println("Nhap don vi :");
        this.setDonVi(sc.nextLine());
        System.out.println("Nhap he so luong :");
        this.setHeSoLuong(sc.nextFloat());
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Ma nhan vien :"+this.getMaNV());
        System.out.println("Don vi :"+this.getDonVi());
        System.out.println("He so luong :"+this.getHeSoLuong());
    }
    
    public String getLine(){
        return hoTen + "," + diaChi + "," 
                + gioiTinh + ","+ ngaySinh + "," + maNV 
                + ","+ donVi +","+ heSoLuong +"\n";
    }
    
    public void parse(String line){
        String[] param = line.split(",");
        hoTen = param[0];
        diaChi = param[1];
        gioiTinh = param[2];
        ngaySinh = param[3];
        maNV = param[4];
        donVi = param[5];
        heSoLuong = Float.parseFloat(param[6]);
    }
    @Override
    public String toString() {
        return "nhanVien{" + "maNV=" + maNV + ", donVi=" + donVi + ", heSoLuong=" + heSoLuong + '}';
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
}
