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
public class BoatTurtle extends VehicleTurtle{

    public BoatTurtle(int x, int y, ModelDisplay modelDisplayer) {
        super(x, y, modelDisplayer);
        initializeBoat();
    }

    public BoatTurtle(ModelDisplay modelDisplay) {
        super(modelDisplay);
        initializeBoat();
    }
           private final int BOAT_PACE = 5;
    private final Color BOAT_COLOR = Color.GREEN;
    
    private void initializeBoat(){
        setPaceTime(BOAT_PACE);
        setVehicleColor(BOAT_COLOR);
        initialize();
    }
}
