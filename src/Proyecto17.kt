fun main (parametros: Array<String>){
    var x = 1
    var suma = 0
    while (x <= 10) {
        println("Ingrese un valor:")
        val valor = readLine()!!.toInt()
        suma = suma + valor
        x = x+1
    }

    println("La suma de los 10 valores ingresados es $suma")
    val promedio = suma /10
    println("El promedio es $promedio")
}