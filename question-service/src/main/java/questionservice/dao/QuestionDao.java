package questionservice.dao;

import questionservice.model.Question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{
    
    @Query("SELECT q FROM Question q WHERE LOWER(q.category) = LOWER(:category)")
    List<Question> findByCategoryIgnoreCase(String category);

    @Query(value = "SELECT * from questions q where lower(q.category) = lower(:category) ORDER BY RANDOM() LIMIT :numQuestions", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQuestions);
}
