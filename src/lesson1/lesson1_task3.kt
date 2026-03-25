package lesson1

fun main() {
    val totalPrice = 125

    val minutes = totalPrice / 60
    val seconds = totalPrice % 60

    println("Прошло минут: $minutes, секунд: $seconds")
}