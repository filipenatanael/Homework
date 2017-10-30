function FormProjectCharacterization() { //ON Index
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
  window.localStorage.setItem('radio_interdisciplinarity', document.getElementById('radio_interdisciplinarity').value);
  window.localStorage.setItem('Describe_interdisciplinarity', document.getElementById('Describe_interdisciplinarity').value);

  window.location.href = "Project_Coordination.html";
  /*
  alert(window.localStorage.getItem('title_project'));

  var title_project = window.localStorage.getItem('title_project');
  // Remove o item
  window.localStorage.removeItem('title_project');
  console.log(window.localStorage);
  */
}

function Project_Coordination(){
  window.localStorage.setItem('Coordinator_project', document.getElementById('Coordinator_project').value);
  window.localStorage.setItem('course1', document.getElementById('course1').value);
  window.localStorage.setItem('Course_campus1', document.getElementById('Course_campus1').value);
  window.localStorage.setItem('course2', document.getElementById('course2').value);
  window.localStorage.setItem('Course_campus2', document.getElementById('Course_campus2').value);
  window.localStorage.setItem('course3', document.getElementById('course3').value);
  window.localStorage.setItem('Course_campus3', document.getElementById('Course_campus3').value);
  window.localStorage.setItem('email', document.getElementById('email').value);
  window.localStorage.setItem('codeArea_landline', document.getElementById('codeArea_landline').value);
  window.localStorage.setItem('number_landline', document.getElementById('number_landline').value);
  window.localStorage.setItem('maximum_titration', document.getElementById('maximum_titration').value);
  window.localStorage.setItem('address_curriculum', document.getElementById('address_curriculum').value);

  window.location.href = "Show_All_Information.html";



}

function Show_All_Information() {
  document.getElementById('title_project').innerHTML = window.localStorage.getItem('title_project');
  document.getElementById('college_campus').innerHTML = window.localStorage.getItem('college_campus');
  document.getElementById('director_campus').innerHTML = window.localStorage.getItem('director_campus');
  document.getElementById('course_coordinator').innerHTML = window.localStorage.getItem('course_coordinator');
  document.getElementById('knowledge_area').innerHTML = window.localStorage.getItem('knowledge_area');
  document.getElementById('main_theme_Area1').innerHTML = window.localStorage.getItem('main_theme_Area1');
  document.getElementById('theme_Area2').innerHTML = window.localStorage.getItem('theme_Area2');
  document.getElementById('theme_Area3').innerHTML = window.localStorage.getItem('theme_Area3');
  document.getElementById('main_extension').innerHTML = window.localStorage.getItem('main_extension');
  document.getElementById('extension2').innerHTML = window.localStorage.getItem('extension2');
  document.getElementById('extension3').innerHTML = window.localStorage.getItem('extension3');
  document.getElementById('radio_bond').innerHTML = window.localStorage.getItem('radio_bond');
  document.getElementById('checkbox_sustainability').innerHTML = window.localStorage.getItem('checkbox_sustainability');
  document.getElementById('radio_interdisciplinarity').innerHTML = window.localStorage.getItem('radio_interdisciplinarity');
  document.getElementById('Describe_interdisciplinarity').innerHTML = window.localStorage.getItem('Describe_interdisciplinarity');

}
