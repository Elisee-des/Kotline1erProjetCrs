import java.util.*

fun main() {

   // print("Entrer votre  nom: ")
    //var nom = readLine()

    //print("Entrer votre  age: ")
    //var age = readLine()?.toInt()

    //println("votre nom est :$nom")
    //println("votre ager est :$age")

    var console = Scanner(System.`in`)
    print("Entrer votre  nom: ")
    var nom = console.nextLine()

    print("Entrer votre  age: ")
    var age = console.nextInt()

    println("votre nom est :$nom")
    println("votre ager est :$age")
}


