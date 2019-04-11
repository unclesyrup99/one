/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Rahul Gawdi
 */
public class Artist {

   
    
    private String artistName;
    public enum Instrument{VOCALS, GUITAR, PIANO, DRUMS, KEYBOARD, BASS}
    private Instrument usualInstrument;
    
    public Artist (String memberName, Artist.Instrument instrument) {
        this.artistName = memberName;
        this.usualInstrument = instrument;
 
}

    public String getArtistName() {
        return artistName;
    }

    public Instrument getUsualInstrument() {
        return usualInstrument;
    }
    
            
}