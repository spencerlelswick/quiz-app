package com.spencer.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spencer.quiz.dao.QuizDao;
import com.spencer.quiz.model.Quiz;

@Service
public class QuizService {
	@Autowired
	QuizDao quizDao;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		
		
		return quiz;
	}

}
