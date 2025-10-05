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
    println("Напишите что-нибудь(для выхода выхода введите 'выход'):")
    while (true){
        val input = readLine()
        if (input == "выход"){
            println("До свидания!")
            break
        }
        println("Вы ввели $input")
    }
}