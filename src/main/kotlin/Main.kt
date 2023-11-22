fun main(args: Array<String>) {
    //1. Variables and conditional structures
//    println("Bem-vindo ao byte bank!")
//
//    val titular: String = "Fernando"
//
//    val numeroConta= 123;
//    var saldo= 0.0
//    saldo=9.0;
//
//    println("Titular: $titular")
//    println("Número da Conta: $numeroConta")
//    println("Saldo: $saldo\n")
//
//    if(saldo>0.0){
//        println("O saldo está positivo")
//    }else if(saldo==0.0){
//        println("O saldo é neutro")
//    }else{
//        println("A conta é negativa")
//    }
//
//    when{
//        saldo>0.0 -> println("O saldo está positivo")
//        saldo==0.0 -> println("O saldo é neutro")
//        else -> println("A conta é negativa")
//    }


    //2.Repetion strutres
//    for (i in 1..3) {
//        println(i)
//    }

//    for(i in 5 downTo 0){
//        println("downTo em ação:$i")
//    }

//    for(i in 20 downTo 0 step 2){
//        println("downTo em ação:$i")
//    }

//    for (i in 20 downTo 0 step 2) {
//        println("downTo em ação:$i")
//
//        if (i == 10) {
//            break;
//        }
//    }

    //while cycles
     var i:Int=0;
//
//    while(i<20){
//        i++
//        println("$i: while cycles in action")
//    }


    //do while

//    do{
//         i++
//         println("$i: while do")
//    } while(i<7)

    //Coisa estranha
    loop@ for (i in 1..20) {
        println("i $i")
        for (j in 1..20) {
            println("j $j")
            if (j == 5) break@loop
        }
    }



    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}