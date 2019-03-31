/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12storybook;

/**
 *
 * @author Rahul Gawdi
 */
public class Lab12StoryBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StoryBookModel myModel = new StoryBookModel();
        StartFrame myStartFrame = new StartFrame(myModel);
        myStartFrame.setVisible(true);
        
    }
    
}
