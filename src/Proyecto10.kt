fun main (parametros:Array<String>) {
    print("Ingrese un valor entero:")
    val valor = readLine()!!.toInt()
    val resultado = if (valor %2 == 0) {
        println("Cuadrado:")
        valor * valor
    }else {
        println("Cubo:")
        valor * valor * valor
    }
    println(resultado)
}