# Mini Spotify (Console) 🎧

Projeto em Java que simula um sistema básico de streaming via console.  
Funcionalidades principais:
- Cadastro de usuário
- Cadastro e listagem de mídias (Música, Podcast, Audiobook)
- Criação e gerenciamento de playlists
- Visualização de playlist com duração total

## Como executar
1. Abra o projeto no IntelliJ.
2. Execução: `Main.java` → `public static void main`.
3. Siga o menu no console.

## O que funciona
- Cadastro simples de usuário;
- Cadastro de mídias com tipo e duração;
- Criação de playlists globais;
- Adição/remoção de mídias em playlists;
- Listagem e busca por mídias.

## Limitações conhecidas
- Dados são mantidos apenas em memória (sem persistência entre execuções).
- `Usuario` usa `int` para senha (recomendado trocar para `String`).
- `infoUsuario` e `infoMidia` são `ArrayList` — buscas são lineares.
- Sem testes automatizados.

## Comparação com solução gerada por IA (resumo)
A solução gerada por IA recomenda:
- usar `Map<String, Usuario>` e `Map<String, Midia>` para buscas diretas;
- encapsular operações (ex.: `Usuario.addPlaylist(...)`);
- usar `String` para senha e implementar `equals/hashCode` em `Midia`;
- adicionar persistência (JSON) se for necessário manter dados entre execuções.
Essas mudanças aumentam robustez e manutenção do código.

## Sugestões de melhoria (priorizadas)
1. Migrar `infoUsuario` para `Map<String, Usuario>` (chave: email). — **médio**
2. `Usuario.addPlaylist(String)` e `Usuario.getPlaylists()` (encapsulamento). — **baixo**
3. Trocar `int senha` por `String senha`. — **baixo**
4. Mapear `midias` por título (`Map<String, Midia>`). — **baixo**
5. Implementar `equals/hashCode` em `Midia`. — **baixo**
6. Persistência (salvar em JSON ao sair / carregar ao iniciar). — **alto**

## Mudanças propostas (snippets)
Veja o arquivo `patches.md` (ou insira os trechos abaixo no código):
- `Usuario` → adicionar `addPlaylist(...)`
- `Armazenamento` → migrar para `Map` (ex.: `usuarios`, `midias`, `playlists`)
- `Funcionalidades.criarPlaylist` → associar playlist ao usuário criado

---

## Autor
Desenvolvido por: João Vicctor de Araújo

## Observação sobre a atividade
Anexei uma análise comparativa entre a solução própria e uma solução gerada por IA, destacando convergências, divergências e recomendações para produção/escala.
