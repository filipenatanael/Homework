function RedirectPage() {
  $(location).attr('href', 'logIn.html');
}

function viewTicket(requester, department, subject) {
  console.log('asdas');
  jQuery.noConflict();
  $("#requester").val(requester);
  $("#department").val(department);
  $("#subject").val(subject);
  $("#ViewModal").modal('show');
}

function deleteTicket() {
  jQuery.noConflict();
  var message = 'Desculpe o transtorno está função do sistema ainda encontra-se em desenvovimento.';
  $("#underconstruction").html("<b> Olá "+window.localStorage.getItem('username')+", tudo bem?</b></br></br>"+message+"</br></br>Atenciosamente, </br>Sr. Desenvolvedor.");
  $("#DeleteModal").modal('show');
}

function editTicket(requester, department, subject){
  jQuery.noConflict();
  window.localStorage.setItem('temp_requester', requester);
  window.localStorage.setItem('temp_department', department);
  window.localStorage.setItem('temp_subject', subject);
  $(location).attr('href', 'EditTicket.html');
}

function createTicket() {
  jQuery.noConflict();
  $("#currentUsername").val(window.localStorage.getItem('username'));
  $("#currentEmail").val(window.localStorage.getItem('email'));
  $("#NewTicket").modal('show');
}

function setEditInfo() {
  $("#requester").val(window.localStorage.getItem('temp_requester'));
  $("#department").val(window.localStorage.getItem('temp_department'));
  $("#subject").val(window.localStorage.getItem('temp_subject'));
}
