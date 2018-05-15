@extends('layouts.template')

@section('title','Courses')

@section('content')
  <div class="container">
   <h3 class="center">List of Courses:</h3>

  <div class="row">
    <table>
      <thead>
        <tr>
          <th>Id</th>
          <th>Title</th>
          <th>Description</th>
          <th>Image</th>
          <th>Published</th>
          <th>Action</th>
        </tr>
      </thead>
      <tbody>
        @foreach($registries as $registry)
          <tr>
            <td>{{ $registry->id }}</td>
            <td>{{ $registry->title }}</td>
            <td>{{ $registry->description }}</td>
            <td> <img src="{{ asset($registry->image) }}" alt="{{ $registry->title }}" width="120", height="120"></td>
            <td>{{ $registry->published }}</td>
            <td>
              <a class="btn deep-orange" href="{{ route('admin.courses.edit',$registry->id) }}">Edit</a>
              <a class="btn red" href="{{ route('admin.courses.delete',$registry->id) }}">Delete</a>
            </td>
          </tr>
        @endforeach
      </tbody>
    </table>
  </div>
    <div class="row">
      <a class="btn blue" href="{{ route('admin.courses.add') }}">Add</a>
    </div>
  </div>
@endsection
