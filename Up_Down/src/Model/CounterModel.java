/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dell
 */
public class CounterModel {
    private int value;

    public CounterModel() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public void increment(){
        this.value++;
    }
    
    public void decrement(){
        this.value--; 
    }
    
    public void reset(){
        this.value = 0;
    }
}
