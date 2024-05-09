package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurante.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent // Obtém a intenção atual
        val quantidadePizza = i.getStringExtra("quantidadePizza").toString().toInt() // Obtém a quantidade de pizza do extra da intenção
        val quantidadeSalada = i.getStringExtra("quantidadeSalada").toString().toInt() // Obtém a quantidade de salada do extra da intenção
        val quantidadeHamburguer = i.getStringExtra("quantidadeHamburguer").toString().toInt() // Obtém a quantidade de hambúrguer do extra da intenção

        val texto = "Resumo do Pedido\n" + // Cria uma string com o resumo do pedido
                "Pizza: $quantidadePizza Preço: ${quantidadePizza*8}\n" + // Adiciona a quantidade e o preço da pizza ao resumo
                "Salada: $quantidadeSalada Preço: ${quantidadeSalada*10}\n" + // Adiciona a quantidade e o preço da salada ao resumo
                "Hamburguer: $quantidadeHamburguer Preço: ${quantidadeHamburguer*12}\n" // Adiciona a quantidade e o preço do hambúrguer ao resumo

        binding.textResumo.text = texto // Define o texto do resumo do pedido no TextView


    }
}