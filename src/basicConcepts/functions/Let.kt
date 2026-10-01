package basicConcepts.functions

fun main () {
    val str: String? = null

//
//    str?.length
//    str?.lowercase()
//    str?.contains("abch")

    str?.let {
        //SCOPE FUNCTION, A VARIAVEL EXTERNA É REFERENCIADA COMO IT
        println(it.length)
        println(it.lowercase())
        println(it.contains("abch"))
    }
}