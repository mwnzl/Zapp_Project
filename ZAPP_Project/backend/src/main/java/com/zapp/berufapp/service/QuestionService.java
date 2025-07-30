package com.zapp.berufapp.service;

import com.zapp.berufapp.dto.OptionDTO;
import com.zapp.berufapp.dto.QuestionDTO;
import com.zapp.berufapp.entity.Point;
import com.zapp.berufapp.entity.Option;
import com.zapp.berufapp.entity.Question;
import com.zapp.berufapp.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<QuestionDTO> getAllQuestions() {
    List<Question> questions = questionRepository.findAll();

    List<QuestionDTO> dtos = questions.stream()
            .map(question -> {
                List<OptionDTO> optionDTOs = question.getOptions().stream()
                        .map(option -> {
                            Map<String, Integer> pointsMap = new HashMap<>();
            if (option.getPoints() != null) {
                for (Point point : option.getPoints()) {
                    pointsMap.put(point.getProfession(), point.getScore());
                }
            }
            return new OptionDTO(option.getText(), pointsMap);
        }).toList();

        return new QuestionDTO(question.getText(), optionDTOs);
    }).toList();

    return dtos;
}

    public boolean saveQuestion(QuestionDTO questionDTO) {
        Question question = new Question();
        question.setText(questionDTO.getText());

        for (OptionDTO optionDTO : questionDTO.getOptions()) {
            Option option = new Option();
            option.setText(optionDTO.getText());
            option.setQuestion(question);

            List<Point> points = new ArrayList<>();
            if (optionDTO.getPoints() != null) {
                for (Map.Entry<String, Integer> entry : optionDTO.getPoints().entrySet()) {
                    Point point = new Point();
                    point.setProfession(entry.getKey());
                    point.setScore(entry.getValue());
                    point.setOption(option);
                    points.add(point);
                }
            }

            option.setPoints(points);
            question.getOptions().add(option);
        }

        questionRepository.save(question);
        return true;
    }

    public boolean deleteQuestion(Long id) {
        questionRepository.deleteById(id);
        return true;
    }
}
