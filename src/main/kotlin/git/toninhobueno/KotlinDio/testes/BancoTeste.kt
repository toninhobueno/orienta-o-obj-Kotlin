package git.toninhobueno.KotlinDio.testes

import git.toninhobueno.KotlinDio.Banco

fun main(){
    val digiOneBank = Banco ("DigiOne", 12)

    println (digiOneBank.nome)
    println (digiOneBank.numero)
    
    val banco2 = digiOneBank.copy(nome = "banco2")

    println (banco2.info())
}