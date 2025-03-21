fun main (parametro: Array<String>) {
    println("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    println("Ingrese el segundo valor:")
    val valor2 = readLine()!!.toInt()
    if (valor1 > valor2)
        println("El mayor valor es $valor1")
    else
        println("El mayor valor es $valor2")
}