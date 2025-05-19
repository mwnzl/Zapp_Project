package com.zapp.berufapp.dto;

import java.util.Map;


public class OptionDTO {
    private String text;
    private Map<String, Integer> points;

    public OptionDTO() {}
    public OptionDTO(String text, Map<String, Integer> points) {
        this.text = text;
        this.points = points;
    }

    public String getText() {        return text;    }
    public void setText(String text) {        this.text = text;    }

    public Map<String, Integer> getPoints() {        return points;    }
    public void setPoints(Map<String, Integer> points) {        this.points = points;    }
}
