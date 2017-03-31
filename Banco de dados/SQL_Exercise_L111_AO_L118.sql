-- Verifique a estrutura atual da tabela Produto. Crie um campo de nome codigoForn, tipo INT.
-- -- Definir este campo como chave estrangeira da tabela Fornecedor

sp_help Produto
ALTER TABLE Produto ADD codigoForm INT


-- Definir este campo como chave estrangeira da tabela Fornecedor
ALTER TABLE Fornecedor ADD PRIMARY KEY(codigoForm)

ALTER TABLE Produto ADD FOREIGN KEY(codigoForm) REFERENCES Fornecedor(codigoForm)


-- Verifique as constraints da tabela Produto. Verifique se a chave estrangeira foi criada corretamente.

sp_help Produto



-- Verique a quantidade de registros da tabela Produto
SELECT COUNT(*) FROM Produto



SELECT * FROM Produto

/*
Selecionar todos os registros da tabela de produtos. Observe o conte�do do
campo codigoForn. Responda: 
1 � Por que esse campo est� com esse conte�do? Porque ao criar um campo sem definir conte�do, esse � inicializado como NULL...
O SQL Server inserir� automaticamente o valor NULL se nenhum dado for digitado e n�o houver padr�o ou restri��o DEFAULT na coluna ou no tipo de dados;

2- O que deve ser feito para regularizar o banco? Associar os fornecedores para cada produto correspondente.

*/


/*
(16) Definir os primeiros 400 produtos da tabela produto para o primeiro fornecedor
cadastrado (Fornecedor de n�mero 10). Verifique a altera��o implementada.
*/


SELECT DISTINCT TOP 400 * FROM Produto

UPDATE TOP(400) Produto SET codigoForm = 10

SELECT * FROM Produto


/*
(17) Definir a partir do produto de c�digo 401 at� o produto de c�digo 600 da tabela
produto para o segundo fornecedor cadastrado (Fornecedor de n�mero 15). Verifique
a altera��o implementada.
*/


UPDATE Produto SET codigoForm = 15 WHERE codigoPro BETWEEN 401 AND 600 

SELECT * FROM Produto


/*
(18) Definir a partir do produto de c�digo 601 at� o final para o terceiro fornecedor
cadastrado (Fornecedor de n�mero 20). Verifique a altera��o implementada.
*/

UPDATE Produto SET codigoForm = 20 WHERE codigoPro BETWEEN 601 AND (SELECT COUNT(*) FROM Produto)


/*
(19) Selecionar de forma agrupada a quantidade de produto por c�digo de fornecedor.
Em ordem de c�digo de fornecedor. Veja a imagem:
*/

-- SELECT COUNT(DISTINCT codigoForm ) AS "Quantidade de destintos" FROM Produto

SELECT codigoForm AS "CODIGO DO FORNECEDOR", COUNT(*) AS "TOTAL" 
    FROM Produto GROUP BY codigoForm ORDER BY codigoForm


/*
(20) Executar o mesmo comando anterior, por�m mostrando o nome de cada
fornecedor em ordem alfab�tica.
*/



SELECT Fornecedor.nome AS "FORNECEDOR", COUNT(*) AS "TOTAL"
    FROM Produto JOIN Fornecedor ON Fornecedor.codigoForm = Produto.codigoForm 
	GROUP BY Fornecedor.nome  ORDER BY Fornecedor.nome 
	
	

/*
(21) Executar o comando SQL para mostrar todos os produtos do cliente 10, que
atingiram o estoque m�ximo (com quantidade superior ao estoque m�ximo). Mostrar
o nome dos produtos em letras mai�sculas.
*/


SELECT descricao AS "NOME DE PRODUTO", quantidade AS "QUANTIDADE", maximo AS "ESTOQUE MAXIMO" FROM Produto
WHERE quantidade>maximo



/*
(22) Mostrar a quantidade de registros, a soma dos valores em estoque, a m�dia dos
valores em estoque, o maior valor em estoque e o menor valor em estoque, somente
para cliente 10
*/


SELECT COUNT(codigoPro) AS "QUANTIDADE DE ITENS EM ESTOQUE", SUM(valorProduto). AS "SOMA", AVG(valorProduto) AS "MEDIA", 
       MAX(valorProduto) AS "MAIOR VALOR", MIN(valorProduto) AS "MENOR VALOR" FROM Produto


/*
(23) Executar a senten�a SQL para mostrar o resultado a seguir:
*/

SELECT (Cliente.nome+' '+Cliente.sobrenome) AS "CLIENTES DO PARANA COM PONTUA��O SUPERIOR A 7", pontuacao AS "PONTUA��O" FROM Cliente WHERE pontuacao>7



