import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String title;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

//    public String getTitle() {
//        return this.title;
//    }
//
//    public ArrayList<Song> getSongs() {
//        return this.songs;
//    }

    private Song findSong(String title) {
        for (Song currentSong: this.songs) {
            if (currentSong.getTitle().equals(title)) {
                return currentSong;
            }
        }
        return null;
    }

    //if the title doesn't exist in the album then add the song, else return false since it's already in the album
    public boolean addSong(String title, double duration) {
        Song newSong = new Song(title, duration);

        if (findSong(title) == null) {
            this.songs.add(newSong);
            return true;
        } else {
            return false;
        }
    }

    //we add() the song from the album to the end of the playlist
    //trackNumber is converted to the index in our LinkedList which starts at index 0
    //we get() the song from our album using the index
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;

        if (index >= 0 && (index <= this.songs.size())) {
            Song foundSong = this.songs.get(index);

            playlist.add(foundSong);

            return true;
        } else {
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song foundSong = findSong(title);

        if (foundSong != null) {
            playlist.add(foundSong);
            return true;
        } else {
            System.out.println("This album does not have song " + title);
            return false;
        }
    }

}
