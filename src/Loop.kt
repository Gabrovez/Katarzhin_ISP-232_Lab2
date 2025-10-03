fun main(){
    /*println("Начинаем ритуал защиты!")
    repeat(5){index ->
        if (index == 2 ){
            println("Пропускаем шаг ${index + 1} из-за магического вмещательства!")
            return@repeat
        }
        println("Заклинание защиты активировано!(Шаг ${index + 1})")
    }
    println("Замок защищен!")*/
    /*val months = listOf("Python", "Kotlin", "C#", "C++", "Java")
    println(months[0])
    println(months.size)
    println("Kotlin" in months)*/
    val daysInMonth = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    print("Введите номер месяца (1-12): ")
    val input = readln().toInt()
    if (input in 1..12){
        val days = daysInMonth[input -1]
        println("В этом месяце $days дней.")
    } else {
        println("Некорректный ввод месяца.")
    }



}