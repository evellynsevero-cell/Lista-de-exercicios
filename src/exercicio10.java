public class exercicio10 {
    public static void main(String[] args) { System.out.println("Hello and welcome!");
        final String USUARIO_ACESSO = "admin";
        final String SENHA_DE_ACESSO = "123456789";

        String usuario = "admin";
        String senha = "123456789";

        if (usuario.equals(USUARIO_ACESSO) && senha.equals(SENHA_DE_ACESSO)) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Usuario ou senha incorretos");
        }
    }
}
