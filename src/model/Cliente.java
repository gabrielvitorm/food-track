package src.model;

public final class Cliente extends Pessoa {

    private static int contadorId = 1;
    private Fidelidade fidelidade;

    public Cliente(String nome, long numeroTelefone, Fidelidade fidelidade) {
        super(contadorId++, nome, numeroTelefone); // Incrementa após atribuir
        this.fidelidade = fidelidade;
    }

    public void acessarProgramaFidelidade() {
        if (fidelidade != null) {
            fidelidade.incrementarContador();
            fidelidade.checarRecompensa();
        }
    }

    public Fidelidade getFidelidade() {
        return fidelidade;
    }

    public String obterInformacoesFidelidade() {
        return (fidelidade != null) ? fidelidade.toString() : "Nenhum programa de fidelidade";
    }

    @Override
    public String toString() {
        return String.format(
                "Cliente {\n" +
                        "  ID: %d\n" +
                        "  Nome: %s\n" +
                        "  Número de Telefone: %d\n" +
                        "  Fidelidade: %s\n" +
                        "}",
                getId(),
                getNome(),
                getNumeroTelefone(),
                fidelidade != null ? fidelidade.toString() : "Nenhum programa de fidelidade"
        );
    }
}