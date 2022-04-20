package chapter7;

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class QuestionnaireTest {
//    Questionnaire questionnaire;
//    @BeforeEach
//    public void startEachTestWith(){
//        questionnaire = new Questionnaire("Mercy");
//    }
//    @Test
//    public void questions_haveOptions(){
//        Questions question = new Questions("Good","Bad");
//        assertEquals(2, question.getOptions().length);
//
//    }
//
//    @Test
//    public void questions_haveResponse(){
//        Questions questionOne = new Questions("Stupid,Gentle", "Lousy,Good");
//        questionOne.respondWith('A');
////        assertEquals('A', questionOne.getResponse());
//
//        Questions questionTwo = new Questions("Dumb", "Smart");
//        questionOne.respondWith('B');
//        assertEquals('A',questionTwo.getResponse());
//    }
//
//    @Test
//    public void questionnaire_contains20Questions(){
//
//        assertEquals(20,  questionnaire.getQuestions().length);
//    }
//
//
//
//
//
//}
