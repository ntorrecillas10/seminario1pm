package com.example.seminario1pm
import kotlin.math.pow

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

    ej9(32,40)

    ej10()

    ej11(17,145231)

    ej12(123213)  // Ejemplo capicúa

    println(emmetToHTML("div#main.container")) // <div id="main" class="container"></div>
    println(emmetToHTML("p#paragraph.text.bold")) // <p id="paragraph" class="text bold"></p>
    println(emmetToHTML("span.highlight")) // <span class="highlight"></span>
    println(emmetToHTML("header#top")) // <header id="top"></header>

    ej14(5)

    /*ej15()*/

    println("El producto de los elementos es: ${ej16()}")

    println(ej17())

    esprimo(0)

    ej19("Esta es una cadena de ejemplo")

    ej20(5)

    ej21("Hola")

    ej22(28)

    ej23(158)

    val matriz = listOf(
        listOf(3, 8, 15),
        listOf(2, 7, 1),
        listOf(10, 5, 12)
    )
    ej24(matriz)

    ej25(matriz)

    ej26()

    ej27()

    ej28("Hola Mundo")

    ej29("amor","roma")

    ej30(10)

    ej31()

    ej32()

    ej33()

    println(ej34("placa", false))
    println(ej34("0c0lpaca", true))
    println(ej34("Este es el penúltimo reto de programación del año", false))
    println(ej34("1ts1aca s1aca l1aca 3m2tlún1paca 3t1raca 1daca nó2c0m0rg3rpaca l1daca 3ñ0aca", true))
    println(ej34("1", false))
    println(ej34("1aca ", true))

    ej35()


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

/*ej15*/


fun ej16(): Int {
    val lista = listOf(1, 2, 3, 4, 5)
    var producto = 1
    for (numero in lista) {
        producto *= numero
    }
    return producto
}

fun ej17(): List<Int> {
    val lista = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    return lista.filter { it % 2 == 0 }
}

fun esprimo(num: Int) {
    val num = 37
    var i = 2
    var flag = false
    while (i <= num / 2) {
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

fun ej19(cadena: String) {
    val vocales = "aeiouAEIOU"
    val resultado = cadena.filter { it !in vocales }
    println("Cadena sin vocales: $resultado")
}
fun ej20(num: Int) {
    var resultado: Long = 1
    for (i in 1..num) {
        resultado *= i
    }
    println("El factorial de $num es: $resultado")
}
fun ej21(cadena: String) {
    val textoInvertido = cadena.reversed()
    println("$textoInvertido")
}
fun ej22(num: Int) {
    var sumaDivisores = 0

    for (i in 1 until num) {
        if (num % i == 0) {
            sumaDivisores += i
        }
    }

    if (sumaDivisores == num) {
        println("$num es un número perfecto.")
    } else {
        println("$num no es un número perfecto.")
    }
}

fun ej23(num: Int) {
    val digitos = num.toString().length
    var suma = 0
    var temp = num

    while (temp > 0) {
        val digito = temp % 10
        suma += digito.toDouble().pow(digitos).toInt()
        temp /= 10
    }

    if (suma == num) {
        println("$num es un número Armstrong.")
    } else {
        println("$num no es un número Armstrong.")
    }
}
fun ej24(matriz: List<List<Int>>) {

    var maximo = Int.MIN_VALUE

    for (fila in matriz) {
        for (elemento in fila) {
            if (elemento > maximo) {
                maximo = elemento
            }
        }
    }

    println("El número más grande en la matriz es: $maximo")
}
fun ej25(matriz: List<List<Int>>) {
    var minimo = Int.MAX_VALUE

    for (fila in matriz) {
        for (elemento in fila) {
            if (elemento < minimo) {
                minimo = elemento
            }
        }
    }

    println("El número más pequeño en la matriz es: $minimo")
}
fun ej26() {
    val palabras = listOf("perro", "gato", "elefante", "jirafa", "hipopotamo")
    var masLarga = ""

    for (palabra in palabras) {
        if (palabra.length > masLarga.length) {
            masLarga = palabra
        }
    }

    println("La palabra más larga es: $masLarga")
}
fun ej27() {
    val palabras = listOf("perro", "gato", "elefante", "jirafa", "hipopotamo")
    var masCorta = palabras.get(0)

    for (palabra in palabras) {
        if ( masCorta.length > palabra.length) {
            masCorta = palabra
        }
    }

    println("La palabra más larga es: $masCorta")
}
fun ej28(cadena: String) {
    val esValido = cadena.all { it.isLetter() || it.isWhitespace() }  // Verificamos que todos los caracteres sean letras o espacios

    if (esValido) {
        println("La cadena contiene solo caracteres alfabéticos y espacios en blanco.")
    } else {
        println("La cadena contiene caracteres no válidos.")
    }
}
fun ej29(cadena1: String, cadena2: String) {
    val sonAnagramas = cadena1.toList().sorted() == cadena2.toList().sorted()  // Comparamos las letras ordenadas de ambas cadenas

    if (sonAnagramas) {
        println("$cadena1 es un anagrama de $cadena2.")
    } else {
        println("$cadena1 no es un anagrama de $cadena2.")
    }
}
fun ej30(num: Int) {
    var n = 0
    var triangular = 0

    while (triangular < num) {
        n++
        triangular = (n * (n + 1)) / 2
    }

    if (triangular == num) {
        println("$num es un número triangular.")
    } else {
        println("$num no es un número triangular.")
    }
}

fun ej31() {
    val listaOriginal = listOf(1, 2, 3, 4)  // Lista de números
    val listaDuplicada = listaOriginal.map { it * 2 }  // Duplicamos cada número

    println("Lista duplicada: $listaDuplicada")
}

fun ej32() {
    val claves = listOf("nombre", "edad", "ciudad")  // Lista de claves
    val valores = listOf("Juan", 30, "Madrid")  // Lista de valores

    val diccionario = claves.zip(valores).toMap()

    println("Diccionario creado: $diccionario")
}

fun ej33() {
    val numeroDecimal = 10
    var numero = numeroDecimal
    var binario = ""

    if (numero == 0) {
        binario = "0"
    } else {
        while (numero > 0) {
            binario = (numero % 2).toString() + binario
            numero /= 2
        }
    }

    println("El número $numeroDecimal en binario es: $binario")
}


fun ej34(text: String, isKaraca: Boolean): String {

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

fun ej35() {
    val numeros = mutableListOf(2, 4, 6, 8, 9)  // Matriz de números
    val orden = "Asc"  // O "Desc" para orden descendente

    // Implementación del algoritmo de ordenamiento (Burbuja)
    for (i in 0 until numeros.size) {
        for (j in 0 until numeros.size - 1 - i) {
            val condicion = if (orden == "Asc") {
                numeros[j] > numeros[j + 1]
            } else {
                numeros[j] < numeros[j + 1]
            }

            if (condicion) {
                val temp = numeros[j]
                numeros[j] = numeros[j + 1]
                numeros[j + 1] = temp
            }
        }
    }

    println("Matriz ordenada en $orden: $numeros")
}