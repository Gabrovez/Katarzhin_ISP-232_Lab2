fun main(){
    /*print("Введите ваш уровень: ")
    val level = readln().toInt()
    print("У вас есть VIP-статус? (true/false): ")
    val hasVIP = readln().toBoolean()
    if ((level >= 30 && hasVIP) || level >= 50) {
        println("Доступ разрешен!")
    } else {
        println("Доступ запрещен!")
    }*/
    print("Введите первое число: ")
    val numb1 = readln().toInt()
    print("Введите второе число: ")
    val numb2 = readln().toInt()
    if (numb1 > numb2){
        println("Число $numb1 больше чем $numb2")
    } else{
        println("Число $numb2 больше чем $numb1")
    }

}