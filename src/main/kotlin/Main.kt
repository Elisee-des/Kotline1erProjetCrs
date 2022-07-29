fun main() {
    val nombres = arrayOf("un", "deux", "trois", "quatre")

    //for (index in nombres.indices)
    //{
      //  println("item a l'indice $index = ${nombres[index]}")
    //}

    //for ((index, value) in nombres.withIndex())
    //{
      //  println("item a l'indice $index = $value")
    //}

    for (index in 0..nombres.lastIndex)
    {
        println("item a l'indice $index = ${nombres[index]}")
    }
}