package src.model;

import src.enums.Cargo;

public final class Funcionario extends Pessoa {

    private Cargo cargo;

    public Funcionario(int id, String nome, long numeroTelefone, Cargo cargo) {
        super(id, nome, numeroTelefone);
        this.cargo = cargo;
    }

    public Funcionario(){}

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return String.format(
                "Funcionario {\n" +
                        "  ID: %d\n" +
                        "  Nome: %s\n" +
                        "  Número de Telefone: %d\n" +
                        "  Cargo: %s\n" +
                        "}",
                getId(),
                getNome(),
                getNumeroTelefone(),
                cargo
        );
    }
}