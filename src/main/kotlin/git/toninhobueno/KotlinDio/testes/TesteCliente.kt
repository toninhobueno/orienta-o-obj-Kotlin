package git.toninhobueno.KotlinDio.testes

import git.toninhobueno.KotlinDio.Cliente
import git.toninhobueno.KotlinDio.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "José da Silva",
        cpf ="123.456.789-10",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}