import java.util.ArrayList;
import java.util.Scanner;

/** Stores questions and runs the quiz. */
public class Quiz {
    private final ArrayList<Question> questions = new ArrayList<>();

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int index = 0; index < questions.size(); index++) {
            Question question = questions.get(index);
            System.out.println("\nQuestion " + (index + 1) + ":");
            question.display();

            int answer = readAnswer(scanner, question.getOptionCount());
            if (question.isCorrect(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        System.out.println("\nQuiz complete!");
        System.out.println("Your score: " + score + " out of " + questions.size());
        scanner.close();
    }

    private int readAnswer(Scanner scanner, int optionCount) {
        while (true) {
            System.out.print("Enter your answer (1-" + optionCount + "): ");

            try {
                int answer = Integer.parseInt(scanner.nextLine());
                if (answer >= 1 && answer <= optionCount) {
                    return answer;
                }
                System.out.println("Choose a number from 1 to " + optionCount + ".");
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid whole number.");
            }
        }
    }
}
