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

*/
































