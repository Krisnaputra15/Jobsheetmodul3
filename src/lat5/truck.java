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
public class truck {
    public int cadence;
    public int gear;
    public int speed;
    
    public truck(int startcadence, int startgear, int startspeed){
        cadence = startcadence;
        gear = startgear;
        speed = startspeed;
    }
    public void setcadence (int newvalue){
        cadence = newvalue;
        
    }
    public void setgear(int newvalue){
        gear = newvalue;
    }
    public void applybrake (int decrement){
        speed = decrement;
    }
    public void speedup(int increment){
        speed = increment;
    }
    
}
