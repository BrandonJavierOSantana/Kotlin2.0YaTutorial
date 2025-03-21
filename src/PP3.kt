import java.util.*

object PromocionAlumno {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)


        // Ingresar las tres notas del alumno
        print("Ingrese la primera nota: ")
        val nota1 = scanner.nextDouble()
        print("Ingrese la segunda nota: ")
        val nota2 = scanner.nextDouble()
        print("Ingrese la tercera nota: ")
        val nota3 = scanner.nextDouble()


        // Calcular promedio de notas
        val promedio = (nota1 + nota2 + nota3) / 3.0


        // Verificar si el alumno está promocionado
        if (promedio >= 7) {
            println("Promocionado")
        } else {
            println("No promocionado")
        }

        scanner.close()
    }
}