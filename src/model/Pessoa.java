package src.model;

public abstract class Pessoa {

    protected String nome;
    protected final int id;
    protected long numeroTelefone;

    public Pessoa(int id, String nome, long numeroTelefone) {
        this.id = id;
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public Pessoa(String nome, long numeroTelefone, int id) {
        this.id = id;
    }

    public Pessoa() {
        id = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroTelefone(long numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public long getNumeroTelefone() {
        return numeroTelefone;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(
                "Pessoa {\n" +
                        "  Nome: %s\n" +
                        "  ID: %d\n" +
                        "  Número de Telefone: %d\n" +
                        "}",
                nome,
                id,
                numeroTelefone
        );
    }
}
