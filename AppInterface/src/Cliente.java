public class Cliente {
    private String nome;

    public boolean autentica(int senha) {
        // Verifica aqui se a senha confere com a recebida no parâmetro
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
