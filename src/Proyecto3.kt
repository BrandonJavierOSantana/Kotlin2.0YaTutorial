fun main (argumento : Array<String>) {
    println("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    println("Ingrese segundo valor")
    val valor2 = readLine()!!.toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 + $valor2 es $suma")
    val producto = valor1 * valor2
    println("El producto de $valor1 + $valor2 es $producto")
}