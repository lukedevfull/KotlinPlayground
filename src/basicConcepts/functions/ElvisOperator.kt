package basicConcepts.functions

fun main(){
    val str: String? = null //variavel exemplo

    //PARTE 1 ?: PARTE 2
//    if (str == null) {
//        println("Please input NON NULL")
//    } else {
//        println(str)
//    }
    //essa extrutura pode ser substituida por um operadfor elvis
    println(str ?: "NULL")
}