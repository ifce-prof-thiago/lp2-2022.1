package polimorfismo.questions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AnswerChoice implements Answer {

    private Set<String> options = new HashSet<>();

    public AnswerChoice(Set<String> options) {
        this.options = options;
    }

    @Override
    public Type type() {
        return Type.CHOICE;
    }

    public Set<String> options() {
        return Collections.unmodifiableSet(options);
    }

}
