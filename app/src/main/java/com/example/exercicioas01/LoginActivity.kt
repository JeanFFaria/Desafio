package com.example.exercicioas01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.exercicioas01.restaurante.MainActivity

class LoginActivity : AppCompatActivity() {
    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



//        aviso TOAST que aparece na parte inferior da tela
//        setOnClickListener = execute após o clique do botão, é como configuramos o botão para fazer uma função
//        botao.setOnClickListener {
//            Toast.makeText(this, "Avanço realizado com sucesso", Toast.LENGTH_LONG).show()
//        }


        initViews()

    }

    private fun initViews() {
        botao = findViewById(R.id.button_sign_in)

//        Intent é usada para navegar para outra tela, passar dados, executar serviço em background, etc
//        this = activity na qual o usuario está no momento, segundo argumento é a activity que o usuário deseja ir
//        startActivity(intent) = inicializa a próxima activity

        botao.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
//            intent.putExtra("user_greetings","Hi Jean,")

            startActivity(intent)
        }
    }
}