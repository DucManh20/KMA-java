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
public class DoUong implements IInputOutput{
    private String tenDoUong;
    private double giaTien;

    public DoUong() {
    }

    public DoUong(String tenDoUong, double giaTien) {
        this.tenDoUong = tenDoUong;
        this.giaTien = giaTien;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten do uong : ");
        tenDoUong = sc.nextLine();
        
        System.out.println("Nhap gia tien : ");
        giaTien = sc.nextDouble();
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "DoUong{" + "tenDoUong=" + tenDoUong + ", giaTien=" + giaTien + '}';
    }

    public String getTenDoUong() {
        return tenDoUong;
    }

    public void setTenDoUong(String tenDoUong) {
        this.tenDoUong = tenDoUong;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
    
}
