fun main (parametros: Array<String>){
    print("Ingrese la cantidad de números a procesar: ")
    val n = readLine()!!.toInt()
    var pares = 0
    var impares = 0

    for (i in 1..n) {
        print("Ingrese un número: ")
        val valor = readLine()!!.toInt()
        if (valor % 2 == 0) pares++ else impares++
    }

    println("Cantidad de números pares: $pares")
    println("Cantidad de números impares: $impares")
}