data class Recipe(
    val name: String,
    val ingredients: List<Ingredient>,
    val tags: List<String> = mutableListOf<String>(),
    val isSideDish: Boolean = false,
    val needsSideDish: Boolean = false
)
