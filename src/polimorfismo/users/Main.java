package polimorfismo.users;

public class Main {

    public static void main(String[] args) {

        User user = User.of(
                "João",
                "j.email.com",
                "11 99999-9999"
        );


        new CadastrarUsuario().execute(user, new EnviarSms());

    }

}
