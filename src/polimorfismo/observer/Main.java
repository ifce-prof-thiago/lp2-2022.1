package polimorfismo.observer;

public class Main {

    public static void main(String[] args) {

        var computer = new Subject();

        var chat = new Chat();
        var newspaper = new Newspaper();

        computer.register(chat, newspaper);

        computer.publish();

        System.out.println("---------------");

        computer.unregister(chat);

        computer.publish();

    }
}
