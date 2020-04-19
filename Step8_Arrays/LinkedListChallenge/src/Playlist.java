import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private LinkedList<Song> playlist;

    public Playlist(ArrayList<Album> albums, LinkedList<Song> playlist) {
        this.playlist = playlist;
    }

    public LinkedList<Song> getPlaylist() {
        return this.playlist;
    }
    
}
