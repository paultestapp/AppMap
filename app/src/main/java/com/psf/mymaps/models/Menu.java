package com.psf.mymaps.models;

/**
 * Created by paulsalcedo on 25/2/18.
 */

public class Menu {

    private int photo;
    private String geolocation;

    public Menu(int photo, String geolocation) {
        this.photo = photo;
        this.geolocation = geolocation;
    }

    public String getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
