import java.sql.SQLOutput;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selections = new String[5];

    QuestionService(){
            questions[0] = new Question(0, "Q1", "A", "B", "C", "D", "C");
            questions[1] = new Question(1, "Q2", "A", "B", "C", "D", "C");
            questions[2] = new Question(2, "Q3", "A", "B", "C", "D", "C");
            questions[3] = new Question(3, "Q4", "A", "B", "C", "D", "C");
            questions[4] = new Question(4, "Q5", "A", "B", "C", "D", "C");
    }

    void playQuiz(){
        System.out.println("Displaying questions");
        int i=0;
        for(Question q: questions){
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.println();

            Scanner sc = new Scanner(System.in);
            selections[i++] = sc.nextLine();

            System.out.println();
        }

        for(String s: selections){
            System.out.println(s);
        }
        System.out.println();
    }

    void getScore(){
        int score=0;

        for(int i=0; i<questions.length; i++){
            Question que = questions[i];
            String answer = que.getAnswer();
            String selection = selections[i];

            if(answer.equals(selection)){
                score++;
            }
        }

        System.out.println("Your score is: "+score);
    }
}
