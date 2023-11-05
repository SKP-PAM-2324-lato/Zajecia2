fun main() {
    wyswietl()
    println("A teraz jest w main")
    val a = 10
    val b = 5
    dodaj(a,b)
    dodaj(b,a)
    dodaj(2, 8)
    //dodaj()
    zadanieZMapy(4)

    print("Podaj podstawę trójkąta: ")
    val podstawa = readln().toDouble()
    print("Podaj wysokosc trójkąta: ")
    val wysokosc = readln().toDouble()
    val pole = poleTrojkata(podstawa, wysokosc)
    println("Pole to $pole")
    println(czyParzysta(5))


}

fun wyswietl(){
    println("Hej jest w funkcji!")
}

fun dodaj(a: Int, b: Int){
    val suma = a+b
    println("$a + $b = $suma")
}

fun zadanieZMapy(n: Int){
    if( n !in 1..3){
        println("Brak zapisu tej liczby")
    }else{
        val liczby = mapOf(1 to "jeden", 2 to "dwa", 3 to "trzy")
        println("$n jest czytane jako ${liczby[n]}")
    }
}

fun poleTrojkata(a: Double, h: Double): Double{
    val pole = 0.5*a*h
   // println("Pole wynosi $pole")
    return pole
}

fun czyParzysta(a: Int): Boolean{
    if(a % 2 == 0){
        return true
    }

    return false

}

