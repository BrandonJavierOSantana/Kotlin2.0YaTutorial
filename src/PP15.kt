fun main (parametros : Array<String>) {
    var aprobados = 0
    var reprobados = 0
    for (i in 1..10) {
        print("Ingrese la nota del alumno $i: ")
        val nota = readLine()!!.toInt()
        if (nota >= 7) aprobados++ else reprobados++
    }
    println("Aprobados: $aprobados, Reprobados: $reprobados")
}