/** Represents one multiple-choice question. */
public class Question {
    private final String questionText;
    private final String[] options;
    private final int correctAnswer;

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void display() {
        System.out.println(questionText);
        for (int index = 0; index < options.length; index++) {
            System.out.println((index + 1) + ". " + options[index]);
        }
    }

    public boolean isCorrect(int answer) {
        return answer == correctAnswer;
    }
}
