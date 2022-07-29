fun main() {

    var num = 0
    println("Resultat avec do")
    while (num > 0)
    {
        println("num = $num")
        num--

    }

    println("Resultat avec do..while")
    do
    {
        println("num = $num")
        num--

    }while (num > 0)
}