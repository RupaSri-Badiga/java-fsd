package com.example.rest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.model.Feedback;

@Repository
public interface FeedbackRepo extends CrudRepository<Feedback,Long>{

}
