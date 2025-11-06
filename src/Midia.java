public class Midia {

    protected String titulo;
    protected String artista;
    protected int duracao; // minutos
    protected Type type;
    protected Style style;

    public Midia(String titulo, String artista, int duracao, Type type, Style style) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.type = type;
        this.style = style;

    }

    @Override
    public String toString() {
        return "\n" + titulo + "\n" + artista + "\nDuração: " + duracao + " minuto(s)" + "\nGênero: " + type + "\nEstilo: " + style;
    }

}
