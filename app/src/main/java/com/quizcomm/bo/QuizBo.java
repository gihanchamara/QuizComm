package com.quizcomm.bo;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.quizcomm.dom.Quiz;

public interface QuizBo {
	
	public Quiz createQuiz(Quiz quiz);
	public void processQuiz(Quiz quiz) throws JsonGenerationException, JsonMappingException, IOException;

}
