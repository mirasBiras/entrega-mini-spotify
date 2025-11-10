public class Usuario {
    private String nome;
    private String email;
    private int senha;

    public Usuario(String nome, String email, int senha) {
        setNome(nome);
        setEmail(email);
        setSenha(senha);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nEmail: " + getEmail() + "\nSenha: " + getSenha();
    }

}
