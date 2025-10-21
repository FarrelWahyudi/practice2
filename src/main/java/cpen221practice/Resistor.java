package cpen221practice;

import java.util.HashMap;
import java.util.Map;

class Resistor {
    private String resColor;
    private Map<String, Integer> colorMap;

    int colorCode(String color) {
        this.resColor = color;
        this.colorMap = new HashMap<String, Integer>();
        colorMap.put("black", 0);
        colorMap.put("brown", 1);
        colorMap.put("red", 2);
        colorMap.put("orange", 3);
        colorMap.put("yellow", 4);
        colorMap.put("green", 5);
        colorMap.put("blue", 6);
        colorMap.put("violet", 7);
        colorMap.put("grey", 8);
        colorMap.put("white", 9);
        if (resColor == null) {
            throw new IllegalArgumentException("color cannot be null");
        }
        Integer value = colorMap.get(resColor);
        return value;
    }

    String[] colors() {
        return new String[]{
                "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
        };
    }
}
