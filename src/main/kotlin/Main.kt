fun main(){
    // Solución larga
    val resultado1 = sumaIntegers(10, 20)
    val resultado2 = sumaStrings("20", "30")
    diResultado(resultado1, resultado2)

    // Solución corta

    diResultado(sumaIntegers(10, 20), sumaStrings("20", "30"))

}

fun sumaIntegers(integer1: Int, integer2: Int): Double {
    return (integer1 + integer2).toDouble()
}

fun sumaStrings(string1: String, string2: String): Double {
    return string1.toDouble() + string2.toDouble()
}

fun diResultado(numero1: Double, numero2: Double) {
    println("SumaIntegers ha devuelto un $numero1 y SumaStrings ha devuelto un $numero2")
}
