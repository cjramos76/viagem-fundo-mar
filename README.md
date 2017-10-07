# viagem-fundo-mar
Teste programação - viagem ao fundo do mar

O projeto tem três pacotes:
 - br.com.viagemFundoMar.test: contém classe de test do aplicativo
 - br.com.viagemFundoMar.data: contém classes de dados. Submarino é o dado principal e usa as classes Comando e Direcao que sâo dois Enum que definem os posiveis comandos dos cientistas e as direções do submarino
 - br.com.viagemFundoMar.service: contém a classe de negocio do aplicativo que executa o movimento do submarino.

A classe de dados Submarino "extends" da classe ParentData que num futuro teria propriedades e métodos comuns das classes de dados.
A classe de negocio MovimentoSubmarino "extends" da classe ParentService que num futuro teria propriedades e métodos comuns das classes de negocio.

