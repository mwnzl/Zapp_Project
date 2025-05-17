package com.zapp.berufapp.controller;

import com.zapp.berufapp.entity.Question;
import com.zapp.berufapp.service.QuestionService;
import com.zapp.berufapp.service.ResultService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService, ResultService resultService) {
        this.questionService = questionService;
    }

    @GetMapping()
    public List<Question> getQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping()
    public Question saveQuestions(@RequestBody Question question) {
        return questionService.saveQuestion(question);
    }
}

