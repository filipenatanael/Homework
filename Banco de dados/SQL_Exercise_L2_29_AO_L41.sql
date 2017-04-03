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


/*
(32) Contar a quantidade de registros da tabela materialGeral. Verificar a estrutura
dessa tabela.
*/

SELECT COUNT(*) FROM MaterialGeral
SP_HELP MaterialGeral



/*
(33) Popular a tabela materialGeral incluindo 1.500.000 (Um Milhão e Quinhentos mil)
registros nessa tabela. Veja o exemplo no material teórico (Teoria_Parte III). Observe
que o campo total é um campo calculado, será gerado automaticamente baseado nos
valores do campo quantidade e do campo valor.
*/


DECLARE @tempoInicial DATETIME, @contador INT, @tempoFinal DATETIME
DECLARE @descricaoMaterial VARCHAR(60)
DECLARE @quantidadeMaterial INT
DECLARE @valorMaterial FLOAT 


SET @descricaoMaterial = 'DESCRICAO'
SET @quantidadeMaterial = 45
SET @valorMaterial = 75


SET @tempoInicial = GETDATE()
SET @contador = -1
WHILE (@contador < 5)
   BEGIN
   INSERT INTO MaterialGeral(descricao,quantidade,valor) VALUES(@descricaoMaterial,@quantidadeMaterial,@valorMaterial)
   SET @contador = @contador +1
   END
SET @tempoFinal = GETDATE()


PRINT 'TEMPO INICIAL: '+CAST(@tempoInicial AS VARCHAR)
PRINT 'TEMPO FINAL: '+CAST(@tempoFinal AS VARCHAR)

-- CHECANDO INSERT DE DADOS
SELECT * FROM MaterialGeral
