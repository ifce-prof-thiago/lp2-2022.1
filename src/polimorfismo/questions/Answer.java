package polimorfismo.questions;

public interface Answer {

    Type type();

    enum Type {
        TEXT,
        CHOICE
    }

}
