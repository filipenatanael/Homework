SELECT * FROM Cliente AS C JOIN Pedido AS P ON C.codigoCli = P.codigoCli

/*
  SELECT * FROM Cliente AS C LEFT JOIN Pedido AS P ON C.codigoCli = P.codigoCli

  SELECT nome+' '+sobrenome AS 'NOME CLIENTE', cidade AS 'CIDADE DO CLIENTE', cpf AS 'NUMERO DO CPF'
  FROM Cliente AS C JOIN Pedido AS P ON C.codigoCli = P.codigoCli
*/
