CREATE FUNCTION CompleteCPF
(
    @Tamanho INT,
	@Valor VARCHAR(MAX)
)
RETURNS VARCHAR(MAX)
AS
BEGIN

   DECLARE @Retorno AS VARCHAR(MAX)

   IF(LEN(@Valor) <= @Tamanho)
     SET @Retorno = REPLICATE('0', @Tamanho - LEN(@Valor)) + @Valor
   ELSE
     SET @Retorno = @Valor

   RETURN @Retorno

END

-- Testing Function dbo.CompleteCPF(@Tamanho ,@Valor)

INSERT INTO PESSOAS(Nome, CPF) VALUES('Geraldo', dbo.CompleteCPF(11,'32131321'))
