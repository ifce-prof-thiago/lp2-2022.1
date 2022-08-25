package polimorfismo.questions;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        final var question = QuestionFactory.create(
                "How to create a new Java project?",
                new HashSet<>() {{
                    add("Java");
                    add("IntelliJ");
                    add("Eclipse");
                }},
                Question.Level.EASY
        );

        System.out.println(question.tags());

        System.out.println(question.answer().type());

    }
}
