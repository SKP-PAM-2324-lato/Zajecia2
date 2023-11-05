fun main() {
    val menu = mutableMapOf("kawa" to 10, "ciasto" to 15, "sok" to 11 )
    println(menu)
    println("Cena \"kawy\" wynosi ${menu["kawa"]}")
    println(menu.size)
    println(menu.count())

    menu["herbata"] = 9
    println(menu)

    for (element in menu){
        println(element)
    }

    for(wartosc in menu.values){
        println(wartosc)
    }

    for (klucz in menu.keys){
        //println(klucz)
        println("$klucz kosztuje ${menu[klucz]} zł")
    }

}