package polimorfismo.users;

public class Whatsapp implements Enviar {

    public void execute(User user) {

        System.out.println("polimorfismo.users.Whatsapp enviado com sucesso");
        System.out.println("Usuário: " + user.nome());
        System.out.println("Telefone: " + user.telefone());

    }
}
