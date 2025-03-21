fun main (parametros:Array<String>) {
    print("Ingrese el primer número: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()
    print("Ingrese el tercer número: ")
    val num3 = readLine()!!.toInt()

    if (num1 < 10 && num2 < 10 && num3 < 10) {
        println("Todos los números son menores a diez.")
    } else if (num1 < 10 || num2 < 10 || num3 < 10) {
        println("Alguno de los números es menor a diez.")
    }
}