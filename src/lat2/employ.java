/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat2;

/**
 *
 * @author ASUS
 */
public class employ extends person {
 private String noKaryawan;
 
public employ(String nokaryawan, String nama, int usia){
    super(nama,usia);
    this.noKaryawan = nokaryawan;
} 
public void info (){
    System.out.println("Nama karyawan : " +this.noKaryawan);
    super.info();
}
}
