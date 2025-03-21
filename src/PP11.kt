fun main (parametros:Array<String>) {
    print("Ingrese el primer número: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()
    print("Ingrese el tercer número: ")
    val num3 = readLine()!!.toInt()

    if (num1 == num2 && num2 == num3) {
        val cubo = num1 * num1 * num1
        println("Los números son iguales. El cubo es: $cubo")
    }
}