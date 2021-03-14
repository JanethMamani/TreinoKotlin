package one.catLaboratory.catbank.testes

import one.catLaboratory.catbank.CatBase

fun main(){
    val CatBaseNormal = CatBase("Cat Base", "Uber Rare", "Lesser",10)//Se estar nomeado, pode mudar os parametros de ordem

    println(CatBaseNormal.nome)
    println(CatBaseNormal.level)

    val ThunderBase = CatBase("Thunderbolt","Uber Rare","Raio Enigma",20)

    ThunderBase.info()
}