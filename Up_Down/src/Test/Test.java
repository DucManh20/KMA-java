/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Model.CounterModel;
import View.CounterView;

/**
 *
 * @author Dell
 */
public class Test {
    public static void main(String[] args) {
        CounterModel ct = new CounterModel();
        ct.increment();
        ct.increment();
        ct.increment();
        System.out.println(ct.getValue());
        ct.decrement();
        System.out.println(ct.getValue());
        
        CounterView ctv = new CounterView();
    }
}
