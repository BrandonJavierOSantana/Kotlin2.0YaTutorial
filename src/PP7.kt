fun main (parametros: Array<String>) {
    println("Ingrese un número entero:")
    val num = readLine()!!.toInt()
    when {
        num > 0 -> println("El número es positivo")
        num < 0 -> println("El número es negativo")
        else -> println("El número es nulo (cero)")
    }

}