package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
//Criação da variável binding que servirá para manipular a tela.
    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)// Infla o layout da atividade de login usando o ActivityLoginBinding

        setContentView(binding.root) // Define o layout da atividade como a raiz do layout inflado da ActivityLoginBinding

        binding.buttonEntrar.setOnClickListener { // Define um listener de clique para o botão de entrada
            val username = binding.editUsername.text.toString().trim() // Obtém o texto do campo de nome de usuário
            val password = binding.editPassword.text.toString().trim() // Obtém o texto do campo de senha


            if (username.equals("abc") && password.equals("123")) { // Verifica se o nome de usuário e a senha estão corretos
                val i = Intent(this, MainActivity::class.java) // Cria uma nova intenção para iniciar a MainActivity
                i.putExtra("username", username) // Adiciona o nome de usuário como um extra para a intenção
                startActivity(i) // Inicia a MainActivity com a intenção criada
                finish() // Finaliza a atividade atual
            } else {
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show() // Exibe uma mensagem de erro usando o Toast
            }

        }

    }
}