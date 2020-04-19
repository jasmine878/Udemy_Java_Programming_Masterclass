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


}
