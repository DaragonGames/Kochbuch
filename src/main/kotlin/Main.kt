fun main(args: Array<String>) {
    var usedRecipe:MutableList<Recipe> = queryTool().FindRecipes(readSaveData(), listOf("Kartoffel Salad","Falafel", "Nugget Burger", "Chinese Noodles", "Nudelsalad"))
    for (ing in queryTool().CombineRecipesIngredients(usedRecipe)) {
        if (!ing.optional)
        {
            ing.print()
        }
    }
}



fun createRecipe():Recipe
{
    var tags = mutableListOf<String>()
    var spices = mutableListOf<String>("Gemüsebrühe", "Petersilie", "Dill",
        "Agaven Dicksaft", "Salz", "Pfeffer", "Senf", )
    var ingredients = mutableListOf(
        Ingredient("Kartoffel"),
        Ingredient("Mandel Joghurt"),
        Ingredient("Veggy Majo", true),
        Ingredient("Essiggrurken", true)
        )
    var recipe = Recipe("Kartoffel Salad", ingredients, tags,spices,true,false)
    return recipe
}


