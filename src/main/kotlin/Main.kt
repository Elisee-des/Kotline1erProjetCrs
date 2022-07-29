fun main() {
    aficheBienvenu(num2 = 30, num1 = 23, age = 30)
    var somme = {num1: Int, num2: Int -> num1 + num2}
    println("La somme est ${somme(10, 30)}")
}

fun  aficheBienvenu(num1: Int, num2: Int, age: Int)
{
    println("le deuxiemme nombre est: $num1 et le premier est $num2 $age ans")

}

