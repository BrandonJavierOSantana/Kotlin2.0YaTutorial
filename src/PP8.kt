fun main (parametros:Array<String>){
    println("Ingrese un número entero positivo de hasta tres cifras:")
    val numero = readLine()!!.toInt()
    if (numero in 1..9) {
        println("El número tiene 1 cifra")
    } else if (numero in 10..99) {
        println("El número tiene 2 cifras")
    } else if (numero in 100..999) {
        println("El número tiene 3 cifras")
    } else {
        println("Error: El número tiene más de 3 cifras o no es positivo")
    }
}