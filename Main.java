/** Starts the complete Quiz Application. */
public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.addQuestion(new Question(
                "What is the capital of France?",
                new String[]{"Paris", "Rome", "Madrid", "Berlin"}, 1));
        quiz.addQuestion(new Question(
                "Which keyword creates an object in Java?",
                new String[]{"class", "new", "void", "static"}, 2));
        quiz.addQuestion(new Question(
                "How many days are there in a week?",
                new String[]{"5", "6", "7", "8"}, 3));

        System.out.println("Welcome to the Quiz Application!");
        quiz.start();
    }
}
