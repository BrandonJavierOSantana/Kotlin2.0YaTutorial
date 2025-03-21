fun main (params: Array<String>) {
    print("Ingrese el primer número: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()
    print("Ingrese el tercer número: ")
    val num3 = readLine()!!.toInt()

    val mayor = if (num1 > num2 && num1 > num3) num1 else if (num2 > num3) num2 else num3
    val menor = if (num1 < num2 && num1 < num3) num1 else if (num2 < num3) num2 else num3

    println("El mayor número es: $mayor")
    println("El menor número es: $menor")
}