package one.catLaboratory.catbank.testes


import one.catLaboratory.catbank.Cat_Enginner
import one.catLaboratory.catbank.UberRare
import java.math.BigDecimal

fun main(){
    var Gamatoto = UberRare(name = "Gamatoto Helper", counterType = "No tribute", salario = BigDecimal(10000))

    mostrarRelatorio(Gamatoto)
}

    fun mostrarRelatorio(enginner: Cat_Enginner) = println(enginner.toString())
