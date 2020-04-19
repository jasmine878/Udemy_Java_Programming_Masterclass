import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private LinkedList<Song> playlist;

    public Playlist() {
        this.playlist = new LinkedList<Song>();
    }

    public LinkedList<Song> getPlaylist() {
        return this.playlist;
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
                        System.out.println("Song playing from Playlist is: " + playlistTool.next());
                    } else {
                        System.out.println("Reached the end of the Playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if(playlistTool.hasPrevious()) playlistTool.previous();
                        goingForward = false;
                    }

                    if(playlistTool.hasPrevious()) {
                        System.out.println("Song playing from Playlist is: " + playlistTool.previous());
                    } else {
                        System.out.println("Reached the beginning of the Playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if (!goingForward) {
                        System.out.println("Song playing from Playlist is: " + playlistTool.next());
                        playlistTool.previous();
                    } else {
                        System.out.println("Song playing from Playlist is: " + playlistTool.previous());
                        playlistTool.next();
                    }
                    break;
                case 4:
                    printMenu();
                    break;
            }
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
