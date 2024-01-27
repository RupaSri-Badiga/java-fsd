package com.example.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.dao.FeedbackRepo;
import com.example.rest.model.Feedback;

import jakarta.transaction.Transactional;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackRepo feedbackRepository;
	
	@Transactional
	@PostMapping("/feedback")
	public String saveFeedback(@RequestParam String name, @RequestParam String fmessage) {
		
		try {
			
			Feedback form = new Feedback();
			form.setName(name);
			form.setFmessage(fmessage);
			feedbackRepository.save(form);
			
			return "feedback-added";
		}catch(DataAccessException e) {
			
			e.printStackTrace();
			return "Error saving Feedback";
		}
	}

}
