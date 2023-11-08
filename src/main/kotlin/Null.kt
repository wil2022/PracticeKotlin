/*
fun main(){

    var favoriteActor: String? = "Pedro Pascal"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)

    var number: Int? = 10
    println(number)

    number = null
    println(number)
}

 */

/*
fun main(){

    //operador de llamada segura ?.
    var favoriteActor: String? = "Pedro Pascal"
    println(favoriteActor?.length)

    favoriteActor = null
    println(favoriteActor?.length)

//operador de aserción no nulo de !!
    favoriteActor = "Pedro Pascal"
    println(favoriteActor!!.length)

    var favoriteActor2: String? = null
    println(favoriteActor2!!.length)
}

 */

fun main(){
    /*
    var favoriteActor: String? = null

    if(favoriteActor != null){
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    }else {
        println("You didn't input a name.")
    }

     */

    /*

    // expresiones if/else
    val favoriteActor: String? = "Pedro Pascal"

    val lengthOfName = if(favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }

    println("The number of characters in your favorite actor's name is $lengthOfName.")

     */


    //operador Elvis ?:
    val favoriteActor: String? = "Pedro Pascal"

    val lengthOfName = favoriteActor?.length ?: 0
    println("The number of characters in your favorite actor's name is $lengthOfName.")

}