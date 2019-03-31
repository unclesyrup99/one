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
public class Bonus3 extends CarTurtle{
    private final int CAR_WIDTH = 10;
     private final int CAR_PACE = 50;
   private final Color CAR_COLOR = Color.RED;
    public Bonus3(int x, int y, ModelDisplay modelDisplayer) {
        super(x, y, modelDisplayer);
        initializeBonus3();
    }

    public Bonus3(ModelDisplay modelDisplay) {
        super(modelDisplay);
        initializeBonus3();
    }

    
    private void initializeBonus3(){
        setPenWidth(CAR_WIDTH);
        initialize();
    }
}
