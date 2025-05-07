package com.zapp.berufapp.entity;

import jakarta.persistence.*;
import java.util.Map;

@Entity
@Table(name = "results")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;

    @ElementCollection
    @CollectionTable(name = "result_scores", joinColumns = @JoinColumn(name = "result_id"))
    @MapKeyColumn(name = "profession")
    @Column(name = "score")
    private Map<String, Integer> professionScores;

    public Result() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, Integer> getProfessionScores() {
        return professionScores;
    }

    public void setProfessionScores(Map<String, Integer> professionScores) {
        this.professionScores = professionScores;
    }
}
