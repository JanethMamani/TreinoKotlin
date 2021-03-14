package one.catLaboratory.catbank.testes

import one.catLaboratory.catbank.SuperRare
import java.math.BigDecimal

fun main(){
    var kyubey = SuperRare(oNome = "Kyubey",vantagem = "Alien", remuneracao= BigDecimal(80000),mundo = "Madoka Magica")

    mostrarRelatorio(kyubey)
    TesteEnterWorld().Entrando(kyubey)
}