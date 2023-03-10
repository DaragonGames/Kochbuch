import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

data class SaveData(val recipes: MutableList<Recipe>)

fun readSaveData(path: String = "./src/main/resources/SaveFile.json"):SaveData
{
    val jsonString: String = File(path).readText(Charsets.UTF_8)
    return Gson().fromJson(jsonString, SaveData::class.java)
}

fun writeSaveData(
    data: SaveData,
    path: String = "./src/main/resources/SaveFile.json"
)
{
    val gson = GsonBuilder().setPrettyPrinting().create()
    val jsonString = gson.toJson(data)
    File(path).writeText(jsonString,Charsets.UTF_8)
}
fun addRecipeToSaveData(recipe: Recipe)
{
    val data = readSaveData()
    data.recipes.add(recipe)
    writeSaveData(data)
}