package com.example.googleplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class DetalhesFilmes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_filmes)
        setSupportActionBar(findViewById(R.id.toolbar2))

        val id_img = intent.getIntExtra("id_img", 0)
        val id_sinopse = intent.getStringExtra("sinopse")
        val id_diretor = intent.getStringExtra("direcao")
        val id_roteiro = intent.getStringExtra("id_roteiro")
        val id_detalhes = intent.getStringExtra("informacoes")
        val ori_titulo = intent.getStringExtra("titulo")
        val classificacao = intent.getIntExtra("classificacao", 0)

        Toast.makeText(this, "$id_img", LENGTH_SHORT).show()
        val imgView = findViewById<ImageView>(R.id.imgSpirit)
        imgView.setImageResource(id_img)
        val det_titulo = findViewById<TextView>(R.id.txttitulo)
        det_titulo.setText(ori_titulo)
        val det_sinopse = findViewById<TextView>(R.id.txtsinopse)
        det_sinopse.setText(id_sinopse)
        val det_diretor = findViewById<TextView>(R.id.txtdiretores)
        det_diretor.setText(id_diretor)
        val det_roteiro = findViewById<TextView>(R.id.txtdublagem)
        det_roteiro.setText(id_roteiro)
        val det_detalhes = findViewById<TextView>(R.id.txtinformacoes)
        det_detalhes.setText(id_detalhes)
        //Toast.makeText(this, "$classificacao", LENGTH_SHORT).show()
        val imgView2 = findViewById<ImageView>(R.id.imgClassi)
        imgView2.setImageResource(classificacao)

    }
}
