/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import BookClasses.*;
import java.util.ArrayList;
/**
 *
 * @author Rahul Gawdi
 */
public class Song {
 private float earnings;
 private MusicGroup group;
 private int numPlays;
 private int numPurchases;
 private float royalty;
 private Sound song;
 private float songPrice;
 private String writer;
 private String title;
 private ArrayList<ArtistInstrumentsPlayed> players = new ArrayList<>();

    public Song(Sound song, String title, String writer, MusicGroup group, float royalty, float songPrice ) {
        this.earnings = 0.0f;
        this.group = group;
        this.numPlays = 0;
        this.numPurchases = 0;
        this.royalty = royalty;
        this.song = song;
        this.songPrice = songPrice;
        this.writer = writer;
        this.title = title;
        
    }
public void play(){
    song.blockingPlay();
earnings += royalty;
numPlays++;
}
public void purchase(){
    earnings += songPrice;
numPurchases++;
}

    public float getEarnings() {
        return earnings;
    }

    public MusicGroup getGroup() {
        return group;
    }

    public Sound getSong() {
        return song;
    }

    public String getWriter() {
        return writer;
    }
    public void addPlayerInstruments(String artist, ArrayList<Artist.Instrument> instruments){
    players.add(new ArtistInstrumentsPlayed(instruments,this ,artist));
}

    public ArrayList<ArtistInstrumentsPlayed> getPlayers() {
        return players;
    }

    public String getTitle() {
        return title;
    }

}

class ArtistInstrumentsPlayed {
private ArrayList<Artist.Instrument> instrumentsPlayed;
private Song song;
private String artistName;

    public ArtistInstrumentsPlayed(ArrayList<Artist.Instrument> instrumentsPlayed, Song song, String artistName) {
        this.instrumentsPlayed = instrumentsPlayed;
        this.song = song;
        this.artistName = artistName;
    }

    public ArrayList<Artist.Instrument> getInstrumentsPlayed() {
        return instrumentsPlayed;
    }

    public Song getSong() {
        return song;
    }

    public String getArtistName() {
        return artistName;
    }

}