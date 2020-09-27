/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakbejo2;

/**
 *
 * @author acer
 */
public class PakBejo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hargaKeramik a = new hargaKeramik(30,30,54000,10);
        System.out.println("Harga Total: Rp. " + a.hitungHarga());
        
        hargaKeramik b = new hargaKeramik(40,40,65000,5);
        System.out.println("Harga Total: Rp. " + b.hitungHarga());
        
        hargaKeramik c = new hargaKeramik(30,40,60000,8);
        System.out.println("Harga Total: Rp. " + c.hitungHarga());
    }
    
}
