<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Contact extends Model
{
  public function list()
  {
    return (object) [
      'name'=>'John',
      'phonenumber'=>'000000005'
    ];

  }
}
