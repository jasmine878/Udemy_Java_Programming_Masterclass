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

    public void addSong(Albums albums, Album album, Song song) {
        if (!albums.hasAlbum(album)) {
            System.out.println("Your albums does not contain that album");
        } else if (!album.hasSong(song)) {
            System.out.println("Your album does not contain that song");
        } else {
            System.out.println("Song was successfully added to your playlist");
            playlist.add(song);
        }
    }
}
