import kotlin.random.Random
fun main() {
    val target = Random.nextInt(1,100)
    println("Угадай число от 1 до 100")
    while (true){
        print("Введи число: ")
        val  input = readln().toInt()
        when{
            input < target -> println("Загаданное число больше")
            input > target -> println("Загаданное число меньше")
            else -> {
                println("Поздравляю! Ты угадал число: $target")
                break
            }

        }
    }
}