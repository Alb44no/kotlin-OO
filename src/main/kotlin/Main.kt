fun main(args: Array<String>) {
    println("Bem-vindo ao byte bank!")

    val titular: String = "Fernando"

    val numeroConta= 123;
    var saldo= 0.0
    saldo=9.0;

    println("Titular: $titular")
    println("Número da Conta: $numeroConta")
    println("Saldo: $saldo\n")

    if(saldo>0.0){
        println("O saldo está positivo")
    }else if(saldo==0.0){
        println("O saldo é neutro")
    }else{
        println("A conta é negativa")
    }

    when{
        saldo>0.0 -> println("O saldo está positivo")
        saldo==0.0 -> println("O saldo é neutro")
        else -> println("A conta é negativa")
    }

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}