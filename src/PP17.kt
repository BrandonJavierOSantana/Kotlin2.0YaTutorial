fun main (parametros: Array<String>){
    print("Ingrese la cantidad de empleados: ")
    val n = readLine()!!.toInt()
    var bajos = 0
    var altos = 0
    var total = 0
    for (i in 1..n) {
        print("Ingrese el sueldo: ")
        val sueldo = readLine()!!.toInt()
        if (sueldo <= 300) bajos++ else altos++
        total += sueldo
    }
    println("Sueldos entre $100 y $300: $bajos, más de $300: $altos, Gasto total: $total")
}