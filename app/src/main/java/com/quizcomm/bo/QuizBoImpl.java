package com.quizcomm.bo;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.quizcomm.dao.QuizDao;
import com.quizcomm.dom.Question;
import com.quizcomm.dom.Quiz;

public class QuizBoImpl implements QuizBo {
	
	@Autowired
	private QuizDao quizDao;

	
	public Quiz createQuiz(Quiz quiz) {
		return quizDao.createQuiz(quiz);		
	}


	public void processQuiz(final Quiz quiz) throws JsonGenerationException, JsonMappingException, IOException {

		if(quiz!=null && quiz.getQuestions()!=null){
			for(int i=0;i<quiz.getQuestions().size();i++){
				Question question = quiz.getQuestions().get(i);
				String contentJson = getJsonString(question);
				quiz.getQuestions().get(i).setQuiz(quiz);
				quiz.getQuestions().get(i).setContent(contentJson);
			}
		}
		
	}
	
	private String getJsonString(Object object) throws JsonGenerationException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(object);
	}

}
