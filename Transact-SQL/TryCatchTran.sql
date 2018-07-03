-- Create Stored Procedure

CREATE PROCEDURE uspTryCatchAndTran
(
    @Nome VARCHAR(100),
	@CPF VARCHAR(12)
)
AS
BEGIN

   BEGIN TRY
      -- Iniciando transa��o de dados
	  BEGIN TRAN
	  -- Iniciando estrutura condifional
	  IF(@Nome IS NOT NULL)
	  BEGIN
	  INSERT INTO PESSOAS(Nome,CPF) VALUES(@Nome,@CPF)
	  END
	  COMMIT TRAN
	  SELECT @Nome AS Retorno
   END TRY
   BEGIN CATCH
      ROLLBACK TRAN
      SELECT ERROR_MESSAGE() AS Retorno
   END CATCH
END

-- Testing Stored Procedure >> Exce��o e Transa��o
EXEC uspTryCatchAndTran 'Carlos Antonio', '564161613'
