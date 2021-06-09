package subtask2

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val string = a.toUpperCase().filter { qwerty(it,b)}
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
