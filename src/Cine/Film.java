package Cine;

import java.util.Date;

public class Film {
    final private String title;
    final private int peggy;
    final private String director;
    final private int duration;

    public Film(String title, int peggy, String director, int duration){
        this.title = title;
        this.peggy = peggy;
        this.director = director;
        this.duration = duration;
    }

    public int getPeggy() {
        return peggy;
    }
}
