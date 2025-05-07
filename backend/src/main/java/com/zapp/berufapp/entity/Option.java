package com.zapp.berufapp.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "options")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @OneToMany(mappedBy = "option", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Point> points;

    public Option() {}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getText() {return text;}

    public void setText(String text) {this.text = text;}

    //public Question getQuestion() {return question;}

    public void setQuestion(Question question) {this.question = question;}

    public List<Point> getPoints() {return points;}

    public void setPoints(List<Point> points) {this.points = points;}
}

