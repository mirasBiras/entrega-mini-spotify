public class Podcast extends Midia {
    public Podcast(String titulo, String artista, int duracao) {
        super(titulo, artista, duracao, Type.Outros, Style.Podcast);

    }

    @Override
    public String toString() {
        return "[Podcast]" + "\n" + titulo + "\n" + artista + "\nDuração: " + duracao + " minuto(s)";
    }
}
