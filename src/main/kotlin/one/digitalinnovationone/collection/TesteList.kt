package one.digitalinnovationone.collection

fun main() {
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 2500.0, "CLT")
    val Maria = Funcionario("Maria", 4000.0, "PJ")

    val funcionarios = listOf(Joao, Pedro, Maria)

    funcionarios.forEach{println(it)}
    println("-------------------")
    println(funcionarios.find{ it.nome == "Maria"})

    println("-------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach{println(it)}

    println("-------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{println(it)}
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}