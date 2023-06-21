package com.example.my_dog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭됨을 알기
        val img01 = findViewById<ImageView>(R.id.img01)
        img01.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면 다음 화면으로 넘어가서 사진이 크게 보이기
            val intent = Intent(this, Dog1Activity2::class.java)
            startActivity(intent)
        }

        // 1. 화면이 클릭됨을 알기
        val img02 = findViewById<ImageView>(R.id.img02)
        img02.setOnClickListener {
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면 다음 화면으로 넘어가서 사진이 크게 보이기
            val intent = Intent(this, Dog2Activity2::class.java)
            startActivity(intent)
        }

        // 1. 화면이 클릭됨을 알기
        val img03 = findViewById<ImageView>(R.id.img03)
        img03.setOnClickListener {
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면 다음 화면으로 넘어가서 사진이 크게 보이기
            val intent = Intent(this, Dog3Activity2::class.java)
            startActivity(intent)
        }

        // 1. 화면이 클릭됨을 알기
        val img04 = findViewById<ImageView>(R.id.img04)
        img04.setOnClickListener {
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면 다음 화면으로 넘어가서 사진이 크게 보이기
            val intent = Intent(this, Dog1Activity2::class.java)
            startActivity(intent)
        }

        // 1. 화면이 클릭됨을 알기
        val img05 = findViewById<ImageView>(R.id.img05)
        img05.setOnClickListener {
            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면 다음 화면으로 넘어가서 사진이 크게 보이기
            val intent = Intent(this, Dog1Activity2::class.java)
            startActivity(intent)
        }

        // 1. 화면이 클릭됨을 알기
        val img06 = findViewById<ImageView>(R.id.img06)
        img06.setOnClickListener {
            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면 다음 화면으로 넘어가서 사진이 크게 보이기
            val intent = Intent(this, Dog1Activity2::class.java)
            startActivity(intent)
        }

        // 1. 화면이 클릭됨을 알기
        val img07 = findViewById<ImageView>(R.id.img07)
        img07.setOnClickListener {
            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면 다음 화면으로 넘어가서 사진이 크게 보이기
            val intent = Intent(this, Dog1Activity2::class.java)
            startActivity(intent)
        }

        // 1. 화면이 클릭됨을 알기
        val img08 = findViewById<ImageView>(R.id.img08)
        img08.setOnClickListener {
            Toast.makeText(this, "8번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면 다음 화면으로 넘어가서 사진이 크게 보이기
            val intent = Intent(this, Dog1Activity2::class.java)
            startActivity(intent)
        }
    }
}