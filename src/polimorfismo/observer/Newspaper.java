package polimorfismo.observer;

public class Newspaper implements Observer {
    @Override
    public void publish() {
        System.out.println("Lógica para publicar em jornal");
    }

}
