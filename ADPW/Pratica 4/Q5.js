
/*
  5. Faça uma página que some os números de 1 a 100 e exiba um alert o
  valor total da soma.
*/
function somatorio(){
  var resultado = 0;
  for(i = 0; i < 99; i++) {
    resultado += i;
  }
  return resultado;
}
console.log('O resultado é '+somatorio());
