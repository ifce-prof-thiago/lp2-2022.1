package polimorfismo;

public class CadastrarUsuario {


    public void execute(Usuario user, Enviar enviar) {

        System.out.println("Usuário salvo com sucesso");
        enviar.execute(user);

    }

}
