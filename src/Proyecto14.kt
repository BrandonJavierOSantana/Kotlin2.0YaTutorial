fun main (parametros: Array<String>){
    println("Ingrese día:")
    val dia = readLine()!!.toInt()
    println("Ingrese mes:")
    val mes = readLine()!!.toInt()
    println("Ingrese año:")
    val año = readLine()!!.toInt()
    if (mes == 1 || mes ==2 || mes ==3)
        println("Corresponde al primer trimestre")
        print("$dia")
        print("$mes")
        print("$año")
}