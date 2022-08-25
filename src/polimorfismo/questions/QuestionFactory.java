package polimorfismo.questions;

import java.util.Set;

public interface QuestionFactory {

    static Question create(
            String text,
            Set<String> tags,
            Question.Level level) {

        return new Question(text, tags, level, new AnswerText());
    }

    static Question create(
            String text,
            Set<String> tags,
            Question.Level level,
            Set<String> options) {

        return new Question(text, tags, level, new AnswerChoice(options));

    }

}
