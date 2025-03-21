fun main(parametros: Array<String>) {
    println("Ingrese tres números distintos:")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val mayor = maxOf(a, b, c)
    println("El número mayor es: $mayor")
    }