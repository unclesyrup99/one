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
public class PlaneTurtle extends VehicleTurtle{

    public PlaneTurtle(int x, int y, ModelDisplay modelDisplayer) {
        super(x, y, modelDisplayer);
        initializePlane();
    }

    public PlaneTurtle(ModelDisplay modelDisplay) {
        super(modelDisplay);
        initializePlane();
    }
        private final int PLANE_PACE = 20;
    private final Color PLANE_COLOR = Color.BLUE;
    
    private void initializePlane(){
        setPaceTime(PLANE_PACE);
        setVehicleColor(PLANE_COLOR);
        initialize();
    }
}
