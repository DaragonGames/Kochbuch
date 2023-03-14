fun main(args: Array<String>) {
    println("Hello World!")
    addSideDishToSaveData(createRecipe())
}



fun createRecipe():Recipe
{
    var tags = listOf<String>()
    var spices = listOf<String>("Gemüsebrühe", "Petersilie", "Dill",
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


