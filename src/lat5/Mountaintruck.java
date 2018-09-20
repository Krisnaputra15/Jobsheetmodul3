/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat5;

/**
 *
 * @author ASUS
 */
public class Mountaintruck extends truck {
    public int seatheight;
    public Mountaintruck (int startheight, int startcadence, int startgear, int startspeed){
        super(startcadence, startgear, startspeed);
        seatheight = startheight;
    }
    public void setheight (int newvalue){
        seatheight = newvalue;
    }
    public static void main(String[] aku) {
     System.out.println("Mulai berjalan");
     Mountaintruck mb = new Mountaintruck(0, 0, 0, 0);
     System.out.println("gear = " +mb.gear);
     System.out.println("speed = " +mb.speed);
     mb.setgear(2);
     mb.speedup(2);
      System.out.println("gear = " +mb.gear);
     System.out.println("speed = " +mb.speed);
      mb.speedup(2);
       System.out.println("gear = " +mb.gear);
     System.out.println("speed = " +mb.speed);
      
    }
}
