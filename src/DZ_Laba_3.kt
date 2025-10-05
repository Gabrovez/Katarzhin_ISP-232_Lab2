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
    /*val part1 = arrayOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "O", "P", "N", "M", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")
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
    println("Пароль: $res")*/
    //Задание 5. Мини-опроc
    /*print("Введите ваше имя: ")
    val na = readln()
    print("Введите ваш возраст: ")
    val age = readln().toInt()
    print("Введите вашу любимую игру: ")
    val fg = readln()
    print("Введите ваше любимое время года: ")
    val seas = readln()
    val otziv = listOf("Хорош", "Ты крутой!", "Хорошая работа!", "Критунал")
    println(na)
    println(age)
    println(fg)
    println(seas)
    val  r = (Math.random() * otziv.size).toInt()
    val phrase = otziv[r]
    print(phrase)*/
    //Задание 6. Сумма чисел
    /*print("Введите число: ")
    val N = readln().toInt()
    var count = 0
    for (i in 1..N){
        count += i
    }
    println("Сумма от 1 до вашего числа равна: $count")*/
    //Задание 7. Кубик D6
    /*var amount = 0
    var count = 1
    while (count <= 10){
        count++
        amount += Random.nextInt(1,7)
    }
    print("Ваш огненный шар 5-го уровня нанёс: $amount")*/
    //Задание 8. Слот-машина
    /*val d1 = Random.nextInt(0,6)
    val d2 = Random.nextInt(0,6)
    val d3 = Random.nextInt(0,6)
    println ("$d1 $d2 $d3")
    if(d1 == d2){
        if(d2 == d3) {
            println("Джекпот!")
        }
    }*/
    //Задание 9. Банковский счёт
    var sch = Random.nextInt(100,1001)
    println(sch)
    while (sch > 0){
        sch -= Random.nextInt(10,101)
        println(sch)
    }
    //
}
