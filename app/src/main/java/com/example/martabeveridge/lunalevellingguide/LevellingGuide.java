package com.example.martabeveridge.lunalevellingguide;

import java.util.ArrayList;

public class LevellingGuide {

    private ArrayList<Level> list;

    public LevellingGuide() {
        list = new ArrayList<Level>();
        list.add(new Level(1, "Lunar Blessing", 1));
        list.add(new Level(2, "Lucent Beam", 1));
        list.add(new Level(3, "Lucent Beam", 2));
        list.add(new Level(4, "Moon Glaves", 1));
        list.add(new Level(5, "Lucent Beam", 3));
        list.add(new Level(6, "Eclipse", 1));
        list.add(new Level(7, "Lucent Beam", 4));
        list.add(new Level(8, "Moon Glaves", 2));
        list.add(new Level(9, "Moon Glaves", 3));
        list.add(new Level(10, "+20 Attack Speed", 1));
        list.add(new Level(11, "Moon Glaves", 4));
        list.add(new Level(12, "Eclipse", 2));
        list.add(new Level(13, "Lunar Blessing", 2));
        list.add(new Level(14, "Lunar Blessing", 3));
        list.add(new Level(15, "+24 Lunar Blessing Damage", 2));
        list.add(new Level(16, "Lunar Blessing", 4));
        list.add(new Level(18, "Eclipse", 3));
        list.add(new Level(20, "+10 All Stats", 3));
        list.add(new Level(25, "25% Lifesteal", 4));
    }

    public ArrayList<Level> getList() {
        return new ArrayList<>(list);
    }

}
