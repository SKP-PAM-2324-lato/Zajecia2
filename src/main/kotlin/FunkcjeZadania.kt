fun main() {
    println("wprowadz 3 boki trojkata:")
    var a = readln().toInt()
    var b = readln().toInt()
    var c = readln().toInt()
    var result = trojkat(a,b,c)

    println("Czy mozna ułozyć trojkat - $result")

    println(ciekawaFunkcja(2, 3))
    println(ciekawaFunkcja(2, 0))
}

fun trojkat(a: Int, b: Int, c: Int): Boolean {
    /*
    if ((a + b > c) && (a + c > b) && (c+b>a)){
        return true
    }else{
        return false
    } */
    return (a + b > c) && (a + c > b) && (c+b>a)
}

fun ciekawaFunkcja(a: Int, b:Int): Boolean{
    return b !=0 && a/b > 1
}