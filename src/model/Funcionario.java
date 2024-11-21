package src.model;

import src.enums.Cargo;

public final class Funcionario extends Pessoa{

    public Cargo cargo;

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo=" + cargo +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }
}
