package git.toninhobueno.KotlinDio.testes

import git.toninhobueno.KotlinDio.Funcionario
import git.toninhobueno.KotlinDio.Pessoa
import java.math.BigDecimal

fun main (){
    val antonio = Pessoa(nome = "Antonio",cpf = "12345678910")

    println(antonio.nome)
    println(antonio.cpf)


    val joao = Funcionario("Joao","987564321", BigDecimal.valueOf(2000.0));
    println(joao.nome)
    println(joao.cpf)
}