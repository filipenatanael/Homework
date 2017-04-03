/*
(29) Execute os comandos TSQL para o seguinte cenário:
(a) Declarar duas variáveis: observacao (varchar(50)) e numeroPedido (INT)
(b) Atribuir à variável numeroPedido o pedido de número 10 (um número inteiro)
(c) Atribuir à variável observacao o campo observação referente ao pedido de número
10. Use uma instrução select com a cláusula WHERE). Exemplo:
Variável = (Selecione observação Para Tabela Pedido Onde numero = 10)
(d) Com o comando PRINT exibir o resultado conforme mostra a imagem a seguir:
*/

DECLARE @observacao VARCHAR(50), @numeroPedido INT
SET @numeroPedido = 10
SET @observacao = (SELECT obs FROM Pedido WHERE numeroPed = @numeroPedido)
PRINT 'Cliente: '+CAST(@numeroPedido AS VARCHAR)+', Obsercação: '+@observacao



/*
(30) Verifique os registros da tabela Unidade (Use o comando SELECT). Execute um
comando insert para inserir uma nova sigla de unidade com a respectiva descricao,
nessa tabela, siga os passos:

(a) Declarar duas variáveis: sigla (varchar(10)) e descricao (varchar(35))
(b) Atribuir à variável sigla a seguinte unidade: KN
(c) Atribuir à variável descricao a seguinte descrição: Kilonewton
(d) Executar o comando INSERT na tabela Unidade, de modo a incluir essa nova
unidade com a respectiva descrição usando as variáveis criadas.
(e) Verifique os registros da tabela Unidade (Use o comando SELECT)
*/

DECLARE @sigla VARCHAR(10), @descricao VARCHAR(35)
SET @sigla = 'KN'
SET @descricao = 'Kilonewton'
INSERT INTO Unidade(sigla,descricao) VALUES(@sigla,@descricao)
SELECT * FROM Unidade WHERE sigla = @sigla


/*
(31) Verifique os registros da tabela Cliente (Use o comando SELECT). Execute
comandos TSQL para verificar a média geral da pontuação dos clientes. Após calcular a
média, imprimir a frase: "Carteira de clientes APROVADA" se a média for igual ou
superior a 7 (sete) ou "Carteira de clientes REPROVADA", caso contrário, siga os
passos:
*/

DECLARE @media FLOAT
SET @media = (SELECT AVG(pontuacao) FROM Cliente)

PRINT 'RESULTADOS'
PRINT '----------'
PRINT 'MEDIA GERAL: '+CAST(@media AS VARCHAR)
IF (@media) >= 7
   BEGIN
      PRINT '-----------------------------'
      PRINT 'Carteira de clientes APROVADA'
      PRINT '-----------------------------'
   END
ELSE
   BEGIN
      PRINT '-----------------------------'
      PRINT 'Carteira de clientes REPROVADA'
      PRINT '-----------------------------'
END


