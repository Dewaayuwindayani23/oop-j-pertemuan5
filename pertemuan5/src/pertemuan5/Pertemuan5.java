/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author LAB F
 */
public class Pertemuan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jajan pancong = new jajan ();
        
        //pancong.bentuk = "lonjong";
        pancong.setbentuk("lonjong");
        
        
        pancong.rasa = "suka-suka";
        pancong.harga = 5000;
        pancong.warna = "kuning";
        
        System.out.println("Bentuknya: "+pancong.getBentuk());
        
    }
    
}
