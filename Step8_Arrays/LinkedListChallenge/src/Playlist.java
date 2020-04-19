import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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

    public static void menuOfOptions(LinkedList playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<Song> playlistTool = playlist.listIterator();

        if (playlist.isEmpty()) {
            System.out.println("There are no songs in the playlist");
        } else {
            System.out.println("Song playing from Playlist is: " + playlistTool.next());
            printMenu();
        }
        
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress ");
        System.out.println("0 - Quit\n" +
                            "1 - Skip forward to next song\n" +
                            "2 - Skip backwards to previous song\n" +
                            "3 - Replay the current song\n" +
                            "4 - List playlist songs");
    }

}
