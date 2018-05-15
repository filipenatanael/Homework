@extends('layouts.template')

@section('title','Courses')

@section('content')
  <div class="container">
   <h3 class="center">Login on system</h3>

    <div class="row">
    <form class="" action="{{ route('site.login.dologin') }}" method="post">
      {{ csrf_field() }}

      <div class="input-field">
        <input type="text" name="email">
        <label>Email</label>
      </div>

      <div class="input-field">
        <input type="password" name="password">
        <label>Password</label>
      </div>

      <button class="btn deep_orange">Login</button>
    </form>
    </div>
  </div>
@endsection
