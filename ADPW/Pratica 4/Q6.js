/*
  6. Faça uma página em que o usuário digita em um prompt um valor N e
  determine o fatorial desse número N. O fatorial de um número N (N!)
  é definido conforme a seguir:
  N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
*/

function fatorial(numero){
  if (numero < 0) {
    return 'Não há fatorial de numeros negativos.';
  }

  else if (numero == 0) {
    return 'Não há fatorial de 0.';
  }
  var auxiliar = numero;
  while (numero-- > 2) {
    auxiliar *= numero;
  }
  return 'O valor fatorial é '+auxiliar;
}
var valor = 30;
var resultado = fatorial(valor);
console.log(resultado);
