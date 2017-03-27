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
1 � Por que esse campo est� com esse conte�do? Porque n�o associamos a chave estrangeira;

2- O que deve ser feito para regularizar o banco? Deve ser realidar um acessia��o dos registro a suas respequitivas chaves

*/


