import java.util.*;

public class Main {
    private static List<Album> myAlbums = new ArrayList<Album>();

    public static void main(String[] args) {
        //create a new Album
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

        //create a second Album
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

        //create a playlist as a LinkedList
//        List<Song> myPlaylist = new ArrayList<Song>();
        List<Song> myPlaylist = new Vector<Song>();

        myAlbums.get(0).addToPlayList("You can't do it right", myPlaylist);
        myAlbums.get(0).addToPlayList("Holy Man", myPlaylist);
        myAlbums.get(0).addToPlayList("Speed King", myPlaylist);        //Testing does not exist
        myAlbums.get(0).addToPlayList(9, myPlaylist);
        myAlbums.get(1).addToPlayList(8, myPlaylist);
        myAlbums.get(1).addToPlayList(3, myPlaylist);
        myAlbums.get(1).addToPlayList(2, myPlaylist);
        myAlbums.get(1).addToPlayList(24, myPlaylist);          //Testing does not exist

        play(myPlaylist);
    }

    private static void play(List<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<Song> playlistTool = playlist.listIterator();

        if (playlist.isEmpty()) {
            System.out.println("There are no songs in the playlist");
        } else {
            System.out.println("Song playing from Playlist is: " + playlistTool.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Exiting playlist");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(playlistTool.hasNext()) playlistTool.next();
                        goingForward = true;
                    }

                    if (playlistTool.hasNext()) {
                        //toString is the default option.  It's not required to add it here
                        System.out.println("Now playing " + playlistTool.next().toString());
                    } else {
                        System.out.println("Reached the end of the Playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        //toString is the default option.  It's not required to add it here
                        if(playlistTool.hasPrevious()) playlistTool.previous();
                        goingForward = false;
                    }

                    if(playlistTool.hasPrevious()) {
                        System.out.println("Now playing " + playlistTool.previous().toString());
                    } else {
                        System.out.println("Reached the beginning of the Playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                        //TIM'S WAY!!!
//                    //if we're going backwards, we have to go forwards to replay the song
//                    if (!goingForward) {
//                        if (playlistTool.hasNext()) {
//                            System.out.println("Now playing " + playlistTool.next());
//                            goingForward = true;
//                        } else {
//                            System.out.println("Reached the end of the Playlist");
//                        }
//                    } else {
//                        //if we're going forwards, we have to go backwards to replay the song
//                        if (playlistTool.hasPrevious()) {
//                            System.out.println("Now playing " + playlistTool.previous());
//                            goingForward = false;
//                        } else {
//                            System.out.println("Reached the beginning of the Playlist");
//                        }
//                    }

                    //MY WAY!!!
                    if (!goingForward) {
                        if (playlistTool.hasNext()) {
                            System.out.println("Now playing " + playlistTool.next());
                            playlistTool.previous();
                        } else {
                            System.out.println("Reached the end of the Playlist");
                        }
                    } else {
                        if (playlistTool.hasPrevious()) {
                            System.out.println("Now playing " + playlistTool.previous());
                            playlistTool.next();
                        } else {
                            System.out.println("Reached the beginning of the Playlist");
                        }
                    }
                    break;
                case 4:
                    printPlaylist(playlist);
                case 5:
                    printMenu();
                    break;
                case 6:
                    //when we delete a song, the next song is automatically playing here
                    if (playlist.size() > 0) {
                        //removes the current song
                        playlistTool.remove();
                        if (playlistTool.hasNext()) {
                            System.out.println("Now playing " + playlistTool.next());
                        } else if(playlistTool.hasPrevious()) {
                            System.out.println("Now playing " + playlistTool.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printPlaylist(List<Song> playlist) {
        System.out.println("===========================");
        for (Song songObj: playlist) {
            System.out.println(songObj.toString());
        }
        System.out.println("===========================");
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress ");
        System.out.println("0 - Quit\n" +
                "1 - Play next song\n" +
                "2 - Play previous song\n" +
                "3 - Replay the current song\n" +
                "4 - List playlist songs\n" +
                "5 - Print available actions\n" +
                "6 - Remove song");
    }

}
