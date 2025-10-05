fun main() {
    var number = 0
    while (number < 10){
        number++
        if (number == 3){
            println("Останавливаемся на $number")
            continue
        }
        println(number)
    }
}