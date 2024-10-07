package com.example.seminario1pm

fun main(){
    var list = intArrayOf(6,3,6,7,6,8,9,10,7)
    var distancia = 100
    var kiloms = 0.625

    ej1(list)

    ej2(list)

    ej3(distancia)
}

fun ej1(lista: IntArray){
     var aux: Int =0
    for (i in lista){
        if (i>aux) aux=i
    }
    println(aux)
}

fun ej2(lista: IntArray){
    var sumatotal: Int=0
    for (i in lista){
        sumatotal = sumatotal+i
    }
    println(sumatotal)
}


fun ej3(distancia: Int){
    var distanciaKMS: Int=0
    distanciaKMS= distancia*Int(0.625)
    }

fun Int(d: Double): Int {
 return 0
}


