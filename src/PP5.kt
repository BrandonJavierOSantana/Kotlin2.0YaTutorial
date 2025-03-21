import java.util.*

object pp5 {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)


        // Ingresar un número entre 1 y 99
        print("Ingrese un número entre 1 y 99: ")
        val numero = scanner.nextInt()
        val cantidadDigitos: Int


        // Validar rango y determinar cantidad de dígitos
        if (numero >= 1 && numero <= 99) {
            cantidadDigitos = if (numero < 10) {
                1
            } else {
                2
            }
            println("El número tiene $cantidadDigitos dígito(s)")
        } else {
            println("Número fuera del rango permitido")
        }

        scanner.close()
    }
}