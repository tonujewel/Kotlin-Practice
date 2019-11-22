package loop

fun main(){

    for (i in 1..10){

        if (i == 3 || i == 5){
            continue
        }
        println(i)
    }

    // for odd number
    for (j in 1..20){

        if (j %2 == 0){
            continue
        }

        println(j)
    }

}