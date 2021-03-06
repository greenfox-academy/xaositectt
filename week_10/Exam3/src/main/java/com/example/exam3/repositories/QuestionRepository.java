package com.example.exam3.repositories;

import com.example.exam3.models.Answer;
import com.example.exam3.models.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface QuestionRepository extends CrudRepository<Question, Integer> {

  Question findById(int id);
}
