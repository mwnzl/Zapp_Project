package com.zapp.berufapp.controller;

import com.zapp.berufapp.entity.Question;
import com.zapp.berufapp.repository.QuestionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/quiz")
public class QuizController {

    private final QuestionRepository questionRepository;

    public QuizController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping
    public @ResponseBody Iterable<Question> getQuiz() {
        return questionRepository.findAll();
    }

    @PostMapping
    public @ResponseBody Question addQuestion(Question newQuestion) {
        return questionRepository.save(newQuestion);
    }
}
