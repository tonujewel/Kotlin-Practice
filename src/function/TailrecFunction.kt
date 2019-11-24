package function
import java.math.BigInteger

fun main() {

    println(getFibonacciNumber(1000, BigInteger("1"),BigInteger("0")))


}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (n == 0) {
        return b
    } else
        return getFibonacciNumber(n - 1, a + b, a)

}