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
public class CarTurtle extends VehicleTurtle {

    public CarTurtle(int x, int y, ModelDisplay modelDisplayer) {
        super(x, y, modelDisplayer);
    initializeCar();
    }

    public CarTurtle(ModelDisplay modelDisplay) {
        super(modelDisplay);
        initializeCar();
    }
    private final int CAR_PACE = 50;
    private final Color CAR_COLOR = Color.RED;
   // private final int CAR_WIDTH = 50;
    
    private void initializeCar(){
        setPaceTime(CAR_PACE);
        setVehicleColor(CAR_COLOR);
     //   setPenWidth(CAR_WIDTH);
        initialize();
    }
            }
