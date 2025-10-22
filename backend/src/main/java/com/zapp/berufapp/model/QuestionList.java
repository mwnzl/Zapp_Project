package com.zapp.berufapp.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "questions")
public class QuestionList {
    private List<Question> question;

    @XmlElement(name = "question")
    public List<Question> getQuestion() { return question; }

    public void setQuestion(List<Question> question) { this.question = question; }
}
