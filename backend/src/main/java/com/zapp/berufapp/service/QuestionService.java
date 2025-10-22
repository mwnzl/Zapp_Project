import com.zapp.berufapp.dto.OptionDTO;
import com.zapp.berufapp.dto.QuestionDTO;
import jakarta.annotation.PostConstruct;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Service;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    private List<QuestionDTO> questions;

    @PostConstruct
    public void init() throws Exception {
        InputStream is = getClass().getResourceAsStream("/questions.xml");
        JAXBContext context = JAXBContext.newInstance(QuestionList.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        QuestionList questionList = (QuestionList) unmarshaller.unmarshal(is);

        questions = questionList.getQuestion().stream()
                .map(q -> {
                    List<OptionDTO> options = q.getOption().stream()
                            .map(o -> new OptionDTO(o.getValue(), null)) // Punkte leer
                            .collect(Collectors.toList());
                    return new QuestionDTO(q.getText(), options);
                })
                .collect(Collectors.toList());
    }

    public List<QuestionDTO> getAllQuestions() {
        return questions;
    }
}
