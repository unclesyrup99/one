/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtlevehicleproject;
import BookClasses.*;
import java.awt.Color;
/**
 *
 * @author Rahul Gawdi
 */
public class VehicleTurtle extends Turtle {
  //  implements Comparable

    public VehicleTurtle(int x, int y, ModelDisplay modelDisplayer) {
        super(x, y, modelDisplayer);
        initialize();
    }

    public VehicleTurtle(ModelDisplay modelDisplay) {
        super(modelDisplay);
        initialize();
    }

    public int getPaceTime() {
        return paceTime;
    }
    
    private int paceTime = 100;

    /**
     * Set the value of paceTime
     *
     * @param paceTime new value of paceTime
     */
    public void setPaceTime(int paceTime) {
        this.paceTime = paceTime;
    }
public void forward(int x){
    try{

        for (int i = 0; i < x; i++){
            super.forward(1);
            Thread.sleep(paceTime);
        }
    }
    catch(InterruptedException e){
        System.out.println("Thread.sleep threw exception");
    }
}

public void backward(int x){
    try{

        for (int i = 0; i < x; i++){
            super.forward(-1);
            Thread.sleep(paceTime);
        }
    }
    catch(InterruptedException e){
        System.out.println("Thread.sleep threw exception");
    }
}   

    private Color vehicleColor = Color.BLACK;

    /**
     * Set the value of vehicleColor
     *
     * @param vehicleColor new value of vehicleColor
     */
    public void setVehicleColor(Color vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
    public void initialize(){
          setBodyColor(vehicleColor);
          setPenColor(vehicleColor);
    }

   
    
    
}
