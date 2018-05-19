<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>@yield('title')</title>
  <!--Import Google Icon Font-->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!-- Compiled and minified CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
  <!--Let browser know website is optimized for mobile-->
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</head>
<body>

  <div class="container">
    <div class="row">
      <header>
        <nav>
          <div class="nav-wrapper teal green darken-3">
            <a href="#!" class="brand-logo">  Laravel Course</a>
            <a href="#" data-activates="mobile" class="button-collapse"><i class="material-icons">menu</i></a>
            <ul class="right hide-on-med-and-down">
              <li><a href="/">Home</a></li>

              @if(Auth::guest())
                <li><a href="{{ route('login') }}">Login</a></li>
              @else
                <li><a href="{{ route('admin.courses') }}">Courses</a></li>
                <li><a href="#">{{ Auth::user()->name }}</a></li>
                <li><a href="{{ route('site.login.logout') }}">Logout</a></li>
              @endif

            </ul>
            <ul class="side-nav" id="mobile">
              <li><a href="/">Home</a></li>
              <li><a href="{{ route('admin.courses') }}">Components</a></li>
            </ul>
          </div>
        </nav>
      </header>
    </div>
  </div>
