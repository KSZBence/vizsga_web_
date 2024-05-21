<?php

namespace App\Http\Controllers;

use App\Models\szavek;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class SzavakController extends Controller
{
    public function getSzavak(){
        $szavak = DB::table('szaveks')
        ->get();
 
        return $szavak;
    }

    public function getSzavakTema($temanev){
        $szavak = DB::table('szaveks')
        ->join('temas','temas.id','=','szaveks.temaid')
        ->where('temanev', "=",$temanev)
        ->get();
 
        return $szavak;
    }
}
