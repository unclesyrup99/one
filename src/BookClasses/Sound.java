package BookClasses;

import java.awt.geom.AffineTransform;
import java.util.Random;


/**
 * Class that represents a sound.  This class is used by the students
 * to extend the capabilities of SimpleSound. 
 * 
 * Copyright Georgia Institute of Technology 2004
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Sound extends SimpleSound
{

    private SoundSample[][] getSamples;
  
  /////////////// consructors ////////////////////////////////////
  
  /**
   * Constructor that takes a file name
   * @param fileName the name of the file to read the sound from
   */
  public Sound(String fileName)
  {
    // let the parent class handle setting the file name
    super(fileName);
  }
  
  /**
   * Constructor that takes the number of samples in
   * the sound
   * @param numSamples the number of samples desired
   */
  public Sound (int numSamples)
  {
    // let the parent class handle this
    super(numSamples);
  }
  
  /**
   * Constructor that takes the number of samples that this
   * sound will have and the sample rate
   * @param numSamples the number of samples desired
   * @param sampleRate the number of samples per second
   */
  public Sound (int numSamples, int sampleRate)
  {
    // let the parent class handle this
    super(numSamples,sampleRate);
  }
  
  /**
   * Constructor that takes a sound to copy
   */
  public Sound (Sound copySound)
  {
    // let the parent class handle this
    super(copySound);
  }
  
  ////////////////// methods ////////////////////////////////////
  
  /**
   * Method to return the string representation of this sound
   * @return a string with information about this sound
   */
  public String toString()
  {
    String output = "Sound";
    String fileName = getFileName();
    
    // if there is a file name then add that to the output
    if (fileName != null)
      output = output + " file: " + fileName;
    
    // add the length in frames
    output = output + " number of samples: " + getLengthInFrames();
    
    return output;
  }
 
  public static void main(String[] args)
  {
    Sound sound1 = new Sound(FileChooser.pickAFile());
    sound1.explore();
  }
              
    public static void lab3() {
        // TODO code application logic here
    Sound sound1 = new Sound (100000);
    Random dice = new Random();
    int number;
    SoundSample [] sampleArray = sound1.getSamples();
    SoundSample sample = null;
    for (int i=0; i<sampleArray.length;i++){
        number=dice.nextInt(74001)-37000;
        sampleArray[i].setValue(number);
        
    }
    sound1.explore();
    }
        public void fadeIn(int seconds){
        SoundSample [] sampleArray = this.getSamples();
        SoundSample sample = null;
        double interval = this.getSamplingRate() * seconds;
        double value;
        double value1;
        for (int i=0; i < interval; i++ ){
            sample = sampleArray[i];
           value = sample.getValue(); 
              value1 = (int) value * (i/interval); 
            this.setSampleValueAt(i, (int) value1);
        }
        }

    public void fadeOut(int seconds)
    {
        SoundSample[] sampleArray = this.getSamples();
             SoundSample sample = null;
              double interval = this.getSamplingRate() * seconds;
              double value = 0;
              double value2 = 0;
              for(int i = this.getLength()-1; i > this.getLength()-interval; i--)
              {
              sample = sampleArray[i];
              value = (int) sample.getValue();
              value2 =((int) value * (interval/i));
              this.setSampleValueAt(i, (int) value2);
              }
                
    }
    
    public void soundDivision(int divisor) throws ArithmeticException
    {
     SoundSample[] sampleArray = this.getSamples();
     SoundSample sample = null;
     int value = 0;
     int soundInt = 0;
    // try {
    for(int i = 0; i < this.getLength();i++)
    {
        sample = sampleArray[i];
        soundInt = sample.getValue();
        value = soundInt / divisor;
        this.setSampleValueAt(i,value);
        
        
    }
    
   //  } catch (ArithmeticException ae)
     //{
       //  System.out.println("Exception caught in soundDivision method:" +ae); 
     //}
       // System.out.println("Exiting the soundDivision method");
    }

    
    
    public void add(Sound source) throws NullPointerException {
        //while (true){
   try{
        int value =0;
      
      for (int i = 0; i< source.getLength(); i++){
          value= this.getSampleValueAt(i) + source.getSampleValueAt(i);
          this.setSampleValueAt(i, value);
      }
      }catch (NullPointerException beans){
           System.out.println("Exception caught" + beans);
              
      }
    }
   // }

    public static Sound createSinWave(int freq, int maxAmplitude){
        Sound s = new Sound(FileChooser.getMediaPath("sec1silence.wav"));
        double samplingRate = s.getSamplingRate();
        double rawValue = 0;
        int value = 0;
        double interval = 1.0 / freq; 
        double  samplesPerCycle = interval * samplingRate;
        double maxValue = 2 * Math.PI;
        for (int i = 0; i < s.getLength(); i++){
            rawValue = Math.sin((i/samplesPerCycle)*maxValue);
            value = (int) (maxAmplitude * rawValue);
            s.setSampleValueAt(i,value);
            
        }
        return s;
    }
    
    //public Picture scale (double xFactor, double yFactor){
      //  AffineTransform scaleTransform = new AffineTransform();
        //scaleTransform.scale(xFactor,yFactor);
        //Picture result = new Picture ((int) (getWidth()* xFactor), (int) (getHeight()* yFactor));
    //}
/**
 * Method to copy odd sound values and set even values to zero
 * @param sound value s
 * @return n
 * 
 */
    public Sound zeroAlternatingSamples(Sound s){
     
        Sound n = new Sound (s.getLength());
        for(int i = 0; i < s.getLength(); i++){
            if (i%2==0){
               
                 n.setSampleValueAt(i, 0);       
            }
            else{
              //   n.indexOf[i]=s.indexOf[i];
              n.setSampleValueAt(i, s.getSampleValueAt(i));
            }
        }
        return n;
    }
     public Sound skipSamples(){
          Sound n = new Sound ((this.getLength())/2);
        for(int i = 0; i < n.getLength(); i++){
           
               
                 n.setSampleValueAt(i, this.getSampleValueAt(i*2));       
            
           
        }
        return n;
     }
     
     public Sound repeatAllSamples(){
       Sound n = new Sound ((this.getLength())*2);
       int a = 0;
        for(int i = 0; i < this.getLength(); i++){

            
                n.setSampleValueAt(a, this.getSampleValueAt(i));
                n.setSampleValueAt(a + 1, this.getSampleValueAt(i));
                a +=2;
            
            
            
        }
        
        return n;
     }
     
     public Sound fadein1 (int seconds){
        Sound newSound = new Sound(this.getLength());
        double sampleRate =this.getSamplingRate();
        double interval = (double) seconds* sampleRate;
        
        for (int i = 0;i< interval; i++){
            newSound.setSampleValueAt(i, (int)((double)this.getSampleValueAt(i)*((double)i/interval)));
            
        }
        for(int j = (int)interval; j< this.getLength(); j++){
            newSound.setSampleValueAt(j, this.getSampleValueAt(j));
            
        }
        return newSound;
     }
     
     public void zeroAlternatingSamples(String path, String filename)
     {
         Sound n = new Sound (this.getLength());
        for(int i = 0; i < this.getLength(); i++){
            if (i%2==0){
               
                 n.setSampleValueAt(i, 0);       
            }
            else{
              //   n.indexOf[i]=s.indexOf[i];
              n.setSampleValueAt(i, this.getSampleValueAt(i));
            }
        }
        
        n.write(path + filename);
        
     }
} // this } is the end of class Sound, put all new methods before this