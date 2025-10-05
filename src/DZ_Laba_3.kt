import kotlin.random.Random
fun main(){
    // Задание 1. Угадай число
    /*val target = Random.nextInt(1,50)
    print("Угадайте число (от 1 до 50): ")
    while(true) {
        print("Введи число: ")
        val input = readln().toInt()
        when {
            input < target -> println("Загаданное число больше")
            input > target -> println("Загаданное число меньше")
            else -> {
                println("Поздравляю! Ты угадал число: $target")
                break
            }
        }
    }*/
    //Задание 2. Счётчик гласных
    print("Введите строку: ")
    val glas = "aeiou"
    val input =  readln().lowercase()
    var count = 0
    for (i in input) {
        if (i in glas){
            count++
        }
    }
    println("В слове $count гласных")
}
