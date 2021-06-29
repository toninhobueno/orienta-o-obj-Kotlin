package git.toninhobueno.KotlinDio.testes

import git.toninhobueno.KotlinDio.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}