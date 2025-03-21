import java.util.*

object NumeroDigitos {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)


        // Ingresar un número entre 1 y 99
        print("Ingrese un número entre 1 y 99: ")
        val numero = scanner.nextInt()


        // Validar rango y determinar cantidad de dígitos
        if (numero >= 1 && numero <= 99) {
            if (numero < 10) {
                println("El número tiene un dígito")
            } else {
                println("El número tiene dos dígitos")
            }
        } else {
            println("Número fuera del rango permitido")
        }

        scanner.close()
    }
}