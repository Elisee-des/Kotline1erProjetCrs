fun main() {
    val nom1 = "SAbidani"
    val nom2 = "Bonzi"
    val phrase = """Kotline est cool"""

    println("le nom est $nom1")
    println("la phrase est: $phrase")

    val lengh = phrase.length
    println("la phrase contient $lengh caracteres")
    println("la nom contient ${nom1.length} caracteres")

    println("nom1 == nom2 ? ${nom1 == nom2}")
    println("nom1 == nom2 ? ${nom1.get(0)}")

    println("Kotlin fait partir de $phrase? ${phrase.contains("kotlin", true)}")

}