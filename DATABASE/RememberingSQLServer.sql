SELECT * FROM Cliente AS C JOIN Pedido AS P ON C.codigoCli = P.codigoCli

SELECT nome+' '+sobrenome AS "NOME CLIENTE", cidade AS "CIDADE DO CLIENTE" FROM Cliente AS C JOIN Pedido AS P ON C.codigoCli = P.codigoCli