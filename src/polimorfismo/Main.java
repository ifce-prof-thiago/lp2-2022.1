package polimorfismo;

public class Main {

    public static void main(String[] args) {

        Usuario user = Usuario.of(
                "João",
                "j.email.com",
                "11 99999-9999"
        );


        new CadastrarUsuario().execute(user, new EnviarSms());

    }

}
