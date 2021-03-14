package one.catLaboratory.catbank.testes

import one.catLaboratory.catbank.CatInformation
import one.catLaboratory.catbank.Rare

fun main() {
    var ramen = Rare(nome = "Ramen Cat",
        vantagem = "Angel",
        nivel = 40,
        alcance = CatInformation.LessRange,
        world = "Cat Empire")

    println(ramen)

    TesteEnterWorld().Entrando(ramen)
}