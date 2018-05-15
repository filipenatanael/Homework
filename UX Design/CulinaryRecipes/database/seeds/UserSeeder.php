<?php

use Illuminate\Database\Seeder;
use App\User;

class UserSeeder extends Seeder
{
    /**
     * Run the database seeds.
     * [All Seeder] Command line: php artisan db:seed
     * [Specific Seeder] Command line: php artisan db:seed --class=UserSeeder
     * @return void
     */
    public function run()
    {
      $data = [
        'name'=>"Administrator",
        'email'=>"administrator@example.com",
        'password'=>bcrypt("My@password"),
      ];

      if(User::where('email','=',$data['email'])->count()){
        $user = User::where('email','=',$data['email'])->first();
        $user->update($data);
        echo "Created!";
      }else{
        User::create($data);
        echo "Was updated!";
      }
    }

}
