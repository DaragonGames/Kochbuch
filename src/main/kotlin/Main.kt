fun main(args: Array<String>) {
    println("Hello World!")
    addRecipeToSaveData(createRecipe())
}



fun createRecipe():Recipe
{
    var tags = listOf<String>("comfort")
    var spices = listOf<String>("Basilikum", "Oregano", "Agaven Dicksaft", "Paprikapulver", "Salz",
        "Pfeffer", "Gemüsebrühe", "Knoblauch")
    var ingredients = mutableListOf(
        Ingredient("Spaghetti"),
        Ingredient("Käse gerieben"),
        Ingredient("Sojahack"),
        Ingredient("Öl"),
        Ingredient("Mehl"),
        Ingredient("Tomatensoße"),
        Ingredient("Karotte"))
    var recipe = Recipe("Spaghetti Bolognese veggy", ingredients, tags,spices)
    return recipe
}


