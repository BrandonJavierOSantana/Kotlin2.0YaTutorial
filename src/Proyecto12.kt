fun main (parametros: Array<String>) {
    println("Ingrese primer nota:")
    val nota1 = readLine()!!.toInt()
    println("Ingrese Segunda nota:")
    val nota2 = readLine()!!.toInt()
    println("Ingrese Tercera nota:")
    val nota3 = readLine()!!.toInt()
    val promedio = (nota1 + nota2 + nota3) / 3
    val estado = if (promedio >= 7) "Promocionado"
    else if (promedio >4) "regular"
    else "Libre"
    println("Estado del alumno $estado")
}