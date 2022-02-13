/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiBanHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ChucNang {

    static ArrayList<SanPham> dssp = new ArrayList<>();
    static ArrayList<KhachHang> dskh = new ArrayList<>();
    static ArrayList<HoaDon> dshd = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);

    public ChucNang() {
    }

    void ThemSP() {
        System.out.println("====Them San Pham====");
        SanPham sp = new SanPham();
        int dem = 0;
        System.out.println("Nhap ma san pham :");
        String ma = sc.nextLine();
        for (SanPham sanPham : dssp) {
            if (sanPham.getMaSP().equalsIgnoreCase(ma)) {
                System.out.println("Nhap lai so luong san pham :");
                sanPham.setSoLuong(sc.nextInt());
                dem = 1;
            }
        }
        if (dem == 0) {
            sp.NhapTT1();
            sp.setMaSP(ma);
            dssp.add(sp);
        }
    }

    void ThemKH() {
        System.out.println("====Them Khach Hang====");
        KhachHang kh = new KhachHang();
        kh.NhapTT();
    }

    void HienThiSP() {
        for (SanPham sanPham : dssp) {
            System.out.println(sanPham);
        }
    }

    void ThayDoiTT() {
        System.out.println("Nhap ma san pham can thay doi TT :");
        String ma = sc.nextLine();
        int dem = 0;
        for (SanPham sanPham : dssp) {
            if (sanPham.getMaSP().equalsIgnoreCase(ma)) {
                sanPham.NhapTT1();
                System.out.println("Cap nhat thong tin san pham thanh cong.");
                dem = 1;
            }
        }
        if (dem == 0) {
            System.out.println("Ma san pham khong ton tai!");
        }
    }

    void MuaHang() {
        HoaDon hd = new HoaDon();
        hd.nhapHD();
        dshd.add(hd);
        
    }

    void HienThiHD() {
        for (HoaDon hoaDon : dshd) {
            hoaDon.HienThi();
        }
    }

    void HienThiKHMuaNhieuNhat() {
        Collections.sort(dshd, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return (int) (o1.getTongTien() - o2.getTongTien());
            }
        });
        for (HoaDon hoaDon : dshd) {
            System.out.println("Khach hang mua nhieu nhat la :" + hoaDon.getTenKH());
            break;
        }
    }

}
