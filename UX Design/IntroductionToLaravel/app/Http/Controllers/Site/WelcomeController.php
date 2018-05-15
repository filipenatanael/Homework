<?php

namespace App\Http\Controllers\Site;

use Illuminate\Http\Request;
use App\Http\Controllers\Controller;
use App\Course;

class WelcomeController extends Controller
{
    public function index()
    {
      $courses = Course::paginate(1);
      return view('welcome', compact('courses'));
    }
}
