@extends('layouts.template')

@section('title','Courses')

@section('content')
  <div class="container">
   <h3 class="center">List of Courses:</h3>
  <div class="row">

    @foreach ($courses as $course)
    <div class="row">
       <div class="col s12 m4">
         <div class="card">
           <div class="card-image">
             <img src="{{ asset($course->image) }}">
           </div>
           <div class="card-content">
             <h4>{{ $course->title }}</h4>
             <p>{{ $course->description }}</p>
           </div>
           <div class="card-action">
             <a href="#">See more...</a>
           </div>
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
