package com.example.songvalidate.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Song {
    @NotEmpty
    @Size(max = 800)
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$")
    private String name;

    @NotEmpty
    @Size(max = 300)
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$")
    private String artist;

    @NotEmpty
    @Size(max = 1000)
    @Pattern(regexp = "^[a-zA-Z0-9, ]*$")
    private String category;

    public Song() {
    }

    public Song(String name, String artist, String category) {
        this.name = name;
        this.artist = artist;
        this.category = category;
    }

    public @NotEmpty @Size(max = 800) @Pattern(regexp = "^[a-zA-Z0-9 ]*$") String getName() {
        return name;
    }

    public void setName(@NotEmpty @Size(max = 800) @Pattern(regexp = "^[a-zA-Z0-9 ]*$") String name) {
        this.name = name;
    }

    public @NotEmpty @Size(max = 300) @Pattern(regexp = "^[a-zA-Z0-9 ]*$") String getArtist() {
        return artist;
    }

    public void setArtist(@NotEmpty @Size(max = 300) @Pattern(regexp = "^[a-zA-Z0-9 ]*$") String artist) {
        this.artist = artist;
    }

    public @NotEmpty @Size(max = 1000) @Pattern(regexp = "^[a-zA-Z0-9, ]*$") String getCategory() {
        return category;
    }

    public void setCategory(@NotEmpty @Size(max = 1000) @Pattern(regexp = "^[a-zA-Z0-9, ]*$") String category) {
        this.category = category;
    }
}
