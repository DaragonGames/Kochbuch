import com.google.gson.Gson
import java.io.File
fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
    write();
}

fun read()
{
    val jsonString: String = File("./src/main/resources/SaveFile.json").readText(Charsets.UTF_8)
    val gson:Gson = Gson();
    val reviews: List<Recipe> = gson.fromJson(jsonString, SaveData::class.java).recipes;
    println(jsonString)
    println(reviews[0])

}

fun tempData():SaveData
{
    var ingredients = mutableListOf(Ingredient("Spaghetti"), Ingredient("Käse gerieben"),
        Ingredient("Sojahack"), Ingredient("Tomatensoße"), Ingredient("Karotte"))
    var recipe = Recipe("Spaghetti Bolognese veggy", ingredients, listOf("comfort"))
    val data: SaveData = SaveData(listOf(recipe))
    return data
}

fun write()
{
    val data = tempData()
    val it = Gson().toJson(data)
    File("./src/main/resources/SaveFile.json").writeText(it,Charsets.UTF_8)
}