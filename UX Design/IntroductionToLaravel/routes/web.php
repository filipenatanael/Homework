<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

/* (::) Paamayim Nekudotayim
Route::get('/', function () {
    return view('welcome');
});
*/

Route::get('/',['as'=>'site.welcome','uses'=>'Site\WelcomeController@index']);

Route::get('/login',['as'=>'login','uses'=>'Site\LoginController@index']);
Route::post('/login/dologin',['as'=>'site.login.dologin','uses'=>'Site\LoginController@dologin']);
Route::get('/login/logout',['as'=>'site.login.logout','uses'=>'Site\LoginController@logout']);


Route::get('/contact/{id?}',['uses'=>'ContactController@index']);
Route::post('/contact',['uses'=>'ContactController@create']);
Route::put('/contact',['uses'=>'ContactController@edit']);

Route::group(['middleware'=>'auth'], function(){
  Route::get('/admin/courses',['as'=>'admin.courses','uses'=>'Admin\CourseController@index']);
  Route::get('/admin/courses/add',['as'=>'admin.courses.add','uses'=>'Admin\CourseController@add']);
  Route::post('/admin/courses/save',['as'=>'admin.courses.save','uses'=>'Admin\CourseController@save']);
  Route::get('/admin/courses/edit/{id}',['as'=>'admin.courses.edit','uses'=>'Admin\CourseController@edit']);
  Route::put('/admin/courses/update/{id}',['as'=>'admin.courses.update','uses'=>'Admin\CourseController@update']);
  Route::get('/admin/courses/delete/{id}',['as'=>'admin.courses.delete','uses'=>'Admin\CourseController@delete']);
});

/* ID is not required!!
Route::get('/contact/{id?}', function($id = null){ return "Contact ID: $id"; });
*/

/* ID is required!!
Route::get('/contact/{id}', function($id){ echo "Contact $id"; });
*/

/*
Route::post('/contact', function(){ dd($_POST); return "Contact POST"; });
Route::put('/contact', function(){ return "Contact PUT"; });
*/
