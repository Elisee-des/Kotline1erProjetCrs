fun main() {
    var tab = intArrayOf(29,29,10,20)
    var tab1 = Array(10){0}
    var tab2 = arrayOf<String>("un", "deux", "trois")

    for((index, num) in tab.withIndex())
    {
        println("index=$index et num=$num")
    }

    tab[2] = 20
    print(tab[2])
}


