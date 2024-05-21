<?php

use App\Models\szavek;
use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('szaveks', function (Blueprint $table) {
            $table->id();
            $table->string('angol');
            $table->string('magyar');
            $table->foreignId("temaId")->references("id")->on("temas");
            $table->timestamps();
        });

        szavek::Create(["angol"=> "yes","magyar"=> "igen","temaId"=> 1]);
        szavek::Create(["angol"=> "no","magyar"=> "nem","temaId"=> 1]);
        szavek::Create(["angol"=> "snake","magyar"=> "kígyó","temaId"=> 2]);

    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('szaveks');
    }
};
