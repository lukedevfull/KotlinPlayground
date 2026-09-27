package BasicConcepts.Functions

import java.util.Locale

fun main() {
    val str = "Programação Kotlin!"

// index - 0
    println(str[0])
    println(str.length)
    println(str.startsWith(prefix = "Progra"))
    println(str.endsWith(suffix = "!"))

    println(str.substring(startIndex = 6))
    println(str.substring(4, 8))
    println(str.replace(oldValue = "o", newValue = "a"))

    println(str.uppercase())
    println(str.lowercase())
    println(str.contains(other = "Kotlin"))

    str.isEmpty()
    println("           fqihbd   sqfstukf q  bjs  dbf  q        ".trim())

    print("--------------------")

    val value = 5
    val salario = 16855.95

    println("Valor: %d - Salario: %f".format(value, salario))

    println("Valor: %02d - Salario: %.2f".format(value, salario))

    println("Valor: %02d - Salario: %.2f".format(Locale.US, value, salario))
}
