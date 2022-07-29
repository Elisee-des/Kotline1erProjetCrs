fun main() {
    val moyenne = 20

    var result = if (moyenne > 9)
    {
         "Admis"
    }else if (moyenne == 9)
    {
         "Rachat"
    }
    else {
        "Echec"
    }

    println("Le resultat est : $result")
}