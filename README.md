# Mini Spotify 🎧

Projeto desenvolvido em Java com o objetivo de simular um sistema básico de streaming de músicas.

## 🎯 Funcionalidades
- Cadastro de usuários  
- Cadastro e listagem de mídias (músicas, podcasts, audiobooks)  
- Criação e gerenciamento de playlists  
- Visualização de playlists com duração total  

---

## 💡 Diferenças e possíveis melhorias

### O que foi implementado
- Estrutura funcional completa com classes **Usuario**, **Midia**, **Funcionalidades**, e **Armazenamento**.
- Utilização de **HashMap** e **ArrayList** para armazenamento em memória.
- Sistema de menus via console.

### O que poderia ser melhorado
1. **Separação de responsabilidades:**  
   Algumas lógicas de entrada de dados (Scanner) estão diretamente em `Funcionalidades`. Poderia ser interessante criar uma camada de interface (UI) separada.

2. **Melhor gerenciamento de usuários:**  
   Hoje o sistema assume apenas um usuário ativo (sem login real).  
   Futuramente, poderia ter um sistema simples de login/senha com persistência.

3. **Persistência de dados:**  
   Atualmente, tudo é armazenado só em memória (HashMap).  
   Poderia salvar os dados em arquivos (JSON, TXT) ou até em um banco de dados leve (como SQLite).

4. **Tratamento de exceções:**  
   Algumas operações poderiam ter exceções customizadas para erros de cadastro, busca ou playlists inexistentes.

5. **Melhoria na arquitetura:**  
   Uma ideia seria aplicar o padrão **MVC** — separar melhor as camadas de:
   - Modelo (classes `Usuario`, `Midia`, etc.)
   - Controle (lógica em `Funcionalidades`)
   - Visão (interação com o usuário)

6. **Refatoração de repetição de código:**  
   Métodos como adicionar/remover mídia em playlists poderiam ser extraídos para funções auxiliares.

---

## 🚀 Como executar
1. Abrir o projeto no IntelliJ.  
2. Executar a classe principal (`Main.java`).  
3. Usar o menu exibido no console.

---

## ✨ Autor
Desenvolvido por João Vicctor de Araújo.
