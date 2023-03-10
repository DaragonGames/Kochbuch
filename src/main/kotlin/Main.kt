fun main(args: Array<String>) {
    println("Hello World!")
    addRecipeToSaveData(createRecipe())
}



fun createRecipe():Recipe
{
    var ingredients = mutableListOf(
        Ingredient("Spaghetti"),
        Ingredient("Käse gerieben"),
        Ingredient("Sojahack"),
        Ingredient("Tomatensoße"),
        Ingredient("Karotte"))
    var recipe = Recipe("Spaghetti Bolognese veggy", ingredients, listOf("comfort Food"))
    return recipe
}


