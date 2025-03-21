fun main (parametros:Array<String>) {
    print("Ingrese el día: ")
    val dia = readLine()!!.toInt()
    print("Ingrese el mes: ")
    val mes = readLine()!!.toInt()
    print("Ingrese el año: ")
    val anio = readLine()!!.toInt()

    if (dia == 25 && mes == 12) {
        println("La fecha ingresada corresponde a Navidad.")
    } else {
        println("La fecha ingresada no es Navidad.")
    }
}