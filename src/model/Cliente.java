package src.model;

public final class Cliente extends Pessoa{

    private static int contadorId = 1;
    private Fidelidade fidelidade;

    public Cliente(String nome, long numeroTelefone, Fidelidade fidelidade) {
        super(++contadorId, nome, numeroTelefone);
        this.fidelidade = fidelidade;
    }

    public Cliente(){}

    public void acessarProgramaFidelidade() {
        //fidelidade.incrementarContador();
        //fidelidade.checarRecompensa();
    }

    public Fidelidade getFidelidade() {
        return fidelidade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "fidelidade=" + fidelidade +
                ", nome='" + nome + '\'' +
                ", id=" + contadorId +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }
}
