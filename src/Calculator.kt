fun main() {
    print("Введите первое число, знак операции и второе число через пробел: ")
    val input = readln().split(" ")
    val symbol = input[1]
    val fnum = input[0].toDouble()
    val snum = input[2].toDouble()
    var res = 0.0
    when (symbol){
        "/" -> res = fnum / snum
        "*" -> res = fnum * snum
        "+" -> res = fnum + snum
        "-" -> res = fnum - snum
        else -> println("Некорректный ввод")
    }
    println("$fnum $symbol $snum = $res ")
}