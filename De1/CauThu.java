/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;

/**
 *
 * @author Dell
 */
public class CauThu {
    private String id, ten;
    private int namSinh;
    private String viTri;

    public CauThu() {
    }

    public String getLine(){
        return id + "?" + ten +"?"+ namSinh+ "?" + viTri + "\n";
    }
    
    public void param(String line){
        String[] M = line.split("\\?");
        try{
        id = M[0];
        ten = M[1];
        namSinh = Integer.parseInt(M[2]);
        viTri = M[3];
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void hienThi(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "CauThu{" + "id=" + id + ", ten=" + ten + ", namSinh=" + namSinh + ", viTri=" + viTri + '}';
    }

    
    public String getId() {
        return id;
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

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    
    
            
}
