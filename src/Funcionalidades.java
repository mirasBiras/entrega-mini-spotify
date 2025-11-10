import java.util.Scanner;

public class Funcionalidades implements FuncionalidadesInterface {
    private Scanner scanner = new Scanner(System.in);
    private Armazenamento armazenamento = new Armazenamento();
    private LeitorSeguro leitor = new LeitorSeguro();

    @Override
    public void cadastrarUsuario() {
        System.out.println("========== Cadastro ==========");
        System.out.print("Digite seu nome: ");
        String nomeCadastro = scanner.nextLine();

        System.out.print("Digite seu email: ");
        String emailCadastro = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        int senhaCadastro = leitor.lerIntSeguro();

        armazenamento.adicionarUsuario(nomeCadastro, emailCadastro, senhaCadastro);

        System.out.println("\nCadastro realizado!");
    }

    @Override
    public void buscarMidia() {
        System.out.println("========== Pesquisa ==========");
        System.out.print("Qual mídia deseja pesquisar? (Título, artista, tipo ou estilo): ");
        String busca = scanner.nextLine();

        System.out.println("\nResultado da busca por: " + busca + "\n");

        for (Midia m : armazenamento.infoMidia) {
            if (m.titulo.contains(busca) || m.artista.contains(busca) || (m.type != null && m.type.toString().contains(busca))) {
                System.out.println(m);
            }
        }
    }

    @Override
    public void listarMidiaCatalogo() {
        System.out.println("========== Catálogo de Músicas ==========\n");
        for (Midia m : armazenamento.infoMidia) {
            System.out.println(m);
        }
    }

    @Override
    public void criarPlaylist() {
        System.out.println("========== Criar playlist ==========");
        System.out.print("Qual o nome da playlist que deseja criar? ");
        String nomePlaylist = scanner.nextLine();

        armazenamento.adicionarPlaylist(nomePlaylist);
        System.out.println("\nPlaylist criada com sucesso!");
    }

    @Override
    public void gerenciarPlaylist() {
        System.out.println("========== Gerenciar minhas Playlists ==========");
        System.out.println("1 - Adicionar mídia");
        System.out.println("2 - Remover mídia");
        int gerenciarPlaylistOpcao = leitor.lerIntSeguro();

        switch (gerenciarPlaylistOpcao) {
            case 1:
                System.out.print("Qual playlist deseja acessar? ");
                String nomePlaylist1 = scanner.nextLine();

                System.out.print("Qual mídia deseja adicionar em " + nomePlaylist1 + "? ");
                String tituloMidia1 = scanner.nextLine();

                if (armazenamento.infoPlaylist.containsKey(nomePlaylist1)) {
                    for (Midia midia : armazenamento.infoMidia) {
                        if (midia.titulo.equals(tituloMidia1)) {
                            armazenamento.adicionarMidiaNaPlaylist(nomePlaylist1, midia);
                            System.out.println("\nMídia adicionada!");
                            break;
                        }
                    }
                } else {
                    System.out.println("\nPlaylist não encontrada.");
                }
                break;

            case 2:
                System.out.print("Qual playlist deseja acessar? ");
                String nomePlaylist2 = scanner.nextLine();

                System.out.print("Qual mídia deseja remover de " + nomePlaylist2 + "? ");
                String tituloMidia2 = scanner.nextLine();

                if (armazenamento.infoPlaylist.containsKey(nomePlaylist2)) {
                    for (Midia midia : armazenamento.infoMidia) {
                        if (midia.titulo.equals(tituloMidia2)) {
                            armazenamento.removerMidiaNaPlaylist(nomePlaylist2, midia);
                            System.out.println("\nMídia removida!");
                            break;
                        }
                    }
                } else {
                    System.out.println("Playlist não encontrada.");
                }
                break;

            default:
                System.out.println("\nOpção inválida.");
                break;
        }
    }

    @Override
    public void visualizarPlaylist() {
        System.out.println("========== Suas playlists até o momento ==========");
        for (String s : armazenamento.infoPlaylist.keySet()) {
            System.out.println(" - " + s);
        }

        System.out.print("Qual playlist deseja acessar? ");
        String nomePlaylist = scanner.nextLine();

        if (armazenamento.infoPlaylist.containsKey(nomePlaylist)) {
            String listaPlaylist = "Mídias salvas em " + nomePlaylist + "\n";
            int duracaoTotal = 0;

            for (Midia m : armazenamento.infoPlaylist.get(nomePlaylist)) {
                listaPlaylist+= m;
                duracaoTotal += m.duracao;
            }
            System.out.println(listaPlaylist);
            System.out.println("Duração total: " + duracaoTotal + " min");
        } else {
            System.out.println("\nPlaylist não encontrada.");
        }
    }

    @Override
    public void cadastrarMidia() {
        System.out.println("========== Cadastro de mídia ==========");
        System.out.print("Digite o título da mídia: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o artista da mídia: ");
        String artista = scanner.nextLine();

        System.out.print("Digite a duração da mídia (em minutos): ");
        int duracao = leitor.lerIntSeguro();

        System.out.println("Digite o tipo da mídia: \n1 - Música\n2 - Podcast\n3 - Audiobook");
        int escolhaTipo = leitor.lerIntSeguro();

        Midia midia = null;

        switch (escolhaTipo) {
            case 1:
                System.out.println("Digite o estilo musical da música:\n1 - Rock\n2 - Punk\n3 - MPB");
                int escolhaEstilo = leitor.lerIntSeguro();
                Type genero;
                switch (escolhaEstilo) {
                    case 1:
                        genero = Type.Rock;
                        break;
                    case 2:
                        genero = Type.Punk;
                        break;
                    case 3:
                        genero = Type.MPB;
                        break;
                    default:
                        System.out.println("Gênero inválido! Mídia não cadastrada.");
                        return;
                }
                midia = new Musica(titulo, artista, duracao, genero);
                break;

            case 2:
                midia = new Podcast(titulo, artista, duracao);
                break;

            case 3:
                midia = new Audiobook(titulo, artista, duracao);
                break;

            default:
                System.out.println("\nTipo inválido! Mídia não cadastrada.");
                return;
        }

        armazenamento.adicionarMidia(midia);
        System.out.println("\nMídia adicionada!");
    }

    @Override
    public void mostrarMenu() {
        cadastrarUsuario();

        int opcao;
        do {
            System.out.println("========== Menu ==========");
            System.out.println("1 - Buscar mídia");
            System.out.println("2 - Mostrar catálogo");
            System.out.println("3 - Minhas playlists");
            System.out.println("4 - Adicionar mídia (ADM)");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = leitor.lerIntSeguro();

            switch (opcao) {
                case 1:
                    buscarMidia();
                    break;
                case 2:
                    listarMidiaCatalogo();
                    break;
                case 3:
                    System.out.println("========== Minhas Playlists ==========");
                    System.out.println("1 - Criar");
                    System.out.println("2 - Gerenciar");
                    System.out.println("3 - Visualizar");

                    System.out.print("Escolha uma opção: ");
                    int opc = leitor.lerIntSeguro();

                    switch (opc) {
                        case 1:
                            criarPlaylist();
                            break;
                        case 2:
                            gerenciarPlaylist();
                            break;
                        case 3:
                            visualizarPlaylist();
                            break;
                        default:
                            System.out.println("\nOpção inválida.");
                            break;
                    }
                    break;
                case 4:
                    cadastrarMidia();
                    break;
                case 5:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }
        } while (opcao != 5);
    }
}