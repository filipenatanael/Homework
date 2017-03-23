CREATE DATABASE LOJAINFO

USE LOJAINFO

CREATE TABLE tbl_pedidos(
  IDPedido INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
  IDProduto INT NOT NULL FOREIGN KEY REFERENCES tbl_produtos(IDProduto),
  IDPessoa INT NOT NULL,
  Nome VARCHAR(100) NOT NULL,
  Quantidade INT NOT NULL,
  Valor FLOAT
)

CREATE TABLE tbl_produtos(
    IDProduto INT PRIMARY KEY NOT NULL,
    Descricao VARCHAR(100) NOT NULL,
)