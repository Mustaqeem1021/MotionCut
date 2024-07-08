public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        String[] options1 = {"Java", "Python", "C++", "JavaScript"};
        quiz.addQuestion(new Question("Which programming language is used for Android development?", options1, 1));

        String[] options2 = {"8", "16", "32", "64"};
        quiz.addQuestion(new Question("How many bits are in a byte?", options2, 1));

        String[] options3 = {"Polymorphism", "Encapsulation", "Inheritance", "Abstraction"};
        quiz.addQuestion(new Question("Which OOP concept involves hiding the internal state and requiring all interaction to be performed through an object's methods?", options3, 2));

        quiz.start();
    }
}
