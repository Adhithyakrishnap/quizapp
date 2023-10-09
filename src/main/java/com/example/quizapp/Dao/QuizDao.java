package com.example.quizapp.Dao;

import com.example.quizapp.Model.Question;
import com.example.quizapp.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuizDao extends JpaRepository<Quiz,Integer> {


}
