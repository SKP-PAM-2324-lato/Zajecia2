fun main() {
    rysujKwadrat(4)
    println()
    rysujKwadrat()
    println()
    rysujProstokat()
    println()
    rysujProstokat(2)
    println()
    rysujProstokat(2,2)
    println()
    rysujProstokat(b=3)
}

fun rysujKwadrat(a: Int = 5){

    for (i in 1..a){
        for(j in 1..a){
            print("* ")
        }
        println()
    }
}

fun rysujProstokat(a: Int = 4, b: Int = 5){
    for (i in 1..a){
        for(j in 1..b){
            print("* ")
        }
        println()
    }
}