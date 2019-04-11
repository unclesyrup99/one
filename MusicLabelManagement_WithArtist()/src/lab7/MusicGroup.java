/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;
import java.util.ArrayList;

/**
 *
 * @author Rahul Gawdi
 */
public class MusicGroup {
    
    private float earnings;
    private String groupName;
    private ArrayList<Album> albums = new ArrayList <Album>();
    private ArrayList<Song> songs = new ArrayList <Song>();
    private ArrayList<Artist> performers = new ArrayList <Artist>();

    public MusicGroup(String groupName, String memberName, Artist.Instrument instrument) {
        this.earnings = 0.0f;
        this.groupName = groupName;
        Artist newArtist = new Artist (memberName, instrument);
        System.out.println("Artist Added: "+ memberName + instrument.toString());
        performers.add(newArtist);
        
        
    }
    public String getGroupName(){
        
        return groupName;
        
    }

    public float getEarnings() {
        // recalculate total earnings
earnings = 0.0f;
for (Album a : albums) {
earnings += a.getEarnings();
}
for (Song s : songs) {
earnings += s.getEarnings();
}
return earnings;
        
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public ArrayList<Artist> getPerformers() {
        return this.performers;
    }
    public void addMember(Artist Artist){
        System.out.println("Artist Added: "+ Artist.getArtistName());
        this.performers.add(Artist);
    }
    public void addAlbum(Album album){
        albums.add(album);
    }
    public void addSong (Song song){
        songs.add(song);
    }
    
}
