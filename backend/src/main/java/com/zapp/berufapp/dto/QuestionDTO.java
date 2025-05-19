package com.zapp.berufapp.dto;

import java.util.List;

public class QuestionDTO {
    private String text;
    private List<OptionDTO> options;

    public QuestionDTO() {}
    public QuestionDTO(String text, List<OptionDTO> options) {
        this.text = text;
        this.options = options;
    }

    public String getText() {        return text;    }
    public void setText(String text) {        this.text = text;    }

    public List<OptionDTO> getOptions() {        return options;    }
    public void setOptions(List<OptionDTO> options) {        this.options = options;    }
}
