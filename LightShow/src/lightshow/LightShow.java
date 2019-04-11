/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lightshow;
import BookClasses.*;
import java.util.ArrayList;
/**
 *
 * @author clatulip
 */
public class LightShow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create the GUI and show it
        LightFrame myFrame = new LightFrame();
        myFrame.setVisible(true);
        
        // create an arraylist of RandomLight objects
        ArrayList<Thread> lights = new ArrayList<>();
        
        // Create nine RandomLight objects, passing in the GUI and a different panel from the GUI
        // Add the created RandomLight objects to the ArrayList
        for (int i = 0; i< 9; i++ ) {
            lights.add(new Thread(new RandomLight(myFrame, myFrame.getPanel(i))));
        }
        
        // load music and play it 
        // note that we don't use blocking play!
        // TODO: change this to your mediasources path
        String path = "C:\\Users\\Rahul Gawdi\\Downloads\\mediasources\\";
        Sound s1 = new Sound(path + "CantBuyMeLove.wav");
        s1.play();
        
        
        // Loop forever, telling each light in turn to change
      
            for (Thread rl : lights) {
                rl.start();
            
        }
        
       
    
    }
    
}
