package ud.example.four_in_row.persistence

data class Pregunta(
    val pregunta: String = "",
    val opciones: List<String> = emptyList(),
    val respuesta: Int = -1
)
