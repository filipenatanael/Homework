-- CREATE VIRTUAL TABLE

CREATE VIEW uvwPessoasProdutos
AS
SELECT
     PESSOAS.Nome,
	 PEDIDOS.Valor,
     PRODUTOS.Descricao
	 FROM PEDIDOS
	 JOIN
	   PESSOAS ON PEDIDOS.IDPESSOA = PESSOAS.IDPessoas
	 JOIN
	   PRODUTOS ON PEDIDOS.IDProdutos = PRODUTOS.IDProdutos

-- Testing VIEW
SELECT * FROM uvwPessoasProdutos
