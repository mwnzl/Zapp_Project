package com.zapp.berufapp.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import java.util.List;

public class Question {
    private int id;
    private String text;
    private List<Option> option;

    @XmlAttribute
    public void setId(int id) { this.id = id; }
    public int getId() { return id; }

    @XmlElement
    public void setText(String text) { this.text = text; }
    public String getText() { return text; }

    @XmlElement(name = "option")
    public void setOption(List<Option> option) { this.option = option; }
    public List<Option> getOption() { return option; }
}
