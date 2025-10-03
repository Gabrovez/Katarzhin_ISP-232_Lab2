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
    /*print("Введите первое число: ")
    val numb1 = readln().toInt()
    print("Введите второе число: ")
    val numb2 = readln().toInt()
    if (numb1 > numb2){
        println("Число $numb1 больше чем $numb2")
    } else{
        println("Число $numb2 больше чем $numb1")
    }
    val max = if (numb1 > numb2) numb1 else numb2
    println("Максимальное число - $max")
    val age = readln().toInt()
    val status = if (age >= 18) "Взрослый" else "Ребёнок"
    println(status)*/
    //magic shield
    print("Введите урон: ")
    val damage = readln().toInt()
    print("Щит активен? (введите да или нет): ")
    val sInput = readln().lowercase()
    val sActive = sInput == "да"
    val finalDamage = if (sActive) {
        damage / 2
    } else {
        damage
    }
    println("Полученный урон: $finalDamage")



}