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
    esprimo(0)
    ej9(32,40)
    ej10()
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

fun esprimo(num: Int) {
    val num = 37
    var i = 2
    var flag = false
    while (i <= num / 2) {
        // condition for nonprime number
        if (num % i == 0) {
            flag = true
            break
        }
        ++i
    }

    if (!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}

fun ej9(num1: Int, num2: Int) {
    var mcd = 0
    var i = if (num1 < num2) num1 else num2

    while (i > 0) {
        if (num1 % i == 0 && num2 % i == 0) {
            mcd = i
            break
        }
        i--
    }

    println("El máximo común divisor de $num1 y $num2 es $mcd")
}

fun ej10(){
    var enesimo = 0
    var enesimo2 = 1
    var i = 2
    while (i<=9){
        enesimo2 = enesimo + enesimo2
        i++
    }
    println(enesimo)
}