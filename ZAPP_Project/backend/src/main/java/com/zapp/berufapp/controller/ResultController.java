package com.zapp.berufapp.controller;

import com.zapp.berufapp.entity.Result;
import com.zapp.berufapp.service.ResultService;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api/results")
public class ResultController {

    private final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @PostMapping()
    public ResponseEntity<Result> saveResult(HttpSession session, @RequestBody Result result) {
        String sessionID = session.getId();
        result.setUserId(sessionID);
        Result saved = resultService.saveResult(result);
        return ResponseEntity.ok(saved);

    }

    @GetMapping()
    public ResponseEntity<List<Result>> getResults() {
        List<Result> allResults = resultService.getAllResults();
        return ResponseEntity.ok(allResults);
    }
}
