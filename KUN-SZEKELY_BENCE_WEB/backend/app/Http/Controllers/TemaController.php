<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TemaController extends Controller
{
    public function getTema(){
        $tema = DB::table('temas')
        ->get();
 
        return $tema;
    }
}
