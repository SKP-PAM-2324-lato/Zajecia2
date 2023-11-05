fun main() {
    //Napisz mapę, która zawiera zapis słowny liczb 1, 2, 3. Wykorzystaj ją w przykładzie
    val liczby = mapOf(1 to "jeden", 2 to "dwa", 3 to "trzy")
    for(n in liczby.keys){
        println("$n jest czytane jako ${liczby[n]}")
    }

}