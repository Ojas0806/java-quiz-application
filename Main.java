import java.util.Scanner;

/** Starts the Quiz Application with one question. */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] options = {"Paris", "Rome", "Madrid", "Berlin"};
        Question question = new Question(
                "What is the capital of France?", options, 1);

        System.out.println("Welcome to the Quiz Application!\n");
        question.display();
        System.out.print("Enter your answer (1-4): ");

        try {
            int answer = Integer.parseInt(scanner.nextLine());
            System.out.println(question.isCorrect(answer)
                    ? "Correct!"
                    : "Incorrect. The correct answer is Paris.");
        } catch (NumberFormatException exception) {
            System.out.println("Please enter a valid whole number.");
        }

        scanner.close();
    }
}

