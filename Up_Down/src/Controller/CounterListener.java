/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.CounterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dell
 */
public class CounterListener implements ActionListener{

    private CounterView ctv;
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("Da nhan nut ");
            String src = e.getActionCommand();
//            System.out.println(src);
            if(src.equals("UP")){
                this.ctv.increment();
            }else if(src.equals("DOWN")){
                this.ctv.decrement();
            }else if(src.equals("RESET")){
                this.ctv.reset();
            }
            
    }

    public CounterListener(CounterView ctv) {
        this.ctv = ctv;
    }
    
    
}
