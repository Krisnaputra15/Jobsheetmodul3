/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author ASUS
 */
public class prak2extnds extends prak1 {
    public String jenisbuku;
    public prak2extnds (int lkodebuku, String lnamabuku, int ljumlahhalaman, String ljenisbuku){
        super(lkodebuku, lnamabuku, ljumlahhalaman );
        jenisbuku = ljenisbuku;
    }
    public void setjenis(String valuebaru){
    jenisbuku = valuebaru;    
    }
    public String getjenis () {
    return jenisbuku;    
    }
    public void tampilinfo () {
    super.tampilprak1();
    System.out.println("Jenis buku : " +getjenis());
    }
    
    
    
}
