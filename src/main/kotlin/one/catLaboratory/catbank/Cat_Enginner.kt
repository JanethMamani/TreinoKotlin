package one.catLaboratory.catbank

import java.math.BigDecimal

abstract class Cat_Enginner(
    name: String, //override val e em Cat, open na propriedade
    counterType: String,
    var salario: BigDecimal
): Cat(name,counterType) {
    //Herda caracteristica de pessoa

    protected abstract fun auxilioCatamin(): BigDecimal

    override fun toString(): String = """
        Nome: $name,
        Tipo em vantagem: $counterType
        CatFood obtido: $salario
        Catamins: ${auxilioCatamin()}
        """
}