<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<!-- Compiled and minified JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
  Materialize.updateTextFields();
  $(".button-collapse").sideNav();
});

function likeThis(param) {
  console.log(param);

  if (document.getElementById(param).disabled) {
      Materialize.toast(`Você já curtiu isso!`, 5000, 'rounded');
  } else {
      Materialize.toast(`Você gostou de ${param}!`, 5000, 'blue rounded');
      document.getElementById(param).disabled=true;
  }


}

</script>
</body>
</html>
