fun main() {
    aficheBienvenu("Mr Sabidani")
    val resultSomme = somme(20, 12)
    println("le resultat de la somme est $resultSomme")
    println("le resultat de la multiplication est ${multiplication(10, 20)}")
}

fun  aficheBienvenu(nom: String)
{
    println("Bienvenu $nom")
}

fun somme(num1: Int, num2: Int): Int
{
    val somme = num1 + num2

    return somme
}

fun multiplication(num1: Int, num2: Int) = num1 * num2