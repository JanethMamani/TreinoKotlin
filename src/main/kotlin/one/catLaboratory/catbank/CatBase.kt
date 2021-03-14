package one.catLaboratory.catbank

data class CatBase (
    val nome: String,
    val group: String,
    var style: String,
    var level: Int
) {
    fun info() = println("$nome com personalização $style")
}