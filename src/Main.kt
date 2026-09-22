//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun helloWorld(nome: String) = println("Olá, $nome!")

fun media(n1: Int, n2: Int): Int = (n1 + n2) / 2
fun soma(n1: Int, n2: Int) = n1 + n2

fun main() {
    helloWorld("Luke")
    println(media(10, 8))
    println(soma(10, 85))
}