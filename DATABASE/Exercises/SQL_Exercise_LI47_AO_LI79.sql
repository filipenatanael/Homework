/*
SELECT * FROM Cliente WHERE estado = 'MG' AND sexo = 'F' AND cidade = 'Belo Horizonte'

-- ATIVIDADE 54

CREATE PROCEDURE SP_AlteraSituacaoCliente
AS
BEGIN
UPDATE Cliente SET situacao = 'I' WHERE estado = 'MG' AND sexo = 'F' AND cidade = 'Belo Horizonte'
END

EXEC SP_AlteraSituacaoCliente

-- ATIVIDADE 55

CREATE PROCEDURE SP_AlteraSituacaoCliente2 @estado CHAR(2), @sexo CHAR(1), @cidade VARCHAR(27)
AS
BEGIN
UPDATE Cliente SET situacao = 'I' WHERE estado = @estado AND sexo = @sexo AND cidade = @cidade
END

-- ATIVIDADE 55 COM PROCEDURE

SET NOCOUNT ON
SELECT * FROM Cliente WHERE estado = 'MG' AND sexo = 'F' AND cidade = 'Belo Horizonte' 
SELECT @@rowcount
SET NOCOUNT OFF

--  ATIVIDADE 56

SELECT pedido.numeroPed, pedido.valorTotal FROM Pedido
SELECT * FROM ItemPedido WHERE numeroPed = 10 OR numeroPed = 12

--  ATIVIDADE 57

CREATE PROCEDURE REGULARIZAR @numeroPedido INT
AS
BEGIN 
   DECLARE @ValorTotal DECIMAL(10,2)
   SET @ValorTotal = 0
   
   DECLARE @QuantidadeTotal INT
   SET @QuantidadeTotal = 0

   SET @QuantidadeTotal = (SELECT SUM(quantidade) FROM ItemPedido WHERE numeroPed = @numeroPedido)
   SET @ValorTotal = (SELECT SUM(valor * quantidade - desconto) FROM ItemPedido WHERE numeroPed = @numeroPedido)

   
   UPDATE Pedido SET valorTotal = @ValorTotal WHERE numeroPed = @numeroPedido
   END
   GO




*/


CREATE PROCEDURE REGULARIZAR @numeroPedido INT
AS
BEGIN 
   DECLARE @ValorTotal DECIMAL(10,2)
   SET @ValorTotal = 0
   
   DECLARE @QuantidadeTotal INT
   SET @QuantidadeTotal = 0

   SET @QuantidadeTotal = (SELECT SUM(quantidade) FROM ItemPedido WHERE numeroPed = @numeroPedido)
   SET @ValorTotal = (SELECT SUM(valor * quantidade - desconto) FROM ItemPedido WHERE numeroPed = @numeroPedido)

   
   UPDATE Pedido SET valorTotal = @ValorTotal WHERE numeroPed = @numeroPedido
   END
   GO
















































