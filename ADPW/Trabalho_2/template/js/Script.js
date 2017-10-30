function FormSubmit() {

  window.localStorage.setItem('title_project', document.getElementById('title_project').value);
  window.localStorage.setItem('college_campus', document.getElementById('college_campus').value);
  window.localStorage.setItem('director_campus', document.getElementById('director_campus').value);
  window.localStorage.setItem('course_coordinator', document.getElementById('course_coordinator').value);
  window.localStorage.setItem('knowledge_area', document.getElementById('knowledge_area').value);
  window.localStorage.setItem('main_theme_Area1', document.getElementById('main_theme_Area1').value);
  window.localStorage.setItem('theme_Area2', document.getElementById('theme_Area2').value);
  window.localStorage.setItem('theme_Area3', document.getElementById('theme_Area3').value);
  window.localStorage.setItem('main_extension', document.getElementById('main_extension').value);
  window.localStorage.setItem('extension2', document.getElementById('extension2').value);
  window.localStorage.setItem('extension3', document.getElementById('extension3').value);
  window.localStorage.setItem('radio_bond', document.getElementById('radio_bond').value);
  window.localStorage.setItem('checkbox_sustainability', document.getElementById('checkbox_sustainability').value);
  window.localStorage.setItem('Describe_interdisciplinarity', document.getElementById('Describe_interdisciplinarity').value);

  alert(window.localStorage.getItem('title_project'));


}
