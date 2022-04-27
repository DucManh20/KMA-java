package QuanLiSinhVien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ChucNang {

	public static final String FILE_NAME = "src/data/student.csv";

	private static List<SinhVien> ds = new ArrayList<>();
//	static File file = new File("data.txt");
	static Scanner sc = new Scanner(System.in);

	// in ra danh sach sinh vien
	public void InDanhSach() {
		if (!ds.isEmpty()) {
			for (SinhVien sinhVien : ds) {
				sinhVien.hienThi();
			}
		} else {
			System.out.println("Danh sach trong!");
		}
	}

	// Them sinh vien moi vao danh sach
	public void Them() {
		SinhVien sv = new SinhVien();
		sv.nhap();
		ds.add(sv);
	}

	// Sua thong tin sinh vien qua id
	public void Sua() {
		System.out.println("Nhap ma sinh vien can sua thong tin :");
		String ma = sc.nextLine();
		int dem = 0;

		if (!ds.isEmpty()) {
			for (SinhVien sinhVien : ds) {
				if (sinhVien.getId().equalsIgnoreCase(ma)) {
					System.out.println("Nhap ten :");
					sinhVien.setTen(sc.nextLine());
					System.out.println("Nhap diem :");
					sinhVien.setDiemTrungBinh(Float.parseFloat(sc.nextLine()));
					dem = 1;
				}
			}
		} else {
			System.out.println("Danh sach trong!");
		}
		if (dem == 0) {
			System.out.println("Khong co sinh vien co ma " + ma);
		}
	}

	// Xoa sinh vien qua id
	public void Xoa() {
		System.out.println("Nhap ma sinh vien can xoa :");
		String ma = sc.nextLine();
		int dem = 0;
		if (!ds.isEmpty()) {
			for (int i = 0; i < ds.size(); i++) {
				if (ds.get(i).getId().equalsIgnoreCase(ma)) {
					ds.remove(ds.get(i));
					dem = 1;
				}
			}
		} else {
			System.out.println("Danh sach trong!");
		}
		if (dem == 0) {
			System.out.println("Khong co sinh vien co ma " + ma);
		}

	}

	// Tim kiem sinh vien theo ten
	public void TimKiem() {
		System.out.println("Nhap ten can tim : ");
		String ten = sc.nextLine();
		int dem = 0;

		if (!ds.isEmpty()) {
			System.out.println("Danh sach sinh vien co ten can tim : ");
			for (SinhVien sinhVien : ds) {
				if (sinhVien.getTen().indexOf(ten) >= 0) {
					sinhVien.hienThi();
					dem = 1;
				}
			}
		} else {
			System.out.println("Danh sach trong!");
		}
		if (dem == 0) {
			System.out.println("Khong co sinh vien can tim ");
		}
	}

	// Sap xep danh sach sinh vien theo diem
	public void SapXep() {
		System.out.println("Sap xep theo diem : ");

		Collections.sort(ds, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return (int) (o1.getDiemTrungBinh() - o2.getDiemTrungBinh());
			}
		});
		InDanhSach();

	}

	// Luu danh sach sinh vien vao file
	public void GhiFile(String file, String line) {
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fileWriter);
			bw.write(line);
			bw.newLine();

			bw.close();
			System.out.println("Sao luu thanh cong!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void DocFile(String file) {
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line = null;

			while ((line = br.readLine()) != null) {
				if (line.isEmpty()) {
					continue;
				}
				SinhVien sv = new SinhVien();
				sv.parse(line);
				ds.add(sv);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SaoLuu() {
		String line = null;
		for (SinhVien sinhVien : ds) {
			line = sinhVien.getLine();
			GhiFile(FILE_NAME, line);
		}
	}

	public void ThongKe() {
		DocFile(FILE_NAME);
	}

}
