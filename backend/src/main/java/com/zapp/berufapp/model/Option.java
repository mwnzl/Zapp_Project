package com.zapp.berufapp.model;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;

public class Option {
    private boolean correct;
    private String value;

    @XmlAttribute
    public void setCorrect(boolean correct) { this.correct = correct; }
    public boolean isCorrect() { return correct; }

    @XmlValue
    public void setValue(String value) { this.value = value; }
    public String getValue() { return value; }
}
