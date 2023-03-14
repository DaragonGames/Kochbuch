data class Ingredient(
    val name: String,
    var optional: Boolean = false,
    var amount: Float = 1f,
    val measurementUnit: String = "Portion"
)
{
    fun print()
    {
        val amountInt:Int =amount.toInt()
        println(name+ " " +amountInt)
    }
}
