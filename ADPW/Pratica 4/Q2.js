
/*
  2. Faça uma página no qual o usuário digita, através de prompts, os
  valores das notas de 2 alunos e exiba na tela, através de um alerta,
  a média das notas. Ao digitar cada uma das notas o programa deve
  exibir uma mensagem de orientação para o usuário como, por exemplo,
  “Digite a nota do primeiro aluno”.
*/
var alunos = new Array();
alunos[0] = new Array();
alunos[1] = new Array();

function setNotas(){
  for(i=0; i<2; i++){
    for(j=0; j<3; j++){
      alunos[i][j] = Math.floor((Math.random() * 30 ) +1);
    }
  }
}

function getMedias(){
  var resultado;
  for(i=0; i<2; i++){
    resultado = 0
    for(j=0; j<3; j++){
      resultado = resultado + parseInt(alunos[i][j]);
    }
    console.log('A media do aluno: '+(i+1)+' é '+resultado);
  }
}

setNotas();
getMedias();
