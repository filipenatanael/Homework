-- Verifique a estrutura atual da tabela Produto. Crie um campo de nome
-- codigoForn, tipo INT.

sp_help Produto

ALTER TABLE Produto ADD codigoForm INT
