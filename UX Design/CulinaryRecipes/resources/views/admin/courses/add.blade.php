@extends('layouts.template')

@section('title','Courses')

@section('content')
  <div class="container">
   <h3 class="center">Add new Courses:</h3>

    <div class="row">
    <form class="" action="{{ route('admin.courses.save') }}" method="post" enctype="multipart/form-data">
      {{ csrf_field() }}
      @include('admin.courses._form')
      <button class="btn deep_orange">Save</button>
    </form>
    </div>
  </div>
@endsection
