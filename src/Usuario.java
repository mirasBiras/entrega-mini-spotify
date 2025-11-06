public class Usuario {
    protected String nome;
    protected String email;
    private int senha;

    public Usuario(String nome, String email, int senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;

    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email;
    }

}
