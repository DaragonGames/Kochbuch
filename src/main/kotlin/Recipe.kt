data class Recipe(
    val name: String,
    val ingredients: MutableList<Ingredient>,
    val tags: MutableList<String> = mutableListOf<String>(),
    val spices: MutableList<String> = mutableListOf<String>(),
    val isSideDish: Boolean = false,
    val needsSideDish: Boolean = false
)
