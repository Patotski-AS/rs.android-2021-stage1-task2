package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        val str = StringBuffer()
        return when (blockB) {
            String::class -> blockA.filterIsInstance<String>().joinToString(str)
            Int::class -> blockA.filterIsInstance<Int>().sum()
            LocalDate::class ->  blockA.filterIsInstance<LocalDate>()
                .sortedDescending()
                .take(1)
                .map { it.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))}
                .toString().trim('[',']')
            else -> Any()
        }
    }
}
