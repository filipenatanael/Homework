$(document).ready(function(){

  $( "#target" ).submit(function( event ) {
    window.localStorage.setItem('email',  $('#email').val());
    window.localStorage.setItem('password',  $('#password').val());
    alert("Email: "+window.localStorage.getItem('email')+" Password: " +password);
    event.preventDefault();
  });

});
