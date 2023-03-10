data class Ingredient(
    val name: String,
    val optional: Boolean = false,
    val amount: Float = 1f,
    val measurementUnit: String = "Portion"
)
