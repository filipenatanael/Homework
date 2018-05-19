@extends('layouts.template')
@section('title','Courses')
@section('content')

  <div class="container">
    <p></p>
    <div class="row">
      <nav>
        <div class="nav-wrapper">
          <div class="col s12">
            <a href="#!" class="breadcrumb">Listas de receitas</a>
          </div>
        </div>
      </nav>
    </div>

    <div class="row">

      @foreach ($courses as $course)
          <div class="col s12 m4">
            <div class="card">
              <div class="card-image">
                <img src="{{ asset($course->image) }}" height="200">
              </div>
              <div class="card-content">
                <h4>{{ $course->title }}</h4>
                <p>{{ $course->description }}</p>
              </div>
              <div class="card-action">
                <a href="#">See more...</a>
                <div align="right"><img src="{{ asset($course->image) }}" height="200"></div>
              </div>
            </div>
          </div>
      @endforeach

    </div>
    <div class="row" align="center">
      {{ $courses->links() }}
    </div>
  </div>
@endsection
