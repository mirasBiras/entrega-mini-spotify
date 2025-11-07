import java.util.ArrayList;
import java.util.HashMap;

public class Armazenamento {

    ArrayList<Usuario> infoUsuario = new ArrayList<>();
    ArrayList<Midia> infoMidia = new ArrayList<>();
    HashMap<String, ArrayList<Midia>> infoPlaylist = new HashMap<>();

    public void adicionarUsuario(String nome, String email, int senha) {
        Usuario usuario = new Usuario(nome, email, senha);
        infoUsuario.add(usuario);
    }

    public void adicionarMidia(Midia midia) {
        if (!infoMidia.contains(midia)) {
            infoMidia.add(midia);
        } else {
            System.out.println("Mídia já cadastrada.");
        }
    }

    public void adicionarPlaylist(String nomePlaylist) {
        if (!infoPlaylist.containsKey(nomePlaylist)) {
            infoPlaylist.put(nomePlaylist, new ArrayList<Midia>());
        } else {
            System.out.println("Playlist já cadastrada.");
        }
    }

    public void adicionarMidiaNaPlaylist(String nomePlaylist, Midia midia) {
        if (infoPlaylist.containsKey(nomePlaylist)) {
            infoPlaylist.get(nomePlaylist).add(midia);
        } else {
            System.out.println("Esta playlist não existe.");
        }
    }

    public void removerMidiaNaPlaylist(String nomePlaylist, Midia midia) {
        if (infoPlaylist.containsKey(nomePlaylist)) {
            infoPlaylist.get(nomePlaylist).remove(midia);
        } else {
            System.out.println("Esta playlist não existe.");
        }
    }
}