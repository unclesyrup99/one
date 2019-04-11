/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lightshow;
import BookClasses.*;
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.util.logging.*;
import javax.swing.*;
/**
 *
 * @author clatulip
 */
public class RandomLight implements Runnable {
    // fields
    private LightFrame myFrame;
    private JPanel myPanel;
    
    
    
    // constructor
    public RandomLight(LightFrame view, JPanel panel)  {
        myFrame = view;
        myPanel = panel;
    }
    
    /**
     * changeLight : changes the color of this panel and tells the view to 
 update the changed area, then sleeps for a bit
     */
    public void run() {
        while (true){
        try {
            // create a random number to change the hue of the color, keep saturation and brightness at mid-levels
            double hue = Math.random();
            // change color of this panel
            myPanel.setBackground(Color.getHSBColor((float)hue, 0.5f, 0.5f));
            // tell the view to repaint the area of the screen that has changed
           // myFrame.repaint(myPanel.getX(), myPanel.getY(), myPanel.getWidth(), myPanel.getHeight());
           myFrame.repaint();
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(RandomLight.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
