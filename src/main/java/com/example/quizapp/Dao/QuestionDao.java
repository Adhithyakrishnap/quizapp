package com.example.quizapp.Dao;

import com.example.quizapp.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {
    @Query(value = "SELECT * FROM Question q " +
            "WHERE q.category = :category " +
            "ORDER BY q.id DESC " +
            "LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
    List<Question> findByCategory(String category);
}
