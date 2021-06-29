package git.toninhobueno.KotlinDio.testes

import git.toninhobueno.KotlinDio.Analista
import git.toninhobueno.KotlinDio.Funcionario
import git.toninhobueno.KotlinDio.Gerente

fun main (){

    val maria = Gerente("Maria","12345614531", 5000.0, "senha123");

    ImprimeRelatorioFuncionario.imprime(maria);

    TesteAutenticacao().autentica(maria);

}