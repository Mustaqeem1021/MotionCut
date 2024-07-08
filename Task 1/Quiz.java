import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ": " + options[i]);
            }

            int answer = getUserAnswer(scanner);
            if (question.isCorrectAnswer(answer)) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect. The correct answer was: " + options[question.getCorrectAnswer() - 1] + "\n");
            }
        }

        System.out.println("Quiz Over! Your score is: " + score + "/" + questions.size());
    }

    private int getUserAnswer(Scanner scanner) {
        int answer = -1;
        while (answer < 1 || answer > 4) {
            System.out.print("Your answer (1-4): ");
            if (scanner.hasNextInt()) {
                answer = scanner.nextInt();
            } else {
                scanner.next();  // clear invalid input
            }
        }
        return answer;
    }
}
