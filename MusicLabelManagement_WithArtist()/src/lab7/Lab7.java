/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import BookClasses.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rahul Gawdi
 */
public class Lab7 {

    private ArrayList<MusicGroup> groups = new ArrayList<MusicGroup>();
    private ArrayList<Album> albums = new ArrayList<Album>();
    private ArrayList<Song> songs = new ArrayList<Song>();

    /**
     * constructor
     */
    public Lab7() {

        // add a bunch of music groups, songs and albums 
        initialize();

        // get interactive with the user, playing songs and letting them buy them
        Scanner s = new Scanner(System.in);
        // type a 0 to stop playing songs
        try {
            System.out.println("Jukebox starting. Type a '1' to play a song. Type a '0' to end.");
            while (s.nextInt() != 0) {
                jukebox();
                System.out.println("Type a '1' to play another song. Type a '0' to end.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Sorry, but you can only type integers. Jukebox ending.");
        }

        // when done with interactive portion, 
        // iterate through the record label's groups, printing out revenues of each
        for (MusicGroup group : groups) {
            System.out.println(group.getGroupName() + " has earned " + group.getEarnings() + " so far.");
        }

    }

    /**
     * @param args the command line arguments
     */
    public void initialize() {

        FileChooser.setMediaPath("C:\\Users\\Rahul Gawdi\\Downloads\\mediasources\\SongSnippets\\");
        // Artist paul = new Artist("Paul McCartney", Instrument.VOCALS);
        // create the first group (Beatles)
        MusicGroup beatles = new MusicGroup("Beatles", "Paul McCartney", Artist.Instrument.VOCALS);
        beatles.addMember(new Artist("Ringo Star", Artist.Instrument.DRUMS));
        beatles.addMember(new Artist("John Lennon", Artist.Instrument.GUITAR));
        beatles.addMember(new Artist("George Harrison", Artist.Instrument.PIANO));
        // add to list of record label's groups
        groups.add(beatles);
        // create new album
        Album album1 = new Album("Greatest Hits", "Random Person", 9.99f, beatles);

        //***** Change the song file names below to match song snippet files that you downloaded at the beginning ****
        //****** otherwise you will be listening to 'thisisatest' over and over again! ******
        Song song1 = new Song(new Sound(FileChooser.getMediaPath("Can'tBuyMeLove.wav")), "Can't Buy Me Love", "random dude", beatles, 0.01f, 0.99f);
        beatles.addSong(song1);
        album1.addSong(song1);
        ArrayList<Artist.Instrument> pm = new ArrayList<>();
        pm.add(Artist.Instrument.VOCALS);
        pm.add(Artist.Instrument.BASS);
        song1.addPlayerInstruments("Paul McCartney", pm);
                songs.add(song1);

        ArrayList<Artist.Instrument> am = new ArrayList<>();
        am.add(Artist.Instrument.DRUMS);
        song1.addPlayerInstruments("Ringo Starr", am);
        ArrayList<Artist.Instrument> dm = new ArrayList<>();
        dm.add(Artist.Instrument.GUITAR);
        song1.addPlayerInstruments("John Lennon", dm);
        ArrayList<Artist.Instrument> cm = new ArrayList<>();
        cm.add(Artist.Instrument.KEYBOARD);
        song1.addPlayerInstruments("George Harrison", cm);
        Song song2 = new Song(new Sound(FileChooser.getMediaPath("PennyLane.wav")), "Penny Lane", "random dude", beatles, 0.01f, 0.99f);
        beatles.addSong(song2);
        songs.add(song2);
        album1.addSong(song2);
        Song song3 = new Song(new Sound(FileChooser.getMediaPath("YellowSubmarine.wav")), "Yellow Submarine", "random dude", beatles, 0.01f, 0.99f);
        beatles.addSong(song3);
        songs.add(song3);
        album1.addSong(song3);
        Song song4 = new Song(new Sound(FileChooser.getMediaPath("PaperbackWriter.wav")), "Paperback Writer", "random dude", beatles, 0.01f, 0.99f);
        beatles.addSong(song4);
        songs.add(song4);
        album1.addSong(song4);
        Song song5 = new Song(new Sound(FileChooser.getMediaPath("HardDaysNight.wav")), "Hard Day's Night", "random dude", beatles, 0.01f, 0.99f);
        beatles.addSong(song5);
        album1.addSong(song5);
        songs.add(song5);

        // add this album to beatles list of albums
        beatles.addAlbum(album1);
        // add this album to the record label's list of albums
        albums.add(album1);

    }

    public void jukebox() {
        int index = (int) (Math.random() * songs.size());
        Song song = songs.get(0);
        System.out.println("Playing " + song.getTitle() + " by " + song.getGroup().getGroupName() + ", written by: " + song.getWriter());
        ArrayList<ArtistInstrumentsPlayed> actual_Performers = song.getPlayers();
        if (actual_Performers.isEmpty()) {
            for (Artist name : song.getGroup().getPerformers()) {
                System.out.println(name.getArtistName());
                //System.out.print(name.getArtistName() + " - " + name.getUsualInstrument().toString() + ", ");
            }
        } else {
            for (int i = 0; i < actual_Performers.size(); i++) {
               
                System.out.println(actual_Performers.get(i).getArtistName());

                for (int j = 0; j < actual_Performers.get(i).getInstrumentsPlayed().size(); j++) {
                    System.out.println(actual_Performers.get(i).getInstrumentsPlayed().get(j).toString());

                }
            }

            song.play();

            System.out.println("Would you like to purchase this song? (Y/N)");
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);
            if (c == 'Y' || c == 'y') {
                song.purchase();
                System.out.println("Thank-you for your purchase!");
            }
        }
    }
}
