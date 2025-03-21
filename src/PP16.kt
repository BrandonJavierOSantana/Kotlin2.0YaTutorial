fun main (parametros: Array<String>){
    print("Ingrese la cantidad de personas: ")
    val n = readLine()!!.toInt()
    var suma = 0.0
    for (i in 1..n) {
        print("Ingrese la altura: ")
        suma += readLine()!!.toDouble()
    }
    println("Altura promedio: ${suma / n}")
}