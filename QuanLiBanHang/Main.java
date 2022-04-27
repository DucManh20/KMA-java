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
public class Main {

    public static void Nhap() {
        System.out.println("1. Them san pham :");
        System.out.println("2. Them khach hang :");
        System.out.println("3. Hien thi san pham :");
        System.out.println("4. Thay doi thong tin san pham :");
        System.out.println("5. Mua hang :");
        System.out.println("6. Hien thi hoa don :");
        System.out.println("7. Hien thi khach hang mua nhieu nhat :");
        System.out.println("8. Thoat.");
    }

    public static void main(String[] args) {
        int choose = -1;
        Scanner sc = new Scanner(System.in);
        while (choose != 8) {
            Nhap();
            System.out.println("Nhap vao lua chon cua ban :");
            choose = sc.nextInt();
            ChucNang cn = new ChucNang();
            switch (choose) {
                case 1:
                    cn.ThemSP();
                    break;
                case 2:
                    cn.ThemKH();
                    break;
                case 3:
                    cn.HienThiSP();
                    break;
                case 4:
                    cn.ThayDoiTT();
                    break;
                case 5:
                    cn.MuaHang();
                    break;
                case 6:
                    cn.HienThiHD();
                    break;
                case 7:
                    cn.HienThiKHMuaNhieuNhat();
                    break;
                case 8:
                    System.out.println("Ket Thuc!");
                    break;
            }
        }
    }
}
