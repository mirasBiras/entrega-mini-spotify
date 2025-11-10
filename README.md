# Mini Spotify 🎧

Visão Geral

Este projeto é um sistema em Java que gerencia usuários, mídias e playlists. Ele permite cadastrar usuários, adicionar mídias, criar playlists e visualizar informações de maneira organizada. A interação ocorre via terminal, e os dados são armazenados em memória usando coleções como HashMap e ArrayList.

- Funcionalidades

Cadastro de usuários com nome, e-mail e senha.

Registro de mídias com título, artista, duração e gênero.

Criação de playlists associadas a usuários.

Exibição de informações detalhadas sobre usuários, mídias e playlists.

Estrutura organizada com classes separadas para funcionalidades, armazenamento e modelos de dados.

- Estrutura do Projeto

Funcionalidades.java – Contém métodos para cadastro de usuários e mídias, criação de playlists e interação com o usuário.

Armazenamento.java – Gerencia os dados armazenados em memória, como usuários, mídias e playlists.

Usuario.java – Modelo que representa um usuário do sistema.

Midia.java – Modelo que representa uma mídia, com atributos como título, artista, duração e gênero.

Type.java – Enumeração que define os tipos ou gêneros de mídias.

- Observações

O projeto é voltado para execução em terminal, com entradas e saídas via Scanner e System.out.

É modular, permitindo que novas funcionalidades sejam adicionadas de forma relativamente simples.

O código utiliza conceitos de programação orientada a objetos e coleções do Java para organizar os dados.

- Como eu faria / Possíveis Melhorias

Se eu estivesse desenvolvendo este projeto, algumas melhorias que eu consideraria:

Tratamento de exceções – Garantir que entradas inválidas não quebrem o sistema, usando try-catch e validações.

Persistência de dados – Salvar usuários, mídias e playlists em arquivos ou banco de dados, para não perder os dados ao fechar o programa.

Interface mais amigável – Criar menus mais claros e mensagens de feedback ao usuário.

Métodos reutilizáveis e limpos – Modularizar melhor o código, por exemplo, separando a lógica de input/output da lógica de negócio.

Uso de streams ou for-each – Para simplificar operações com listas e mapas, tornando o código mais legível.
