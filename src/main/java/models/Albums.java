package models;
import java.io.Serializable;
import java.util.Date;

public class Albums implements Serializable{
    public int id;
    public String artistName;
    public String albumName;
    public String genre;
    public int releaseDate;
    public double sales;


    public Albums(int id, String artistName, String albumName, String genre, int releaseDate, double sales) {
        this.id = id;
        this.artistName = artistName;
        this.albumName = albumName;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.sales = sales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}

