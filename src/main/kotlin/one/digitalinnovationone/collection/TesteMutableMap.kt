package one.digitalinnovationone.collection

fun main() {
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 2500.0, "CLT")
    val Maria = Funcionario("Maria", 4000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(Joao.nome, Joao)
    repositorio.create(Pedro.nome, Pedro)
    repositorio.create(Maria.nome, Maria)

    println(repositorio.findById(Joao.nome))

    println("__________")
    repositorio.findAll().forEach{println(it)}

    println("__________")
    println(repositorio.remove(Maria.nome))
    repositorio.findAll().forEach{println(it)}
}