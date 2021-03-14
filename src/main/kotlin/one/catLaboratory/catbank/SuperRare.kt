package one.catLaboratory.catbank

import java.math.BigDecimal

class SuperRare(
    oNome:String,
    vantagem:String,
    remuneracao: BigDecimal,
    var mundo: String): Cat_Enginner(
    name = oNome,
    counterType = vantagem,
    salario = remuneracao), EnterWorld {
    override fun auxilioCatamin(): BigDecimal = salario*BigDecimal(0.4)
    override fun enterW(): Boolean = "Madoka Magica" == mundo
}