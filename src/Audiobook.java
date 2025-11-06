public class Audiobook extends Midia {
    public Audiobook(String titulo, String artista, int duracao) {
        super(titulo, artista, duracao, Type.Outros, Style.Audiobook);

    }

    @Override
    public String toString() {
        return "[Audiobook]" + "\n" + titulo + "\n" + artista + "Duração: " + duracao + " minuto(s)";
    }
}
