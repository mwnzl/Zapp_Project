package com.zapp.berufapp.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "points")
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String profession;

    private int score;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;

    public Point() {}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getProfession() {return profession;}

    public void setProfession(String profession) {this.profession = profession;}

    public int getScore() {return score;}

    public void setScore(int score) {this.score = score;}

    public void setOption(Option option) {this.option = option;}
}
