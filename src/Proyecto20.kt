fun main (parametros: Array<String>){
    var cant = 0
    var suma = 0
    do {
        println("Ingrese un valor (0 para finalizar):")
        val valor = readLine()!!.toInt()
        if ( valor != 0) {
            suma += valor
            cant++
        }
    } while (valor !=0)
    if (cant != 0){
        val promedio = suma / cant
        println("El promedio de los valores ingresados es: $promedio")
    } else
        println("No se ingresaron valores.")
}