CREATE PROCEDURE uspInsertPessoas
(
   @Nome VARCHAR(100),
   @CPF VARCHAR(12)
)

AS
BEGIN
   -- SP OF INSERT PESSOAS
   INSERT INTO PESSOAS(Nome,CPF) VALUES(@Nome,@CPF)
END


-- Testing of procedure
EXEC uspInsertPessoas 'Jose','34616156'

SELECT * FROM PESSOAS