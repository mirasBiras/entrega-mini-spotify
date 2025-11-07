public class Musica extends Midia {
    public Musica(String titulo, String artista, int duracao, Type type) {
        super(titulo, artista, duracao, type);

    }

    @Override
    public String toString() {
        return "[Música]" + "\n" + titulo + "\n" + artista + "\nDuração: " + duracao + " minuto(s)" + "\nGênero: " + type;
    }
}
