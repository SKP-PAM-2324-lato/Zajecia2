fun main() {
    val owoce = setOf("jabłko", "banan", "wiśnia", "wiśnia")
    println(owoce)
    println(owoce.size)

    val owoceMut = mutableSetOf("jabłko", "banan", "wiśnia", "wiśnia")
    owoceMut.add("banan")
    println(owoceMut)

    val numerki = listOf(1,2,5,2,1,5,7,3)
    val numerkiUnikatowe = mutableSetOf<Int>()
    for (numer in numerki){
        numerkiUnikatowe.add(numer)
    }
    val zbior = numerki.toSet()
    println("Numery $numerki \n Unikaty $numerkiUnikatowe")
    println("Numery $numerki \n Unikaty $zbior")



}
