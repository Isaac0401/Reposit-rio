package com.example.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({ // Cria um novo manipulador para executar uma tarefa após um atraso
            val i = intent // Obtém a intenção atual
            val j = Intent(this, PedidoActivity::class.java) // Cria uma nova intenção para iniciar a atividade PedidoActivity
            j.putExtras(i) // Adiciona todos os extras da intenção atual à nova intenção
            startActivity(j) // Inicia a atividade PedidoActivity com a nova intenção
        }, 2000) // Define um atraso de 2000 milissegundos (2 segundos) antes de executar a tarefa


    }
}