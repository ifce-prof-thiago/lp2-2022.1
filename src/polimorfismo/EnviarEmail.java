package polimorfismo;

public class EnviarEmail implements Enviar {

    public void execute(Usuario user) {

        System.out.println("E-mail enviado com sucesso");
        System.out.println("Usuário: " + user.nome());
        System.out.println("E-mail: " + user.email());

    }

}
