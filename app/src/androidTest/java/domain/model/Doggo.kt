package domain.model

data class Doggo (
    val id: String,
    val name: String,
    val race: String,
    val gender: String,
    val vaccinated: Boolean,
    val adopted: Boolean,
    val photo: String
)