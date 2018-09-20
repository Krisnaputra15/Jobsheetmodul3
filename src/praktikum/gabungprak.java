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
public class gabungprak {
 public static void main (String [] args) {
     prak2extnds gab = new prak2extnds(0,"",0,"");
     System.out.println("PERPUSTAKAAN SMK TELKOM MALANG");
     gab.setnama("IPA");
     gab.setkode(1);
     gab.sethalaman(90);
     gab.setjenis("Buku pelajaran");
     gab.tampilinfo();
      gab.setnama("SIMKOMDIG");
     gab.setkode(2);
     gab.sethalaman(100);
     gab.setjenis("Buku pelajaran");
     gab.tampilinfo();
      gab.setnama("MTK");
     gab.setkode(3);
     gab.sethalaman(120);
     gab.setjenis("Buku pelajaran");
     gab.tampilinfo();
 }   
}
