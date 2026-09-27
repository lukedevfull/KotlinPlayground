import javax.management.InvalidAttributeValueException

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
    val str: String? = null
    println(str?.length)
//    print(str!!.length)

    print("Enter a Number")
    val v = readLine()
    if (v != null){
        try {
            v.trim().toInt()
        } catch (e: NumberFormatException) {
            println("Please input a valid NUMBER")
        }
        catch (e: NullPointerException) {
            println("Please input NON NULL")
        }
        catch (e: Exception){
            println("Unrecord fatal error")
        }
//      finally {
//            println()
        }
    }

