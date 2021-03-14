package one.catLaboratory.catbank

import java.math.BigDecimal

class UberRare(
    name: String,
    counterType: String,
    salario: BigDecimal
): Cat_Enginner(name,counterType,salario) {
    override fun auxilioCatamin() = salario * BigDecimal(0.1)
}