package com.shafira.project01.model;

public class TV {
    private String judul;
    private int gambar;
    private int id;
    private int airedseason;
    private String firstaired;
    private GuestStar guestStar;
    private String director;
    private double rating;

    public TV() {

    }

    public TV(int id, int airedseason, String firstaired, GuestStar guestStar, String director, double star) {
        this.id = id;
        this.airedseason = airedseason;
        this.firstaired = firstaired;
        this.guestStar = guestStar;
        this.director = director;
        this.rating = star;
    }
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAiredseason() {
        return airedseason;
    }

    public void setAiredseason(int airedseason) {
        this.airedseason = airedseason;
    }

    public String getFirstaired() {
        return firstaired;
    }

    public void setFirstaired(String firstaired) {
        this.firstaired = firstaired;
    }

    public GuestStar getGuestStar() {
        return guestStar;
    }

    public void setGuestStar(GuestStar guestStar) {
        this.guestStar = guestStar;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "TV{" +
                "id=" + id +
                ", airedseason=" + airedseason +
                ", firstaired='" + firstaired + '\'' +
                ", guestStar=" + guestStar +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                '}';
    }
}
