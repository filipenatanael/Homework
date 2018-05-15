<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Contact;

class ContactController extends Controller
{
    public function index()
    {
      $contactsArray = [
        ["name"=>"McCree", "phonenumber"=>"0000-0001"],
        ["name"=>"Reaper", "phonenumber"=>"0000-0002"],
      ];

      $contactsObject = [
        (object) ["name"=>"Reaper", "phonenumber"=>"0000-0002"],
        (object) ["name"=>"Tracer", "phonenumber"=>"0000-0003"],
      ];

      /* $contact = new \App\Contact(); */
      $contact = new Contact();
      $con = $contact->list();
      dd($con->name);

      return view('contact.index', compact('contactsArray','contactsObject'));
      /* Alternative way to do
      return view('contact.index', ["data"=>$contacts]);
      */
    }

    public function create(Request $request)
    {
      //dd($request['name']);
      dd($request->all());
      return 'This is a create of ContactController!';
    }

    public function edit()
    {
      return 'This is a edit of ContactController!';
    }
}
