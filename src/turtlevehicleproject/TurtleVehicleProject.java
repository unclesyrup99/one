/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turtlevehicleproject;
import BookClasses.*;
import java.util.*;
/**
 *
 * @author Rahul Gawdi
 */
public class TurtleVehicleProject {
private static ArrayList<VehicleTurtle> vehicles = new ArrayList<VehicleTurtle>(); 
private static final int NUM_VEHICLES = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        World w = new World (1000, 1000);
     
       int random = 0;
        int xPos = 0;
        int yPos = 0;
                for (int i = 0; i < NUM_VEHICLES; i++){
                    random = (int)(Math.random()*3);
                    xPos = 20;
                    yPos = i*(w.getHeight()/NUM_VEHICLES) + 10;
                    switch(random){
                        case 0:
                        vehicles.add(new Bonus1(xPos, yPos, w));
                        
                        break;
                        
                        case 1:
                        vehicles.add(new Bonus2(xPos, yPos, w));
                        break;
                        
                        case 2:
                        vehicles.add(new Bonus3(xPos, yPos, w));
                        break;
                        
                        default:
                            System.out.println("shouldn't get here");
                            
                    }
                }
                for (VehicleTurtle vt : vehicles){
                    vt.turnRight();
                    vt.forward(100);
                }
       
     /**  VehicleTurtle tom = new VehicleTurtle(w);
        tom.forward(100);
        CarTurtle carrie = new CarTurtle (500, 300, w);
        carrie.forward(100);
        PlaneTurtle chris = new PlaneTurtle(500, 100, w);
        chris.forward(100);
        BoatTurtle jim = new BoatTurtle(500, 700, w);
        jim.forward(100);
       
       */
    }
    
}
