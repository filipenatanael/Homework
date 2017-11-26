function viewDemand(requester, department, subject) {
  jQuery.noConflict();
  $("#requester").val(requester);
  $("#department").val(department);
  $("#subject").val(subject);
  $("#DemandModal").modal('show');
}


function deleteDemand() {
  jQuery.noConflict();
  var message = 'Desculpe o transtorno está função do sistema ainda encontra-se em desenvovimento.';
  $("#underconstruction").html("<b> Olá "+window.localStorage.getItem('username')+", tudo bem?</b></br></br>"+message+"</br></br>Atenciosamente, </br>Sr. Desenvolvedor.");
  $("#DeleteModal").modal('show');
}
