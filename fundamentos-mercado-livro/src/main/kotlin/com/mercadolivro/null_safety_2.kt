package com.mercadolivro

fun main(){
    val pessoa : Pessoa? = null

    println(pessoa!!.Nome)
    println("Final do Código!")
}

class Pessoa (var Nome: String, var Idade: Int){

}
