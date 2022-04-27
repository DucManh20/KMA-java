package QuanLiSinhVien;

import java.util.Scanner;

public class SinhVien {
	public static final String COMMA = ",";
	private String id;
	private String ten;
	private float diemTrungBinh;
	public SinhVien(String id, String ten, float diemTrungBinh) {
		super();
		this.id = id;
		this.ten = ten;
		this.diemTrungBinh = diemTrungBinh;
	}
	public SinhVien() {
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id : ");
		this.setId(sc.nextLine());
		System.out.println("Nhap ten : ");
		this.setTen(sc.nextLine());
		System.out.println("Nhap diem trung binh : ");
		this.setDiemTrungBinh(Float.parseFloat(sc.nextLine()));
	}
	
	public void hienThi() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", ten=" + ten + ", diemTrungBinh=" + diemTrungBinh + "]";
	}
	public String getId() {
		return id;
	}
	
	public String getLine() {
		return this.getId() + COMMA + this.getTen() + COMMA + this.getDiemTrungBinh();
	}
	
	public void parse(String line){
        String[] param = line.split(",");
        id = param[0];
        ten = param[1];
        diemTrungBinh = Float.parseFloat(param[2]);
    }
	public void setId(String id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}
	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
}
