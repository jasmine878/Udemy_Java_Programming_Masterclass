//WE'RE RECONFIGURING OUR LISTITERATOR_w_SCANNER PROJECT TO UTILIZE AN INNER CLASS
//ONLY THE ALBUM CLASS IS CHANGING
//THE MAIN CLASS AND SONG CLASS SHOULD REMAIN UNCHANGED!!

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String title;
    private String artist;
    private SongList songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new SongList();
    }

    //if the title doesn't exist in the album then add the song, else return false since it's already in the album
    public boolean addSong(String title, double duration) {
        Song newSong = new Song(title, duration);

        //THIS IS REFERENCING THE .ADD() METHOD IN OUR SONGLIST INNER CLASS!!
        return this.songs.add(newSong);        //GAVE AN ERROR BECAUSE I NEEDED TO CREATE THE INNER CLASS METHOD ADD()
    }

    //we add() the song from the album to the end of the playlist
    //trackNumber is converted to the index in our LinkedList which starts at index 0
    //we get() the song from our album using the index
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song foundSong = this.songs.findSong(trackNumber);

        if (foundSong != null) {
            playlist.add(foundSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;

        //Java is looking for .size() and .get from the inner Class method
        //this.songs is referencing the SongList class now
        //this is why we need to add our methods in the SongList class
//        if (index >= 0 && (index <= this.songs.size())) {             //GIVES AN ERROR!!
//            Song foundSong = this.songs.get(index);                   //GIVES AN ERROR!!
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        //Java is looking for the findSong(title) method in the Inner Class
        Song foundSong = this.songs.findSong(title);

        if (foundSong != null) {
            playlist.add(foundSong);
            return true;
        } else {
            System.out.println("This album does not have song " + title);
            return false;
        }
    }

    //Use an inner class to hold the ArrayList of Songs, instead of the outer Album class
    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (this.songs.contains(song)) {
                return false;
            }
            this.songs.add(song);

            return true;
        }

        //MOVE THE FUNCTIONALITY OF THE FINDSONG METHOD FROM THE OUTER CLASS TO THE INNER CLASS!!
        public Song findSong(String title) {
            for (Song currentSong: this.songs) {
                if (currentSong.getTitle().equals(title)) {
                    return currentSong;
                }
            }
            return null;
        }

        //overload the findSong method to take a track number as a parameter
        public Song findSong(int trackNumber) {
            //REMEMBER indexes start from 0 so we need to subtract 1 from the trackNumber
            int index = trackNumber - 1;
            if (index >= 0 && index < this.songs.size()) {
                return songs.get(index);
            }

            return null;
        }
    }

}
