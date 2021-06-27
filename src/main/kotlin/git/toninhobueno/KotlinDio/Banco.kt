package git.toninhobueno.KotlinDio

data class Banco(
    val nome : String,
    val numero : Int

)
{
    fun info() = "$nome - $numero"
}
