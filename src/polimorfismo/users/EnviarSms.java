package polimorfismo.users;

public class EnviarSms  implements Enviar{


    public void execute(User user) {

        System.out.println("Sms enviado com sucesso");
        System.out.println("Usuário: " + user.nome());
        System.out.println("Telefone: " + user.telefone());

    }

}
