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
    /*val daysInMonth = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    print("Введите номер месяца (1-12): ")
    val input = readln().toInt()
    if (input in 1..12){
        val days = daysInMonth[input -1]
        println("В этом месяце $days дней.")
    } else {
        println("Некорректный ввод месяца.")
    }*/
    //Шаг 9. Символьный тип данных
    val lowerCaseLetter: Char = 'a'
    val upperCaseLetter: Char = 'Q'
    val number: Char = '1'
    val space: Char = ' '
    val dollar: Char = '$'
    val ch = '\u0040'
    println(ch)
    val ch1 = 'a'
    println(ch1.code)
    val num = 97
    println(num.toChar())
    val ch2 = readln().first()
    val cha1 = 'b'
    val cha2 = cha1 + 1
    val cha3 = cha1 - 2
    //val hc = 1 + ch1
    //val charsum = 'a' + 'b'
    var arch = 'A'
    arch += 10
    println(arch)
    println(++arch)
    println(++arch)
    println(--arch)
    println('a' < 'c')
    println('x' >= 'z')
    println('D' == 'D')
    println('Q' != 'q')
    println('A' < 'a')
    val one = '1'
    val isDigit = one.isDigit()
    val isLetter = one.isLetter()
    val capital = 'A'
    val small = 'e'
    val isLetterOrDigit = capital.isLetterOrDigit()
    val isUpperCase = capital.isUpperCase()
    val isLowerCase = capital.isLowerCase()
    val capitalEString = small.uppercase()
    val capitale = small.uppercaseChar()



}