public class Midia {

    protected String titulo;
    protected String artista;
    protected int duracao;
    protected Type type;

    public Midia(String titulo, String artista, int duracao, Type type) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.type = type;

    }

    @Override
    public String toString() {
        return "\n" + titulo + "\n" + artista + "\nDuração: " + duracao + " minuto(s)" + "\nGênero: " + type;
    }

}
