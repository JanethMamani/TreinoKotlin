package one.catLaboratory.catbank.testes
import one.catLaboratory.catbank.CatInformation

fun main() {
    CatInformation.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }
    CatInformation.values().forEach {
        println("${it.name} - ${it.descricao}")
    }
    val LongRangeCat = CatInformation.LongRange
    println("${LongRangeCat.name} é um ${LongRangeCat.descricao}")

    val LessRangeCat = CatInformation.LessRange
    println("${LessRangeCat.name} é um ${LessRangeCat.descricao}")
}