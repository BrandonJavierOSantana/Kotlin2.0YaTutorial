fun main (parametros: Array <String>) {
    println("Ingrese la cantidad total de preguntas:")
    val totalPreguntas = readLine()!!.toInt()
    println("Ingrese la cantidad de respuestas correctas:")
    val correctas = readLine()!!.toInt()

    if (totalPreguntas > 0 && correctas in 0..totalPreguntas) {
        val porcentaje = (correctas * 100.0) / totalPreguntas
        val nivel = when {
            porcentaje >= 90 -> "Nivel máximo"
            porcentaje >= 75 -> "Nivel medio"
            porcentaje >= 50 -> "Nivel regular"
            else -> "Fuera de nivel"
        }
        println("El postulante tiene un porcentaje de aciertos de ${"%.2f".format(porcentaje)}% y su nivel es: $nivel")
    } else {
        println("Error: Datos ingresados inválidos")
    }
}