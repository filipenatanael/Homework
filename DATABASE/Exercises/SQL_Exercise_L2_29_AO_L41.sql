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
WHILE (@contador < 1500000)
   BEGIN
   INSERT INTO MaterialGeral(descricao,quantidade,valor) VALUES(@descricaoMaterial,@quantidadeMaterial,@valorMaterial)
   SET @contador = @contador +1
   END
SET @tempoFinal = GETDATE()


PRINT 'TEMPO INICIAL: '+CAST(@tempoInicial AS VARCHAR)
PRINT 'TEMPO FINAL: '+CAST(@tempoFinal AS VARCHAR)

/*
(34) Contar a quantidade de registros da tabela materialGeral. Verificar O conteúdo
dessa tabela.
*/

SELECT COUNT(*) FROM MaterialGeral
SELECT * FROM MaterialGeral

/*
(35) Executar (copiar/colar/executar) o Script de alteração da tabela materialGeral.
Nome: Script_Adicional_Tabela_MaterialGeral.TXT
*/


DECLARE @descricao VARCHAR(60), @quantidade INT, @valor float
SET @descricao = 'DESCRICAO: '
SET @quantidade = 2
SET @valor = 10
DECLARE @contador INT
SET @contador = 1
DECLARE @tempoInicial DATETIME
SET @tempoInicial = GETDATE()
WHILE (@contador <= 1000000)
   BEGIN
       IF (@contador <= 100000)
	      INSERT INTO MaterialGeral VALUES ('XX_PRODUTO: '+CAST(@contador AS VARCHAR), @quantidade, @valor)                 
	   ELSE IF (@contador > 100000 and @contador <= 400000)
	      INSERT INTO MaterialGeral VALUES ('TT_PRODUTO: '+CAST(@contador AS VARCHAR), @quantidade, @valor)                 
	   ELSE IF (@contador > 400000 and @contador <= 600000)
	      INSERT INTO MaterialGeral VALUES ('AA_PRODUTO: '+CAST(@contador AS VARCHAR), @quantidade, @valor)                 
	   ELSE IF (@contador > 600000 and @contador <= 800000)
	      INSERT INTO MaterialGeral VALUES ('RR_PRODUTO: '+CAST(@contador AS VARCHAR), @quantidade, @valor)                 
       ELSE IF (@contador > 800000 and @contador <= 900000)
	      INSERT INTO MaterialGeral VALUES ('DD_PRODUTO: '+CAST(@contador AS VARCHAR), @quantidade, @valor)                 	   
       ELSE 
	      INSERT INTO MaterialGeral VALUES ('BB_PRODUTO: '+CAST(@contador AS VARCHAR), @quantidade, @valor)                 

	   SET @contador = @contador + 1

   END
DECLARE @tempoFinal DATETIME
SET @tempoFinal= GETDATE()
PRINT '---------------'
PRINT 'Tempo inicial: '+CONVERT(VARCHAR(25), @tempoInicial)
PRINT 'Tempo Final..: '+CONVERT(VARCHAR(25), @tempoFinal)
PRINT '---------------'

/*
(36) Contar a quantidade de registros cadastrados agrupados por descrição do
produto e ordenados por descrição. Anote o tempo de resposta para essa operação.
Veja o Exemplo:
*/

SELECT descricao AS 'DESCRICAO', COUNT(*) AS 'QUANTIDADE' FROM MaterialGeral
GROUP BY descricao ORDER BY descricao