<?php

namespace App\Http\Controllers\Site;

use Illuminate\Http\Request;
use App\Http\Controllers\Controller;
use Auth;

class LoginController extends Controller
{
    public function index()
    {
      return view('login.index');
    }

    public function dologin(Request $request)
    {
      $data = $request->all();
      if(Auth::attempt(['email'=>$data['email'],'password'=>$data['password']]))
      {
        return redirect()->route('admin.courses');
      }
      return redirect()->route('login');
    }

    public function logout()
    {
      Auth::logout();
      return redirect()->route('site.welcome');
      //return redirect()->route('login');
    }
}
