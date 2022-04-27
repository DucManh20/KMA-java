package QuanLiSinhVien;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
			
	public static void menu() {
		System.out.println("1. In danh sach");
		System.out.println("2. Them");
		System.out.println("3. Sua");
		System.out.println("4. Xoa");
		System.out.println("5. Tim Kiem");
		System.out.println("6. Sap xep");
		System.out.println("7. Thong ke");
		System.out.println("8. Sao luu");
		System.out.println("0. Thoat");
	}
	public static void main(String[] args) {
		int luaChon = -1;
		while(luaChon != 0) {
			menu();
			System.out.println("Nhap lua chon cua ban : ");
			luaChon = Integer.parseInt(sc.nextLine());
			ChucNang cn = new ChucNang();
			switch(luaChon) {
			case 1:
				cn.InDanhSach();
				break;
			case 2:
				cn.Them();
				break;
			case 3:
				cn.Sua();
				break;
			case 4:
				cn.Xoa();
				break;
			case 5:
				cn.TimKiem();
				break;
			case 6:
				cn.SapXep();
				break;
			case 7:
				cn.ThongKe();
				break;
			case 8:
				cn.SaoLuu();
				break;
			case 0:
				System.out.println("Thoat!");
				break;
			default:
				System.out.println("Nhap lai!");
				break;
			}
		}
	}
}
