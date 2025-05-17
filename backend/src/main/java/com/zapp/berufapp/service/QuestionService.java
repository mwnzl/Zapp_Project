package com.zapp.berufapp.service;

import com.zapp.berufapp.entity.Point;
import com.zapp.berufapp.entity.Option;
import com.zapp.berufapp.entity.Question;
import com.zapp.berufapp.repository.QuestionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Transactional
    public Question saveQuestion(Question question) {

        for (Option option : question.getOptions()) {
            option.setQuestion(question);

            if (option.getPoints() != null) {
                for (Point point : option.getPoints()) {
                    point.setOption(option);
                }
            }
        }
        return questionRepository.save(question);
    }
}

