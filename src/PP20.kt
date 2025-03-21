fun main (parametros: Array<String>){
    val lista1 = IntArray(5) { readLine()!!.toInt() }
    val lista2 = IntArray(5) { readLine()!!.toInt() }
    val suma1 = lista1.sum()
    val suma2 = lista2.sum()
    println(if (suma1 > suma2) "Lista 1 mayor" else if (suma1 < suma2) "Lista 2 mayor" else "Listas iguales")
}