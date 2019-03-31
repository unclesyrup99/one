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
public class Bonus2 extends CarTurtle{
  private final int CAR_WIDTH = 25;
   private final int CAR_PACE = 50;
   private final Color CAR_COLOR = Color.RED;
    public Bonus2(int x, int y, ModelDisplay modelDisplayer) {
        super(x, y, modelDisplayer);
        initializeBonus2();
    }

    public Bonus2(ModelDisplay modelDisplay) {
        super(modelDisplay);
        initializeBonus2();
    }
  
    
    private void initializeBonus2(){
        setPenWidth(CAR_WIDTH);
        initialize();
    }
}
