$(document).ready(function(){
  $( "#target" ).submit(function( event ) {
    window.localStorage.setItem('email',  $('#email').val());
    window.localStorage.setItem('password',  $('#password').val());
    event.preventDefault();
    $(location).attr('href', 'home.html');
  });
});
