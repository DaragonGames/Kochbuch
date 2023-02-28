data class Ingredient(val name: String, val optional: Boolean, val amount: Float, val measurementUnit: String) {
    constructor(name: String): this(name, false, 1f, "Portion")
    constructor(name: String, amount: Float): this(name, false, amount, "Portion")
    constructor(name: String, amount: Float, measurementUnit: String): this(name, false, amount, measurementUnit)
    constructor(name: String, optional: Boolean): this(name, optional, 1f, "Portion")
}
