package ru.netology

fun main() {
    val second = 3500

    val result = agoToText(second)

    println("был(а) " + result)
}

fun agoToText(second : Int) : String {
    return when (second) {
        in 0..60 -> return "только что"
        in 61..3600 -> {
            val min : String = (second / 60).toString()
            min + toMin(min) + " назад"
        }
        in 3601..86400 -> {
            val hour : String = (second / 3600).toString()
            hour + toHour(hour) + " назад"
        }
        in 86401.. 172800 -> "вчера"
        in 172801..259200 -> "позавчера"
        else -> "давно"
    }
}

fun toHour(hour : String): String {
    return when(hour) {
        "1", "21",  -> " час"
        "2", "3", "4", "22", "23" -> " часа"
        else -> { " часов"}
    }
}

fun toMin(min : String) : String{
    return when(min) {
        "1", "21", "31", "41", "51"  -> " минуту"
        "2", "3", "4", "22", "23", "24", "32", "33", "34", "42", "43", "44", "52", "53", "54" -> " минуты"
        else -> { " минут"}
    }
}