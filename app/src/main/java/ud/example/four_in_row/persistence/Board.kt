package ud.example.four_in_row.persistence

data class Board(
    val id: String = "",
    val rows: Int = 6,  // Tamaño estándar para 4 en raya: 6 filas x 7 columnas
    val columns: Int = 7,
    val players: List<Player> = emptyList(),
    val grid: List<Casilla> = emptyList(),
    val state: Boolean = false, // Indica si el juego ha comenzado
    val currentPlayerIndex: Int = 1, // Índice del jugador actual
    val gameStatus: String = "waiting", // waiting, playing, finished
    val winner: String? = null // Email del ganador (si lo hay)
)