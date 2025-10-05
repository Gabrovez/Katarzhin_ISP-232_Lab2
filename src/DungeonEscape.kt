fun main(){
    var level = 0
    while (level < 5){
        println("\nВы на уровне $level.")
        println("Выберите действие: [1] Вперёд | [2] Осмотреться | [0] Сдаться")
        val input = readLine()
        when (input){
            "1" -> {
                level++
                println("Вы переходите на уровень $level")
            }
            "2" -> {
                println("Вы осматриваетесь. Тут ничего интересного")
                continue
            }
            "0" -> {
                println("Вы сдались. Игра окончена")
                break
            }
            else -> {
                println("Введите 1 из предложенных вариантов")
            }
        }
        if (level == 5 ){
            println("Поздравляем, вы прошли!")
        }
    }
}