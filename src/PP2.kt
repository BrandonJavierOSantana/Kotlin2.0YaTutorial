import java.util.*

object OperacionesNumericas {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)


        // Ingresar los cuatro números
        print("Ingrese el primer número: ")
        val num1 = scanner.nextInt()
        print("Ingrese el segundo número: ")
        val num2 = scanner.nextInt()
        print("Ingrese el tercer número: ")
        val num3 = scanner.nextInt()
        print("Ingrese el cuarto número: ")
        val num4 = scanner.nextInt()


        // Cálculos
        val sumaDosPrimeros = num1 + num2
        val productoTerceroCuarto = num3 * num4
        val sumaTotal = num1 + num2 + num3 + num4
        val promedio = sumaTotal / 4.0


        // Mostrar resultados
        println("Suma de los dos primeros números: $sumaDosPrimeros")
        println("Producto del tercero y cuarto número: $productoTerceroCuarto")
        println("Suma total de los cuatro números: $sumaTotal")
        println("Promedio de los cuatro números: $promedio")

        scanner.close()
    }
}