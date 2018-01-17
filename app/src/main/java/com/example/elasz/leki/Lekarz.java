package com.example.elasz.leki;

/**
 * Created by elasz on 17.01.2018.
 */

public class Lekarz {

    private String imie;
    private String specjalizacja;

    public Lekarz (String imie, String specjalizacja){
        this.imie = imie;
        this.specjalizacja = specjalizacja;
    }
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }


}


