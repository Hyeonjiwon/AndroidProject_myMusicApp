package com.example.task8;

//아이템이 출력될 데이터를 위한 클래스

import android.graphics.drawable.Drawable;

public class ArtistDTO {
    private Drawable image;
    private String name;
    private String debut;
    private String agency;
    private String award;

    public ArtistDTO() {
        this.image = image;
        this.name = name;
        this.debut = debut;
        this.agency = agency;
        this.award = award;
    }

    public void setImage(Drawable image) { this.image = image;}

    public void setName(String name) {
        this.name = name;
    }

    public void setDebut(String debut) { this.debut = debut; }

    public void setAgency(String agency) { this.agency = agency; }

    public void setAward(String award) { this.award = award; }

    public Drawable getImage() { return this.image; }

    public String getName() {
        return this.name;
    }

    public String getDebut() {
        return this.debut;
    }

    public String getAgency() {
        return this.agency;
    }

    public String getAward() {
        return this.award;
    }
}
