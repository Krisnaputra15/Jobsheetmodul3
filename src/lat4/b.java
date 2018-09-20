/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat4;

/**
 *
 * @author ASUS
 */
public class b extends A {
    private int b;
    public void setb(int nilai){

 b = nilai;
    }
public int getB (){
    return b;
}   
public void tampilnilai() {
    super.tampilnilaiA();
    System.out.println("Nilai B : " +b);
}
}

