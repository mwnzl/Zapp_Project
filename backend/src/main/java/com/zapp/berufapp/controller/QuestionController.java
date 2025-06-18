package com.zapp.berufapp.controller;

import com.zapp.berufapp.dto.QuestionDTO;
import com.zapp.berufapp.service.QuestionService;
import com.zapp.berufapp.service.ResultService;
import org.springframework.http.ResponseEntity;
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
    public List<QuestionDTO> getQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping()
    public ResponseEntity<?> saveQuestions(@RequestBody QuestionDTO questionDTO) {
        boolean saveResultBoolean = questionService.saveQuestion(questionDTO);
        return ResponseEntity.ok(saveResultBoolean);
    }

    @DeleteMapping()
    public ResponseEntity<?> deleteQuestions(@RequestBody QuestionDTO questionDTO) {
        boolean deleteResultBoolean = questionService.deleteQuestion(questionDTO.getId());
        return ResponseEntity.ok(deleteResultBoolean);
    }

}

