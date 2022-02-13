/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiBanHang;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class HoaDon {

    private String maHD;
    private String tenKH;
    private String maSP;
    private int soLuong;
    private double thanhTien;
    private double tongTien;
    ArrayList<SanPham> sp1 = new ArrayList<>();

    public HoaDon() {
    }

    public HoaDon(String maHD, String tenKH, String maSP, int soLuong, double thanhTien, double tongTien) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.tongTien = tongTien;
    }

    public void nhapHD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hoa don :");
        this.setMaHD(sc.nextLine());
        System.out.println("Nhap ten khach hang :");
        this.setTenKH(sc.nextLine());
        
        System.out.println("Nhap so san pham muon mua :");
        int so = sc.nextInt();
        
        
        for (int i = 0; i < so; i++) {      
            sc.nextLine();
            System.out.println("Nhap ma san pham muon mua :");
            String ma = sc.nextLine();
            SanPham sp = new SanPham();
            for (SanPham sanPham : ChucNang.dssp) {
                if(sanPham.getMaSP().equalsIgnoreCase(ma)){
                    sp = sanPham;
                    System.out.println("Nhap so luong san pham muon mua :");
                    int sl = sc.nextInt();
                    sp.setSoLuong(sl);
                    sp1.add(sp);
                }
            }           
            for (SanPham sanPham : sp1) {
                tongTien += sanPham.getDonGia() * sanPham.getSoLuong();
            }
        }
    }

    public void HienThi(){
        System.out.println("Ma hoa don :" +this.getMaHD());
        System.out.println("Ten khach hang :" +this.getTenKH());
        System.out.println("San pham da mua :");
        for (SanPham sanPham : sp1) {
            sanPham.HienThi();
        }
        System.out.println("Tong tien : " + tongTien);
    }
    @Override
    public String toString() {
        return "HoaDon{" + "maHD=" + maHD + ", tenKH=" + tenKH + ", maSP=" + maSP + ", soLuong=" + soLuong + ", thanhTien=" + thanhTien + ", tongTien=" + tongTien + ", sp=" + sp1 + '}';
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}
