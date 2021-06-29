package git.toninhobueno.KotlinDio.testes

import git.toninhobueno.KotlinDio.Analista
import git.toninhobueno.KotlinDio.Funcionario

fun main (){

    val joao = Analista("Joao","987564321", 2000.0);


    ImprimeRelatorioFuncionario.imprime(joao);


}