package BasicConcepts

/**
Type        Bit      Intervalo
Double      64       [1.7976931348623157 x (10)^308, 4.9406564584124654 x (10)^-324]
Float       32       [3.40282347 x 10^(38), 1.40129846 x (10)^-45]
Long        64       [-9,223,372,036,854,775,808 - 9,223,372,036,854,775,807]
Integer     32       [-2,147,483,648 - 2,147,483,647]
Short       16       [-32,768 .. 32,767]
Bytes       8        [-128,127]
Character   16       -
String      ?        -
Boolean     ?        [0,1]
 */
fun main() {
    println("${Double.MIN_VALUE} - ${Double.MAX_VALUE}")
    println("${Float.MIN_VALUE} - ${Float.MAX_VALUE}")
    println("${Long.MIN_VALUE} - ${Long.MAX_VALUE}")
    println("${Integer.MIN_VALUE} - ${Integer.MAX_VALUE}")
    println("${Short.MIN_VALUE} - ${Short.MAX_VALUE}")
    println("${Byte.MIN_VALUE} - ${Byte.MAX_VALUE}")
}