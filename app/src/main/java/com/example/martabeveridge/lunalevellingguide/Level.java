package com.example.martabeveridge.lunalevellingguide;

public class Level {

    private Integer ranking;
    private String name;
    private Integer level;

    public Level(Integer ranking, String name, Integer level) {
        this.ranking = ranking;
        this.name = name;
        this.level = level;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }
}
