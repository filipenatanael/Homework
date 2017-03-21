CREATE PROCEDURE uspUpdateProdutos
(
   @IDProdutos INT,
   @Descricao VARCHAR(100)
)
AS
BEGIN
   
   UPDATE PRODUTOS SET Descricao = @Descricao WHERE IDProdutos = @IDProdutos

END

-- Testing Procedure
EXEC uspUpdateProdutos 1 , 'MOUSE PRETO'

SELECT *  FROM PRODUTOS
INSERT INTO PRODUTOS(Descricao) VALUES('MOUSE NORMAL')