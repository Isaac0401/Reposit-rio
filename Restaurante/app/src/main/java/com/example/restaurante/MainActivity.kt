package com.example.restaurante

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val username = intent.extras?.getString("username") // Obtém o nome de usuário passado como extra da intent

        if (!username.isNullOrEmpty()) { // Verifica se o nome de usuário não é nulo ou vazio
            binding.textOla.setText("Olá $username") // Define o texto de saudação com o nome de usuário
        }

        binding.buttonFechar.setOnClickListener { // Define um listener de clique para o botão de fechar
            finishAffinity() // Finaliza todas as atividades da aplicação
        }

        binding.buttonPedir.setOnClickListener { // Define um listener de clique para o botão de pedir
            val i = Intent(this, SplashActivity::class.java) // Cria uma nova intenção para iniciar a SplashActivity
            i.putExtra("quantidadePizza", binding.editQuantidadePizza.text.toString()) // Adiciona a quantidade de pizza como extra para a intenção
            i.putExtra("quantidadeSalada", binding.editQuantidadeSalada.text.toString()) // Adiciona a quantidade de salada como extra para a intenção
            i.putExtra("quantidadeHamburguer", binding.editQuantidadeHamburguer.text.toString()) // Adiciona a quantidade de hambúrguer como extra para a intenção
            startActivity(i) // Inicia a SplashActivity com a intenção criada
            finish() // Finaliza a atividade atual
        }

        binding.checkPizza.setOnClickListener { // Define um listener de clique para a caixa de seleção de pizza
            if (binding.checkPizza.isChecked()) { // Verifica se a caixa de seleção de pizza está marcada
                binding.editQuantidadePizza.setText("1") // Define a quantidade de pizza como 1
                binding.textPrecoPizza.visibility = View.VISIBLE // Torna o texto de preço da pizza visível
            } else {
                binding.editQuantidadePizza.setText("0") // Define a quantidade de pizza como 0
                binding.textPrecoPizza.visibility = View.GONE // Torna o texto de preço da pizza invisível
            }
        }

        binding.checkSalada.setOnClickListener { // Define um listener de clique para a caixa de seleção de salada
            if (binding.checkSalada.isChecked()) { // Verifica se a caixa de seleção de salada está marcada
                binding.editQuantidadeSalada.setText("1") // Define a quantidade de salada como 1
                binding.textPrecoSalada.visibility = View.VISIBLE // Torna o texto de preço da salada visível
            } else {
                binding.editQuantidadeSalada.setText("0") // Define a quantidade de salada como 0
                binding.textPrecoSalada.visibility = View.GONE // Torna o texto de preço da salada invisível
            }
        }

        binding.checkHamburger.setOnClickListener { // Define um listener de clique para a caixa de seleção de hambúrguer
            if (binding.checkHamburger.isChecked()) { // Verifica se a caixa de seleção de hambúrguer está marcada
                binding.editQuantidadeHamburguer.setText("1") // Define a quantidade de hambúrguer como 1
                binding.textPrecoHamburguer.visibility = View.VISIBLE // Torna o texto de preço do hambúrguer visível
            } else {
                binding.editQuantidadeHamburguer.setText("0") // Define a quantidade de hambúrguer como 0
                binding.textPrecoHamburguer.visibility = View.GONE // Torna o texto de preço do hambúrguer invisível
            }
        }


    }
}