/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiMayBay;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class VeMayBay implements Serializable{
    private String id;
    private String name;
    private String date;
    private String bag;
    private float price;

    public VeMayBay() {
    }

    public VeMayBay(String id, String name, String date, String bag, float price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.bag = bag;
        this.price = price;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ma ve : ");
        id = sc.nextLine();
        
        System.out.println("Nhap ten chuyen bay : ");
        name = sc.nextLine();
        
        System.out.println("Ngay bay : ");
        date = sc.nextLine();
        
        System.out.println("Nhap hanh ly ky gui : ");
        bag = sc.nextLine();
        
        System.out.println("Nhap gia : ");
        price = Float.parseFloat(sc.nextLine());
            
    }

    public void display(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "VeMayBay{" + "id=" + id + ", name=" + name + ", date=" + date + ", bag=" + bag + ", price=" + price + '}';
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBag() {
        return bag;
    }

    public void setBag(String bag) {
        this.bag = bag;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
