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
    ej11(17,145231)
    ej12(123213)  // Ejemplo capicúa

    println(emmetToHTML("div#main.container")) // <div id="main" class="container"></div>
    println(emmetToHTML("p#paragraph.text.bold")) // <p id="paragraph" class="text bold"></p>
    println(emmetToHTML("span.highlight")) // <span class="highlight"></span>
    println(emmetToHTML("header#top")) // <header id="top"></header>


    ej14(5)


    println(karaca("placa", false))
    println(karaca("0c0lpaca", true))

    println(karaca("Este es el penúltimo reto de programación del año", false))
    println(karaca("1ts1aca s1aca l1aca 3m2tlún1paca 3t1raca 1daca nó2c0m0rg3rpaca l1daca 3ñ0aca", true))

    // El algoritmo no soporta estos casos
    println(karaca("1", false))
    println(karaca("1aca ", true))


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

fun ej10(){var enesimo = 0
    var enesimo2 = 1
    var i = 2
    var n = 9

    while (i <= n) {
        val temp = enesimo + enesimo2
        enesimo = enesimo2
        enesimo2 = temp
        i++
    }

    println(enesimo2)
}
fun ej11(num1: Int, num2: Int) {
    var a = num1
    var b = num2

    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }

    if (a == 1) {
        println("$num1 y $num2 son primos relativos.")
    } else {
        println("$num1 y $num2 no son primos relativos.")
    }
}

fun ej12(num: Int) {
    val numStr = num.toString()
    val numReverso = numStr.reversed()

    if (numStr == numReverso) {
        println("$num es capicúa.")
    } else {
        println("$num no es capicúa.")
    }
}
fun emmetToHTML(emmet: String): String {
    var tag = "div" // Valor por defecto si no se especifica una etiqueta
    var id: String? = null
    var className: String? = null

    // Si se especifica una etiqueta (como div, p, span, etc.), se obtiene
    val tagMatch = Regex("^[a-zA-Z]+").find(emmet)
    if (tagMatch != null) {
        tag = tagMatch.value
    }

    // Buscar id si se especifica (después del símbolo #)
    val idMatch = Regex("#[a-zA-Z0-9_-]+").find(emmet)
    if (idMatch != null) {
        id = idMatch.value.substring(1) // Eliminar el símbolo #
    }

    // Buscar clases si se especifican (después del símbolo .)
    val classMatch = Regex("\\.[a-zA-Z0-9_-]+").findAll(emmet)
    if (classMatch != null) {
        className = classMatch.map { it.value.substring(1) }.joinToString(" ") // Eliminar los puntos y unir con espacios
    }

    // Construcción de la etiqueta HTML
    val idAttribute = if (id != null) " id=\"$id\"" else ""
    val classAttribute = if (className != null) " class=\"$className\"" else ""

    return "<$tag$idAttribute$classAttribute></$tag>"
}

fun ej14(num: Int){
    var i = 1
    while (i <= num) {
        var j = 1
        while (j <= i) {
            print("$i ")
            j++
        }
        println()
        i++
    }
}









fun karaca(text: String, isKaraca: Boolean): String {

    var result = ""

    text.lowercase().split(" ").forEach { word ->

        if (isKaraca) {
            result += word
                .dropLast(3)
                .replace("0", "a")
                .replace("1", "e")
                .replace("2", "i")
                .replace("3", "o")
                .replace("4", "u")
                .reversed().plus(" ")
        } else {
            result += word
                .reversed()
                .replace("a", "0")
                .replace("e", "1")
                .replace("i", "2")
                .replace("o", "3")
                .replace("u", "4")
                .plus("aca ")
        }
    }

    return result
}