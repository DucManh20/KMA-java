/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiMayBay;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class QuanLiBay {

    static Scanner sc = new Scanner(System.in);
    static List<VeMayBay> list = new ArrayList<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        int choose = -1;
        while (choose != 6) {
            showMenu();
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    input(list);
                    break;
                case 2:
                    save(list, "file.dat");
                    break;
                case 3:
                    read("file.dat");
                    break;
                case 4:
                    sort(list);
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Thoat!!!");
                    break;
                default:
                    System.out.println("Input failed!!!");
                    break;
            }
        }
    }

    static void input(List<VeMayBay> list) {
        System.out.println("Nhap so ve may bay :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            VeMayBay vmb = new VeMayBay();
            vmb.input();
            list.add(vmb);
        }
    }

    static void save(List<VeMayBay> list, String nameFile) throws IOException{
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            fos = new FileOutputStream(nameFile);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLiBay.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fos != null){
                fos.close();
            }
            if(oos != null){
                oos.close();
            }
        }
    }

    static List<VeMayBay> read(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
            list = (List<VeMayBay>) ois.readObject();

            for (VeMayBay veMayBay : list) {
                System.out.println(veMayBay);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLiBay.class.getName()).log(Level.SEVERE, null, ex);
        }  finally {
            if (fis != null) {
                fis.close();
            }
            if (ois != null) {
                ois.close();
            }

        }
        return list;
    }

    static void sort(List<VeMayBay> list) {
        //sap xep
        Collections.sort(list, new Comparator<VeMayBay>() {
            @Override
            public int compare(VeMayBay o1, VeMayBay o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });

        //hien thi
        System.out.println("Thong tin ve may bay sau khi sap xep :");
        for (VeMayBay veMayBay : list) {
            veMayBay.display();
        }
    }

    static void saveByAirline(List<VeMayBay> list) {

    }

    static void showMenu() {
        System.out.println("1. Nhap thong tin N chuyen bay : ");
        System.out.println("2. Luu thong tin vao file : ");
        System.out.println("3. Doc thong tin tu file :");
        System.out.println("4. Sap xep theo gia : ");
        System.out.println("5. In thong tin moi hang bay ra mot file : ");
        System.out.println("6. Thoat ");
        System.out.println("Choose : ");
    }

}
