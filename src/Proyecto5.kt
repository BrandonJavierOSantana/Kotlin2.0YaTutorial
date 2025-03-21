fun main (parametro: Array <String>){
    println("Ingrese el precio del producto:")
    val precio = readLine()!!.toDouble()
    println("Ingrese la cantidad de productos:")
    val cantidad = readLine()!!.toInt()
    val total = precio * cantidad
    println("El total a pagar es $total")
}