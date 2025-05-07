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

    // Геттеры и сеттеры
}
