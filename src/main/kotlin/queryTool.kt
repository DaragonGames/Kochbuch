class queryTool {

    fun FindRecipe(data: SaveData, searchTerm: String):Recipe?
    {
        val recipes = data.recipes
        for (recipe in recipes)
        {
            if (recipe.name==searchTerm)
            {
                return recipe
            }
        }
        return null
    }

    fun FindRecipes(data: SaveData, searchTerms: List<String>):MutableList<Recipe>
    {
        var output = mutableListOf<Recipe>()
        for (term in searchTerms)
        {
            FindRecipe(data,term)?.let { output.add(it) }
        }
        return output
    }

    fun CombineIngredientList(result: MutableList<Ingredient>, addition: MutableList<Ingredient>):MutableList<Ingredient>
    {
        for (ingredient in addition)
        {
            if (doesListContainIngredient(result,ingredient))
            {
                for (ing in result)
                {
                    if (ing.name == ingredient.name)
                    {
                        ing.amount += ingredient.amount
                        if (!ingredient.optional)
                        {
                            ing.optional = false;
                        }
                    }
                }
            }
            else
            {
                result.add(ingredient)
            }
        }
        return result
    }

    fun doesListContainIngredient(list: MutableList<Ingredient>, ingredient: Ingredient):Boolean
    {
        for (ing in list)
        {
            if (ingredient.name == ing.name && ingredient.measurementUnit == ing.measurementUnit)
            {
                return true
            }
        }
        return false
    }

    fun CombineRecipesIngredients(recipes: MutableList<Recipe>):MutableList<Ingredient>
    {
        var result = mutableListOf<Ingredient>()
        for (recipe in recipes)
        {
            result = CombineIngredientList(result,recipe.ingredients)
        }
        return result
    }


}