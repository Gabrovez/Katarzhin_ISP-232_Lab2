fun main() {
    /*var number = 0
    while (number < 10){
        number++
        if (number == 3){
            println("Останавливаемся на $number")
            continue
        }
        println(number)
    }*/
    /*println("Напишите что-нибудь(для выхода выхода введите 'выход'):")
    while (true){
        val input = readLine()
        if (input == "выход"){
            println("До свидания!")
            break
        }
        println("Вы ввели $input")
    }*/
    /*var letter = 'A'
    while (letter <= 'Z'){
        print(letter)
        letter++
    }*/
  /*  var number: Int
    do {
        print("Введите число больше 10: ")
        number = readln().toInt()
    }while (number < 10)
    println("Вы ввели $number.")*/
    /*var password: String?
    do{
        print("Введите пароль: ")
        password = readln()
    } while (password != "qwerty")
    print("Доступ разрешён")*/
    /*for (i in 1.. 5){
        println("Шаг $i")
    }
    val fruits = listOf("apple", "banana", "cherry")
    for (fruit in fruits){
        println("Фрукт: $fruit")
    }*/
    print("Введите числа через пробел: ")
    val input = readln()
    val numbers = input.split(" ")
    var sum = 0
    for (number in numbers) {
        sum += number.toInt()
    }
    println("Сумма чисел равна: $sum")

}