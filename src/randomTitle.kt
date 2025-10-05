fun main() {
    val part1 = arrayOf("Опытный", "Безумный", "Легендарный", "Скрытый", "Гигачад")
    val part2 = arrayOf("стрелок", "геймер", "воин", "волшебник", "трейдер")
    val part3 = arrayOf("из CSGO", "на максималках", "из будущего", "в бане у Габена", "с проклятым лутом")
    val  r1 = (Math.random() * part1.size).toInt()
    val  r2 = (Math.random() * part2.size).toInt()
    val  r3 = (Math.random() * part3.size).toInt()
    val phrase = "${part1[r1]} ${part2[r2]} ${part3[r3]}"
    println("Ваш титул: $phrase")
}