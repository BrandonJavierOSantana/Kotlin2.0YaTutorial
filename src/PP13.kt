fun main (parametros: Array<String>){
    print("Ingrese la coordenada x: ")
    val x = readLine()!!.toInt()
    print("Ingrese la coordenada y: ")
    val y = readLine()!!.toInt()

    when {
        x > 0 && y > 0 -> println("El punto se encuentra en el primer cuadrante.")
        x < 0 && y > 0 -> println("El punto se encuentra en el segundo cuadrante.")
        x < 0 && y < 0 -> println("El punto se encuentra en el tercer cuadrante.")
        x > 0 && y < 0 -> println("El punto se encuentra en el cuarto cuadrante.")
        else -> println("Las coordenadas no deben ser cero.")
    }
}