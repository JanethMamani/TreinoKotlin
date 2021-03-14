package one.catLaboratory.catbank

class Rare(
    nome: String,
    vantagem: String,
    var nivel: Int,
    val alcance: CatInformation,
    val world: String): Cat(nome,vantagem),EnterWorld{
    override fun enterW(): Boolean = "Cat Empire" == world

    override fun toString(): String = """
        Nome: $name
        Vantagem: $counterType
        Level: $nivel
        Alcance: ${alcance.descricao}
    """
}