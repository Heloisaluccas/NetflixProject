package com.example.googleplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgView1 = findViewById<ImageView>(R.id.imgspirit)
        val imgView2 = findViewById<ImageView>(R.id.imgyellows)
        val imgView3 = findViewById<ImageView>(R.id.imgsrsmith)
        val imgView4 = findViewById<ImageView>(R.id.imgb99)
        val imgView5 = findViewById<ImageView>(R.id.imgbarbie)
        val imgView6 = findViewById<ImageView>(R.id.imgbarbie2)
        val imgView7 = findViewById<ImageView>(R.id.imgprincesa)
        val imgView8 = findViewById<ImageView>(R.id.imgdemons)
        val imgView9 = findViewById<ImageView>(R.id.imgdamav)
        val imgView10 = findViewById<ImageView>(R.id.imgprincesa2)
        val imgView11 = findViewById<ImageView>(R.id.imgsuits)
        val imgView12 = findViewById<ImageView>(R.id.imglegalmente)



        imgView1.setOnClickListener {
            val Intent = Intent(this, DetalhesFilmes::class.java).apply {
                val titulo = "Spirit - Um Corcel Indomável"
                val tipo = "Filme"
                val sinopse = "Um cavalo selvagem e majestoso, nascido livre, conhece a crueldade e a bondade ao encontrar humanos pela primeira vez, mas ele se recusa a ser domado."
                val informacoes = "2002 ‧ Faroeste/Aventura ‧ 1h 24m"
                val direcao = " Filme dirigido por Kelly Asbury e Lorna Cook. "
                val classificacao = "Indicado para todos os públicos"

                putExtra("id_img", R.drawable.spirit)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("informaçoes", informacoes)
                putExtra("direcao", direcao)
                putExtra("classificacao", R.drawable.livre)


            }
            Toast.makeText(this, "clicou imagem 1", LENGTH_SHORT).show()
            startActivity(Intent)
        }
        imgView2.setOnClickListener {
            val Intent = Intent(this, DetalhesFilmes::class.java).apply {
                val titulo = "Yellowstone"
                val tipo = "Série"
                val sinopse = "John Dutton tenta proteger seu rancho, o maior dos Estados Unidos, de um mundo corrupto."
                val direcao = "Filme dirigido por Taylor Sheridan, John Linson"
                val informacoes = "2018 ‧ Faroeste ‧ 5 temporadas"
                val classificacao = "Indicado para maiores de 14 anos"

                putExtra("id_img", R.drawable.yellowstone)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
                putExtra("informacoes", informacoes)
                putExtra("classificacao", R.drawable.indicacao)

            }
            Toast.makeText(this, "clicou imagem 2", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView3.setOnClickListener {
            val Intent = Intent(this, DetalhesFilmes::class.java).apply {
                val titulo = "Sr e Sra Smith"
                val tipo = "Filme"
                val sinopse = "A vida de um pacato casal muda radicalmente quando os dois descobrem que guardam um mesmo segredo: são assassinos profissionais."
                val direcao = "Dirigido por Doug Liman"
                val informacoes = "2005 ‧ Ação/Comédia ‧ 2h 6m"
                val classificacao = "Indicado para maiores de 14 anos"


                putExtra("id_img", R.drawable.sresrasmith)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("informacoes", informacoes)
                putExtra("direcao", direcao)
                putExtra("classificacao", R.drawable.indicacao)
            }
            Toast.makeText(this, "clicou imagem 3", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView4.setOnClickListener {
            val Intent = Intent(this, DetalhesFilmes::class.java).apply {
                val titulo = "Brooklyn 99"
                val tipo = "Série"
                val sinopse = "Jake Peralta é um detetive brilhante e ao mesmo tempo imaturo, que nunca precisou se preocupar em respeitar as regras. Tudo muda quando um capitão exigente assume o comando de seu esquadrão e Jake deve aprender a trabalhar em equipe"
                val episodios = "Brooklyn99"
                val informacoes = " 2013 ‧ Sitcom ‧ 8 temporadas"
                val direcao = "Filme dirigido por Michael Schur, Dan Goor"
                val classificacao = "Indicado para maiores de 14 anos"


                putExtra("id_img", R.drawable.b99)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("episodios", episodios)
                putExtra("direcao", direcao)
                putExtra("informacoes", informacoes)
                putExtra("classificacao", R.drawable.indicacao)
            }
            Toast.makeText(this, "clicou imagem 4", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView5.setOnClickListener {
            val Intent = Intent(this, DetalhesFilmes::class.java).apply {
                val titulo = "Barbie e as Três Mosqueteiras"
                val tipo = "Filme"
                val sinopse = "Corinne treina em segredo para se tornar uma mosqueteira. Quando chega a hora de proteger o príncipe e a família real de um plano maligno, ela precisa da ajuda das outras empregadas do palácio."
                val direcao = "Filme dirigido por  William Lau"
                val informacoes = "2009 ‧ Aventura/Drama ‧ 1h 22m"
                val classificacao = "Indicado para todos os públicos"

                putExtra("id_img", R.drawable.barbie)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("informacoes", informacoes)
                putExtra("direcao", direcao)
                putExtra("classificacao", R.drawable.livre)

            }
            Toast.makeText(this, "clicou imagem 5", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView6.setOnClickListener {
            val Intent = Intent(this, DetalhesFilmes::class.java).apply {
                val titulo = "Barbie e as Três Mosqueteiras"
                val tipo = "Filme"
                val sinopse = "Corinne treina em segredo para se tornar uma mosqueteira. Quando chega a hora de proteger o príncipe e a família real de um plano maligno, ela precisa da ajuda das outras empregadas do palácio."
                val direcao = "Filme dirigido por  William Lau"
                val informacoes = "2009 ‧ Aventura/Drama ‧ 1h 22m"
                val classificacao = "Indicado para todos os públicos"

                putExtra("id_img", R.drawable.barbie)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("informacoes", informacoes)
                putExtra("direcao", direcao)
                putExtra("classificacao", R.drawable.livre)
            }
            Toast.makeText(this, "clicou imagem 6", LENGTH_SHORT).show()
            startActivity(Intent)
        }

        imgView7.setOnClickListener {
            val Intent = Intent(this, DetalhesFilmes::class.java).apply {
                val titulo = "Princesa e o Sapo"
                val tipo = "Filme"
                val sinopse = "Trabalhadora e ambiciosa, Tiana sonha um dia abrir o seu próprio restaurante em Nova Orleans, seus planos tomam um rumo diferente quando ela conhece o príncipe Naveen."
                val informacoes = "2009, Musical/Romance, 1h 37m"
                val direcao = "Filme dirigido por John Musker e Ron Clements."
                val classificacao = "Indicado para todos os públicos"


                putExtra("id_img", R.drawable.princesaeosapo)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("informacoes", informacoes)
                putExtra("direcao", direcao)
                putExtra("classificacao",R.drawable.livre)


            }
            Toast.makeText(this, "clicou imagem 7", LENGTH_SHORT).show()
            startActivity(Intent)
        }
        imgView8.setOnClickListener {
            val Intent = Intent(this, DetalhesFilmes::class.java).apply {
                val titulo = "Demon Slayer"
                val tipo = "Série"
                val sinopse = "Demônios massacraram sua família e amaldiçoaram sua irmã. Agora Tanjiro inicia sua jornada para encontrar a cura e se vingar."
                val informacoes = "2019 ‧ Anime ‧ 4 temporadas"
                val direcao = "Filme dirigido por Koyoharu Gotouge"
                val classificacao = "Para maiores de 16 anos"

                putExtra("id_img", R.drawable.demonslayer)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
                putExtra("informacoes", informacoes)
                putExtra("classificacao", R.drawable.classificacao)
            }
            Toast.makeText(this, "clicou imagem 8", LENGTH_SHORT).show()
            startActivity(Intent)
        }
        imgView9.setOnClickListener {
            val Intent = Intent(this, DetalhesFilmes::class.java).apply {
                val titulo = "A Dama e o Vagabundo"
                val tipo = "Filme"
                val sinopse = "Este clássico animado mostra que depois de algumas circunstâncias tensas, 'Dama' encontra-se solta na rua. Ela torna-se protegida do vira-lata durão ‘Vagabundo’ e um romance começa a florescer entre os dois cães."
                val informacoes = "1955 ‧ Romance/Musical ‧ 1h 16m"
                val direcao = "Filme dirigido por Wilfred Jackson, Clyde Geronimi e Hamilton Luske"
                val classificacao = "Indicado para todos os públicos"

                putExtra("id_img", R.drawable.damaevagabundo)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
                putExtra("informacoes", informacoes)
                putExtra("classificacao", R.drawable.livre)
            }
            Toast.makeText(this, "clicou imagem 9", LENGTH_SHORT).show()
            startActivity(Intent)
        }
        imgView10.setOnClickListener {
            val Intent = Intent(this, DetalhesFilmes::class.java).apply {
                val titulo = "Princesa e o Sapo"
                val tipo = "Filme"
                val sinopse = "Trabalhadora e ambiciosa, Tiana sonha um dia abrir o seu próprio restaurante em Nova Orleans, seus planos tomam um rumo diferente quando ela conhece o príncipe Naveen."
                val informacoes = "2009, Musical/Romance, 1h 37m"
                val direcao = "Filme dirigido por John Musker e Ron Clements."
                val classificacao = "Indicado para todos os públicos"


                putExtra("id_img", R.drawable.princesaeosapo)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("informacoes", informacoes)
                putExtra("direcao", direcao)
                putExtra("classificacao",R.drawable.livre)

            }
            Toast.makeText(this, "clicou imagem 10", LENGTH_SHORT).show()
            startActivity(Intent)
        }
        imgView11.setOnClickListener {
            val Intent = Intent(this, DetalhesFilmes::class.java).apply {
                val titulo = "Suits"
                val tipo = "Série"
                val sinopse =
                    "Mesmo sem se formar e sem licença para advogar, um jovem impressiona um importante advogado e consegue uma cobiçada posição em sua firma."
                val informacoes = " 2011 ‧ Drama ‧ 9 temporadas"
                val direcao = "Dirigido por Aaron Korsh"
                val classificacao = "Indicado para maiores de 14 anos"

                putExtra("id_img", R.drawable.suits)
                putExtra("titulo", titulo)
                putExtra("tipo", tipo)
                putExtra("sinopse", sinopse)
                putExtra("direcao", direcao)
                putExtra("informacoes", informacoes)
                putExtra("classificacao", R.drawable.indicacao)
            }
            Toast.makeText(this, "clicou imagem 11", LENGTH_SHORT).show()
            startActivity(Intent)
        }
            imgView12.setOnClickListener {
                val Intent = Intent(this, DetalhesFilmes::class.java).apply {
                    val titulo = "Legalmente Loira"
                    val tipo = "Filme"
                    val sinopse = "Elle Woods namora o mais bonito garoto de seu colégio, Warner Huntington IIIEle decide estudar Direito na Universidade de Harvard e termina o relacionamento com Elle. Warner só não espera que a mesma também começa a estudar na mesma escola que ele."
                    val informacoes = "2001 ‧ Comédia/Romance ‧ 1h 34m"
                    val direcao = "Dirigido por Aaron Korsh"
                    val classificacao = "Indicado para todos os públicos"

                    putExtra("id_img", R.drawable.legalmenteloira)
                    putExtra("titulo", titulo)
                    putExtra("tipo", tipo)
                    putExtra("sinopse", sinopse)
                    putExtra("direcao", direcao)
                    putExtra("informacoes", informacoes)
                    putExtra("classificacao", R.drawable.livre)
                }
                Toast.makeText(this, "clicou imagem 12", LENGTH_SHORT).show()
                startActivity(Intent)
        }

    }
}

