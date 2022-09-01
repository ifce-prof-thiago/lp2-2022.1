package polimorfismo.observer;

public class Chat implements  Observer {
    @Override
    public void publish() {
        System.out.println("Lógica para publicar em chat");
    }

}
