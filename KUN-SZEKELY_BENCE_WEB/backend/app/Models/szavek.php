<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class szavek extends Model
{
    use HasFactory;
    
    protected $fillable = [
        "angol",
        "magyar",
        "temaId"
    ];
    
}
