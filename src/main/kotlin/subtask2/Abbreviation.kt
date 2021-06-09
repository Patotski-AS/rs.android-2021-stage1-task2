package subtask2

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Abbreviation {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val myDate = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            val formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE ")
            myDate.format(formatter)
        } catch (e: DateTimeException) {
            "Такого дня не существует"
        }
    }

    fun abbreviationFromA(a: String, b: String): String {
        val string = a.toUpperCase().filter { it -> qwerty(it,b)}
        return if(string==b) "YES" else "NO"
    }

    private fun qwerty(x: Char, b: String): Boolean {
        for (y in b){
            if(x==y) {
                return true
            }
        }
        return false
    }
}
