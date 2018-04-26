package com.example.martabeveridge.lunalevellingguide;

public class Level {

    private Integer ranking;
    private String name;
    private String target;
    private Integer level;

    public Level(Integer ranking, String name, String target, Integer level) {
        this.ranking = ranking;
        this.name = name;
        this.target = target;
        this.level = level;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public String getTarget() {
        return target;
    }

    public Integer getLevel() {
        return level;
    }
}
