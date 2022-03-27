package zyx.cicy.mycommunity.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zyx.cicy.mycommunity.dto.QuestionDTO;
import zyx.cicy.mycommunity.mapper.QuestionMapper;
import zyx.cicy.mycommunity.mapper.UserMapper;
import zyx.cicy.mycommunity.model.Question;
import zyx.cicy.mycommunity.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cicy  at 2022/3/27 17:45
 */
@Service//Service：中间层：既可以操作QuestionMapper，又可以操作UserMapper
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;


    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list();
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        for (Question question : questions) {
            User user = userMapper.findId(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);//可以把questionDTO的所有属性拷贝到question
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;

    }
}
