fun main(args: Array<String>) {
  /*
  * Listy – odpowiednik tablic
  * Sets – zbiory
  * Maps – mapy, tablice asocjacyjnymi
   */

    val ksztalty = listOf("trójkąt", "kwadrat", "koło")
    println(ksztalty)
    println(ksztalty[0])
    println(ksztalty[1])
    println(ksztalty[2])
    //println(ksztalty[3])

    for (ksztalt in ksztalty){
        print("$ksztalt ")
    }
    println()
    for(i in ksztalty.indices){
        println("$i ${ksztalty[i]}")
    }
}