import java.util.*

fun main() {

   val tab = arrayOf(12, 23, 30, -2, 34, 10, -9)

    var min = tab[0]
    for (item in tab)
    {
        if (item < min)
        {
            min = item
        }
    }

    println(min)
}


