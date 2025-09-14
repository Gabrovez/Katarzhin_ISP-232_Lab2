fun main(){
    /*val numbers = 1..100
    val symbol = 'a'..'z'
    print("Введите ваш уровень:")
    val level = readln().toInt()
    if (level in 1.. 50) {
        println("Уровень $level соответствует требованиям! Вы можете зайти в данж!")
    }else {
        println("Высокий уровень! Вход запрещён!")
    }*/
    println("Диапазон символов от 'z' до 'a':")
    val cr = 'z' downTo 'a'
    for (c in cr) {
        print("$c ")
    }
    println("\nДиапазон от 5 до 11 (не включая 11):")
    val nu = 5 until 11
    for (n in nu) {
        print("$n ")
    }
    println("\nДиапазон от 10 до 50 с шагом 3:")
    val ns = 10..50 step 3
    for (n in ns) {
        print("$n ")
    }
}