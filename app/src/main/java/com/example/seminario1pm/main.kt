package com.example.seminario1pm

fun main(){
    var list = intArrayOf(6,3,6,7,6,8,9,10,7)
    var distancia = 100
    var kiloms = 0.625
    var cadena = "reconocer"

    ej1(list)

    ej2(list)

    ej3(distancia)

    ej4(cadena)
println()
    println(ej5("Viva el vino",'i'))

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
    var distanciaKMS: Float=0f
    distanciaKMS= (distancia*0.625).toFloat()
    println(distanciaKMS)
    }

fun Int(d: Double): Int {
 return 0
}

fun ej4(cadena: String){
    val aux = cadena.reversed()

    if (aux.equals(cadena)){
        print("Es un palíndromo")
    }else{
        print("No es un palíndromo")
    }
}

fun ej5(ejercicio5: String, letra: Char):Int{
    var contador = 0
     for(i in 0..ejercicio5.length-1){
         if (ejercicio5[i].equals(letra)){
             contador++
         }
     }
    return contador
}

