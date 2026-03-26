fun main() {
    val secret = "123"
    var vvod: String

    do {
        println("Введите пароль: ")
        vvod = readln()

        if (vvod != secret) {
            println("Неверно!")
        }
    } while (vvod != secret)

    println("Верно!")
}