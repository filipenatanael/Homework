$(document).ready(function(){
  $( "#target" ).submit(function( event ) {
    window.localStorage.setItem('username',  $('#username').val());
    let email = $('#username').val()+'@helpdeskti.com.br';
    window.localStorage.setItem('email', email);
    window.localStorage.setItem('password',  $('#password').val());
    event.preventDefault();
    $(location).attr('href', 'home.html');
  });
});

$(document).ready(function(){
  let message = 'Bem-vindo, ';
  $("#username_Field").text(message+window.localStorage.getItem('username'));
  $("#email_Field").text(window.localStorage.getItem('email'));
});
