package net.unibave.builder;

public class Diretor {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    private Diretor(Builder builder) {
        nome = builder.nome;
        endereco = builder.endereco;
        telefone = builder.telefone;
        email = builder.email;
    }

    public static class Builder {

        private String nome, endereco, telefone, email;

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Diretor build() {
            return new Diretor(this);
        }
    }

    @Override
    public String toString() {
        String value = (nome != null ? " nome: " + nome : "")
                + (endereco != null ? " endereco: " + endereco : "")
                + (telefone != null ? " telefone: " + telefone : "")
                + (email != null ? " email: " + email : "");
        return value;
    }
}
