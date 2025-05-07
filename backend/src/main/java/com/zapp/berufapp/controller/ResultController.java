package com.zapp.berufapp.controller;

import com.zapp.berufapp.entity.Question;
import com.zapp.berufapp.entity.Result;
import com.zapp.berufapp.repository.QuestionRepository;
import com.zapp.berufapp.service.ResultService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/api/results")
public class ResultController {

    private final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @PostMapping("/results")
    public ResponseEntity<Result> saveResult(@RequestBody Result result) {
        Result saved = resultService.saveResult(result);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/results")
    public List<Result> getResults() {
        return resultService.getAllResults();
    }
}
