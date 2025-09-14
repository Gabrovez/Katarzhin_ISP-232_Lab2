fun main(){
    //Задание 1
    /*print("Введите ваш уровень: ")
    val level = readln().toInt()
    if (level <10){
        println("Новичок! Вы получаете +10 HP.")
    }else if (level < 50){
        println("Опытный! Вы получаете +30 HP.")
    }else {
        println("Легенда! Вы получаете +100 HP.")
    }*/
    //Задание 2
    /*print("Введите ваш возраст: ")
    val level = readln().toInt()
    if (level <12){
        println("Вы ребёнок")
    }else if (level < 17){
        println("Вы подросток")
    }else {
        println("Вы взрослый")
    }*/
    //Задание 3
    print("Введите число от 1 до 100: ")
    val n = readln().toInt()
    if (n in 10..50) {
        println("Число $n входит в диапазон от 10 до 50 включительно")
    } else {
        println("Число $n не входит в диапазон от 10 до 50 включительно")
    }
}