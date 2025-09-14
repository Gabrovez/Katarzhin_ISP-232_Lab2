fun main(){
    print("Введите ваш уровень: ")
    val level = readln().toInt()
    print("У вас есть VIP-статус? (true/false): ")
    val hasVIP = readln().toBoolean()
    if ((level >= 30 && hasVIP) || level >= 50) {
        println("Доступ разрешен!")
    } else {
        println("Доступ запрещен!")
    }
}