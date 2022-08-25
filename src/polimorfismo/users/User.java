package polimorfismo.users;

public class User {

    private String nome;
    private String email;
    private String telefone;

    private User(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

        validate();
    }

    public static User of(String nome, String email, String telefone) {
        return new User(nome, email, telefone);
    }

    public void update(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

        validate();
    }

    private void validate() {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }

        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email é obrigatório");
        }

        if (telefone == null || telefone.isEmpty()) {
            throw new IllegalArgumentException("Telefone é obrigatório");
        }
    }

    public String nome() {
        return nome;
    }

    public String email() {
        return email;
    }

    public String telefone() {
        return telefone;
    }

}
