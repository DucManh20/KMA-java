/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3;

/**
 *
 * @author Dell
 */
public class MonHoc {
    private String tenMH;
    private int soHocPhan;

    public MonHoc() {
    }

    public MonHoc(String tenMH, int soHocPhan) {
        this.tenMH = tenMH;
        this.soHocPhan = soHocPhan;
    }

    public String getLine(){
        return tenMH + "?" + soHocPhan+ "\n";
    }
    
    public void parem(String line){
        try{
        String []param = line.split("\\?");
        tenMH = param[0];
        soHocPhan = Integer.parseInt(param[1]);
        }catch(Exception e){
                e.printStackTrace();
                }
    }
    @Override
    public String toString() {
        return "MonHoc{" + "tenMH=" + tenMH + ", soHocPhan=" + soHocPhan + '}';
    }

    
    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoHocPhan() {
        return soHocPhan;
    }

    public void setSoHocPhan(int soHocPhan) {
        this.soHocPhan = soHocPhan;
    }
    
}
