package com.zapp.berufapp.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Option> options = new ArrayList<>();

    public Question() {}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getText() {return text;}

    public void setText(String text) {this.text = text;}

    public List<Option> getOptions() {return options;}

    public void setOptions(List<Option> options) {this.options = options;}
}
