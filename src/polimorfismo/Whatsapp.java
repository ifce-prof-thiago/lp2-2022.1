package polimorfismo;

public class Whatsapp implements Enviar {

    public void execute(Usuario user) {

        System.out.println("polimorfismo.Whatsapp enviado com sucesso");
        System.out.println("Usuário: " + user.nome());
        System.out.println("Telefone: " + user.telefone());

    }
}
