/*
  4. Faça uma página em que o usuário digite através de um prompt o
  conceito de um aluno. O conceito é calculado em função da nota do
  aluno que varia de 0 a 100. As faixas da correlação são mostradas
  abaixo:
    Nota Conceito
    0 a 49 Insuficiente
    50 a 64 Regular
    65 a 84 Bom
    85 a 100 Ótimo
*/
var conceito = 90;

if(conceito >= 0 && conceito <= 49){
  console.log('A situação do aluno é Insuficiente.');
} else if(conceito >= 50 && conceito <= 64){
  console.log('A situação do aluno é Regular.');
} else if(conceito >= 65 && conceito <= 84){
  console.log('A situação do aluno é Bom.');
} else if(conceito >= 85 && conceito <= 100){
  console.log('A situação do aluno é Ótimo.');
}
