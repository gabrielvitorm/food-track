package src.model;

public abstract class Pessoa {

    protected String nome;
    protected int id;
    protected long numeroTelefone;

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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }
}
