import java.util.ArrayList;

public class Album {
    private String title;
    private ArrayList<Song> songs;

    public Album(String title, ArrayList<Song> songs) {
        this.title = title;
        this.songs = songs;
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<Song> getSongs() {
        return this.songs;
    }
}
