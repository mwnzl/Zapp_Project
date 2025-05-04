package com.zapp.berufapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    private int points;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public Answer(){}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getText() {return text;}

    public void setText(String text) {this.text = text;}

    public int getPoints() {return points;}

    public void setPoints(int points) {this.points = points;}

    public void setQuestion(Question question) {
        this.question = question;
    }
}

