#language: pt
Funcionalidade: Busca de Filmes

  Cenario: Busco Filmes e diretor
    Dado que acesso a home
    Quando feito o Cadastro diretores e filmes
      | nomeDiretor      | dataNascimento | nomeFilme    | anoLancamento |
      | Federico Fellini | 20/01/1920      | A Voz da Lua | 1990          |

    E feito a busca dos diretores e filmes
    Entao exibir resultado da quantidade
    
