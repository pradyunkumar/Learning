package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Show implements ISaveable {
    private String name;
    private String director;
    private int duration;
    private ArrayList<String> elements;

    public Show(String name, String director, int duration) {
        this.name = name;
        this.director = director;
        this.duration = duration;
        this.elements = new ArrayList<String>();
    }

    @Override
    public String toString() {
        String thisduration = Integer.toString(duration);
        return "Show{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", duration=" + thisduration +
                ", elements=" + elements +
                '}';
    }

    @Override
    public List<String> write() {
        this.elements.add(0, name);
        this.elements.add(1, director);
        this.elements.add(2, Integer.toString(duration));

        return this.elements;
    }

    @Override
    public void saved(List<String> values) {

    }
}
