fun main (parametro:Array<String>) {
    println("Ingrese primer valor:")
    val num1 = readLine()!!.toInt()
    println("Ingrese segundo valor:")
    val num2 = readLine()!!.toInt()
    println("Ingrese tercer valor:")
    val num3 = readLine()!!.toInt()
    if (num1 > num2 && num1 > num3)
        println(num1)
    else
        if (num2 > num3)
            println(num2)
        else println(num3)
}