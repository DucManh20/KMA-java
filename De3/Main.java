/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<MonHoc> ds = new ArrayList<>();
        ArrayList<MonHoc> ds1 = new ArrayList<>();
        MonHoc mh1 = new MonHoc("Toan", 3);
        MonHoc mh2 = new MonHoc("Ly", 4);
        MonHoc mh3 = new MonHoc("Hoa", 2);
        
        ds.add(mh1);
        ds.add(mh2);
        ds.add(mh3);
        System.out.println("Bat dau luu file :");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("MonHoc.dat");
            
            for (MonHoc d : ds) {
                String line = d.getLine();
                byte [] b = line.getBytes();
                fos.write(b);
            }
            System.out.println("Luu file thanh cong!");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("Bat dau doc file :");
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader br = null;
        
        try {
            fis = new FileInputStream("MonHoc.dat");
            reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
            br = new BufferedReader(reader);
            String line = null;
            while((line = br.readLine()) != null){
                if(line.isEmpty()){
                    continue;
                }
                MonHoc mh = new MonHoc();
                mh.parem(line);
                ds1.add(mh);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(br != null){
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
               
        }
        for (MonHoc monHoc : ds1) {
            System.out.println(monHoc);
        }
        
        
    }
    
}
