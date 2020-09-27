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
public class hargaKeramik {
    int panjang;
    int lebar;
    int harga;
    int jlhPcs;
    
    //constructor
    hargaKeramik(int p, int l, int h, int j){
       this.panjang = p;
       this.lebar = l;
       this.harga = h;
       this.jlhPcs = j;
    }
   
    //methods non-void
    int hitungHarga(){
        int hargaTotal;
        int luasBangunan = 1000000;
        hargaTotal = luasBangunan / (this.panjang * this.lebar * this.jlhPcs) * this.harga;
        return hargaTotal;
    }
}
