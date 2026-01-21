package questionservice.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "question_title")
    private String questionTitle;
    
    @Column(name = "option1")
    private String op1;
    
    @Column(name = "option2")
    private String op2;
    
    @Column(name = "option3")
    private String op3;
    
    @Column(name = "option4")
    private String op4;
    
    @Column(name = "correct_answer")
    private String correctAnswer;
    
    private String category;
    
    @Column(name = "difficulty")
    private String difficulty;
}
