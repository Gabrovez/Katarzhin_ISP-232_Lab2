fun main(){
    println("Начинаем ритуал защиты!")
    repeat(5){index ->
        if (index == 2 ){
            println("Пропускаем шаг ${index + 1} из-за магического вмещательства!")
            return@repeat
        }
        println("Заклинание защиты активировано!(Шаг ${index + 1})")
    }
    println("Замок защищен!")
}