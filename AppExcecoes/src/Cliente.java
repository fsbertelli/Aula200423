public class Cliente {
    public String nome;
    public int soma = 1;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void somaAteTres() {
        if (soma <= 3) {
            soma++;
        }
        else {
            //throw new RuntimeException();
            //throw new IllegalArgumentException("Soma maior que Três!");
            throw new SomaMaiorTresException("Soma maior que Três!");
        }
    }
}
