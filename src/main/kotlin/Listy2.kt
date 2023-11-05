fun main() {

    val ksztalty = mutableListOf("trójkąt", "kwadrat", "koło")
    ksztalty[1] = "prostokat"
    ksztalty.add("kwadrat")
    // ksztalty.add(5)
    ksztalty.add("5")
    println(ksztalty)

    // wczytaj do listy 5 liczb całkowitych podanych przez użytkownika
   // val liczby: MutableList<Int> = mutableListOf()
    val liczby = mutableListOf<Int>()
    println("Podaj 5 liczb")
    for (i in 0..4){
        val liczba = readln().toInt()
        liczby.add(liczba)
    }

    println(liczby)

    // oblicz sumę liczb w liście liczby
    var suma = 0
    for (liczba in liczby){
        suma += liczba
    }
    println("Suma to $suma")
    val srednia: Double = suma.toDouble()/liczby.size
    println("Srednia to $srednia")

    val suma2 = liczby.sum()
    println("Suma inaczej $suma2")

    // znajdź maksimum w tej liście
    var max = liczby[0]
    for (liczba in liczby){
        if(liczba>max){
            max = liczba
        }
    }
    println("Największy znaleziony element to: $max")
    println("Największy znaleziony element to: ${liczby.max()}")

    // znajdź maksimum w tej liście
    var min = liczby[0]
    for (liczba in liczby){
        if(liczba<min){
            min = liczba
        }
    }
    println("Największy znaleziony element to: $min")
    println("Największy znaleziony element to: ${liczby.min()}")

    if( 7 in liczby){
        println("7 jest w liście")
    }

    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val sumaElementow = redNumbers.size + greenNumbers.size

    val numbers = greenNumbers+redNumbers
    val lista = listOf(greenNumbers, redNumbers)
    println(lista)
    println("$sumaElementow ${numbers.size}")
}