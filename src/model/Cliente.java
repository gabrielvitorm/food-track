package src.model;

public final class Cliente extends Pessoa{

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }
}
