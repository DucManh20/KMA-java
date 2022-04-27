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
public class DungCu implements IInputOutput{
    private String tenDungCu;
    private String trongLuong;
    private String TrangThai;
    private String loai;

    public DungCu() {
    }

    public DungCu(String tenDungCu, String trongLuong, String TrangThai, String loai) {
        this.tenDungCu = tenDungCu;
        this.trongLuong = trongLuong;
        this.TrangThai = TrangThai;
        this.loai = loai;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten dung cu : ");
        tenDungCu = sc.nextLine();
        
        System.out.println("Nhap trong luong : ");
        trongLuong = sc.nextLine();
        
        System.out.println("Nhap trang thai : ");
        TrangThai = sc.nextLine();
        
        System.out.println("Nhap loai : ");
        loai = sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "DungCu{" + "tenDungCu=" + tenDungCu + ", trongLuong=" + trongLuong + ", TrangThai=" + TrangThai + ", loai=" + loai + '}';
    }

    public String getTenDungCu() {
        return tenDungCu;
    }

    public void setTenDungCu(String tenDungCu) {
        this.tenDungCu = tenDungCu;
    }

    public String getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(String trongLuong) {
        this.trongLuong = trongLuong;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
}
