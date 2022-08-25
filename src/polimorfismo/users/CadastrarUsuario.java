package polimorfismo.users;

public class CadastrarUsuario {


    public void execute(User user, Enviar enviar) {

        System.out.println("Usuário salvo com sucesso");
        enviar.execute(user);

    }

}
