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
    /*print("Введите строку: ")
    val glas = "aeiou"
    val input =  readln().lowercase()
    var count = 0
    for (i in input) {
        if (i in glas){
            count++
        }
    }
    println("В слове $count гласных")*/
    //Задание 3. Обратный отсчёт
    /*print("Введите число: ")
    var N = readln().toInt()
    do {
        println(N)
        N--
    }while (N >= 1)*/
    //Задание 4. Генератор пароля
    val part1 = arrayOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "O", "P", "N", "M", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")
    val part11 = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "o", "p", "n", "m","q", "r", "s", "t", "u", "v", "w", "x", "y", "z")
    val part2 = arrayOf("0","1", "2", "3", "4", "5", "6", "7", "8", "9")
    val part3 = arrayOf("!", "@", "#", "$", "%", "^", "&", "*", "?", ",", ".", ";", ":", "№")
    val nel = Random.nextInt(8,17)
    var res = ""
    for (i in 0 until nel) {
       when(Random.nextInt(4)){
           0 ->res += part1[Random.nextInt(part1.size)]
           1 ->res += part11[Random.nextInt(part11.size)]
           2 ->res += part2[Random.nextInt(part2.size)]
           3 ->res += part3[Random.nextInt(part3.size)]
       }
   }
    println("Пароль: $res")


}
