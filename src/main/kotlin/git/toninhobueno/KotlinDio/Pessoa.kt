package git.toninhobueno.KotlinDio

import java.lang.NullPointerException

class Pessoa {
    var nome:String = "Antonio"

    var cpf:String = "123.456.789-10"
    private set
}

fun main (){
    val antonio = Pessoa()

    println(antonio.nome)
    println(antonio.cpf)

}