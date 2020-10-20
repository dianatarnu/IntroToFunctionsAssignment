package com.example.introtofunctionsassignment

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val genre: String = "Indie Rock"
    val artist: String = "Arctic Monkeys"
    val year: Int = 2013

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        genre()
        artist()
        year()
    }

    fun genre():String{
        Log.d("band_genre", genre)
        return genre
    }

    fun artist():String{
        Log.d("band_artist", artist)
        return artist
    }

    fun year():Int{
        Log.d("band_year", "$year")
        return year
    }
}

