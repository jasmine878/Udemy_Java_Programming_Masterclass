import java.util.ArrayList;

public class Album {
    private String title;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<Song> getSongs() {
        return this.songs;
    }

    public boolean hasSong(Song song) {
        if (this.songs.contains(song)) return true;

        return false;
    }


}
