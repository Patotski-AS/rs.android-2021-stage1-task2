package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val myDate = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            val formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE")
            myDate.format(formatter)
        } catch (e: DateTimeException) {
            "Такого дня не существует"
        }
    }
}
