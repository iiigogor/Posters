package ru.netology;


public class Film {
    private int id;
    private String picture;
    private String name;
    private String genre;

    public Film (int limitFilms){
        limitFilms=10;
    }

    public Film(int id, String picture, String name, String genre) {
        this.id = id;
        this.picture = picture;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
