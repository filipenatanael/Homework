@extends('layouts.template')

@section('title','Courses')

@section('content')
  <div class="container">
   <h3 class="center">Editing new Courses:</h3>

    <div class="row">
    <form class="" action="{{ route('admin.courses.update',$registry->id) }}" method="post" enctype="multipart/form-data">
      {{ csrf_field() }}
      <input type="hidden" name="_method" value="put">
      @include('admin.courses._form')
      <button class="btn deep_orange">Update</button>
    </form>
    </div>
  </div>
@endsection
