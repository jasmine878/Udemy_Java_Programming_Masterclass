import java.util.ArrayList;

public class Albums {
    private String title;
    private ArrayList<Album> albums;

    public Albums(String title, ArrayList<Album> albums) {
        this.title = title;
        this.albums = albums;
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<Album> getAlbums() {
        return this.albums;
    }

    public boolean hasAlbum(Album album) {
        if (this.albums.contains(album)) return true;

        return false;
    }
}
