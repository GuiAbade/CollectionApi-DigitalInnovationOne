package one.digitalinnovationone.collection

fun main () {
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 2500.0, "CLT")
    val Maria = Funcionario("Maria", 4000.0, "PJ")

    val Funcionario1 = setOf(Joao, Pedro)
    val Funcionario2 = setOf(Maria)

    val resultUnion = Funcionario1.union(Funcionario2)
    resultUnion.forEach{println(it)}

    println("--------------------------")
    val Funcionario3 = setOf(Joao, Pedro, Maria)
    val resultSubtract = Funcionario3.subtract(Funcionario2)
    resultSubtract.forEach{println(it)}

    println("--------------------------")
    val Funcionario4 = setOf(Joao, Pedro, Maria)
    val resultIntersect = Funcionario3.intersect(Funcionario2)
    resultIntersect.forEach{println(it)}
}