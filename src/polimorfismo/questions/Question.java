package polimorfismo.questions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Question {

    private String text;
    private Set<String> tags = new HashSet<>();
    private Level level;

    private Answer answer;

    public Question(String text, Set<String> tags, Level level, Answer answer) {
        this.text = text;
        this.level = level;
        this.tags = tags;
        this.answer = answer;
    }

    public String text() {
        return text;
    }

    public Set<String> tags() {
        return Collections.unmodifiableSet(tags);
    }

    public Level level() {
        return level;
    }

    public Answer answer() {
        return answer;
    }

    public enum Level {
        EASY(25), MEDIUM(50), HARD(75), VERY_HARD(100);

        private long score;

        Level(long score) {
            this.score = score;
        }

        public long score() {
            return score;
        }

    }

}
