package polimorfismo.observer;

public class Chat implements Observer {

    private String name;

    public Chat(String name) {
        this.name = name;
    }

    @Override
    public void publish(String msg) {
        System.out.println(name + " recebeu: " + msg);
    }

}
