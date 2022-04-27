/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Main {

    static ArrayList<nhanVien> ds = new ArrayList<>();
    static ArrayList<nhanVien> ds1 = new ArrayList<>();

    public static void main(String[] args) {
        int luaChon = -1;
        Scanner sc = new Scanner(System.in);
        while(luaChon != 0){
            menu();
            System.out.println("Nhap lua chon cua ban :");
            luaChon = sc.nextInt();
        switch (luaChon) {
            case 1:
                Nhap();
                break;
            case 2:
                ghiFile();
                break;
            case 3:
                docFile();                      
                break;
            case 4:
                System.out.println("Thoat");
                break;
        }
        }
    }

    public static void menu() {
        System.out.println("1. Nhap thong tin nhan vien.");
        System.out.println("2. Luu file.");
        System.out.println("3. Doc file.");
        System.out.println("0. Thoat");
    }

    public static void Nhap() {
        System.out.println("Nhap so luong nhan vien :");
        Scanner sc = new Scanner(System.in);
        int sl = sc.nextInt();
        for (int i = 0; i < sl; i++) {
            nhanVien nv = new nhanVien();
            nv.nhap();
            ds.add(nv);
        }
    }

    public static void ghiFile() {
        System.out.println("Bat dau luu File :");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("student.dat");
            for (nhanVien d : ds) {
                String line = d.getLine();
                byte[] b = line.getBytes("utf8");
                fos.write(b);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void docFile() {
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader br = null;
        
        try{
            fis = new FileInputStream("student.dat");
            reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
            br = new BufferedReader(reader);
            String line = null;
            while((line = br.readLine()) != null){
                if(line.isEmpty()){
                    continue;
                }
                nhanVien nv = new nhanVien();
                nv.parse(line);
                ds.add(nv);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        for (nhanVien d : ds) {
            d.hienThi();
        }
        
        
    }
}
