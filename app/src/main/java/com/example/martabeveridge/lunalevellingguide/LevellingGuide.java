package com.example.martabeveridge.lunalevellingguide;

import java.util.ArrayList;

public class LevellingGuide {

    private ArrayList<Level> list;

    public LevellingGuide() {
        list = new ArrayList<Level>();
        list.add(new Level(1, "Lunar Blessing", "passive", 1));
        list.add(new Level(2, "Lucent Beam", "to target a unit", 1));
        list.add(new Level(3, "Lucent Beam", "to target a unit", 2));
        list.add(new Level(4, "Moon Glaves", "passive", 1));
        list.add(new Level(5, "Lucent Beam", "to target a unit", 3));
        list.add(new Level(6, "Eclipse", "going to affect an area", 1));
        list.add(new Level(7, "Lucent Beam", "to target a unit", 4));
        list.add(new Level(8, "Moon Glaves", "passive", 2));
        list.add(new Level(9, "Moon Glaves", "passive", 3));
        list.add(new Level(10, "+20 Attack Speed", "to improve the hero",1));
        list.add(new Level(11, "Moon Glaves", "passive", 4));
        list.add(new Level(12, "Eclipse", "going to affect an area", 2));
        list.add(new Level(13, "Lunar Blessing", "passive", 2));
        list.add(new Level(14, "Lunar Blessing", "passive", 3));
        list.add(new Level(15, "+24 Lunar Blessing Damage", "to improve the hero",2));
        list.add(new Level(16, "Lunar Blessing", "passive", 4));
        list.add(new Level(18, "Eclipse","going to affect an area", 3));
        list.add(new Level(20, "+10 All Stats", "to improve the hero", 3));
        list.add(new Level(25, "25% Lifesteal", "to improve the hero", 4));
    }

    public ArrayList<Level> getList() {
        return new ArrayList<>(list);
    }

}
