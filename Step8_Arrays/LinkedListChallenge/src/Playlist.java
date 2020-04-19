import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private ArrayList<Album> albums;
    private LinkedList<Song> playlist;

    public Playlist(ArrayList<Album> albums, LinkedList<Song> playlist) {
        this.albums = albums;
        this.playlist = playlist;
    }

    public ArrayList<Album> getAlbums() {
        return this.albums;
    }

    public LinkedList<Song> getPlaylist() {
        return this.playlist;
    }
    
}
