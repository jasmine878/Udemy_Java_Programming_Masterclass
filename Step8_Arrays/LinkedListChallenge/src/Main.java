import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private static ArrayList<Album> myAlbums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");

        album.addSong("Stormbinger", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy Man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The Gypsy", 4.2);
        album.addSong("Soldier of Fortune", 3.13);
        myAlbums.add(album);

        album = new Album("For those about to rock", "AC/DC");

        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Let's go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        myAlbums.add(album);

        LinkedList<Song> myPlaylist = new LinkedList<Song>();

        myAlbums.get(0).addToPlayList("You can't do it right", myPlaylist);
        myAlbums.get(0).addToPlayList("Holy Man", myPlaylist);
        myAlbums.get(0).addToPlayList("Speed King", myPlaylist);        //Testing does not exist
        myAlbums.get(0).addToPlayList(9, myPlaylist);
        myAlbums.get(1).addToPlayList(8, myPlaylist);
        myAlbums.get(1).addToPlayList(3, myPlaylist);
        myAlbums.get(1).addToPlayList(2, myPlaylist);
        myAlbums.get(1).addToPlayList(24, myPlaylist);          //Testing does not exist

//        play(myPlaylist);
    }
}
