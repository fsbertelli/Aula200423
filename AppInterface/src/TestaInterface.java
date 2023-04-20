public class TestaInterface {
    public static void main(String[] args) {
        Autenticavel diretor = new Diretor();
        Autenticavel gerente = new Gerente();

        SistemaInterno si = new SistemaInterno();
        // Autentica Diretor
        si.login(diretor);

        // Autentica Gerente
        si.login(diretor);

        // Cliente (deve falhar)
        Cliente cli = new Cliente();

        //si.login(cli);
    }
}
