package com.example.clientesapp.teste

import com.example.clientesapp.model.Cliente
import com.example.clientesapp.service.RetrofitFactory
import retrofit2.Retrofit

fun main() {

    val c1 = Cliente(

        nome = "Richard",
        email = "richard@gmail.com"
    )

    val retrofit = RetrofitFactory().getClienteService()
    val cliente = retrofit.gravar(c1)

}