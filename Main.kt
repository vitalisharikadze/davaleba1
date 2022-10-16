data class Fraction(val numerator: Int, val denominator: Int) {
    operator fun plus(other: Fraction): Fraction {
        return Fraction(numerator = this.numerator * other.denominator + this.denominator * other.numerator, denominator = this.denominator * other.denominator)
    }
    operator fun times(other: Fraction): Fraction {
        return Fraction(numerator = this.numerator * other.numerator, denominator = this.denominator * other.denominator)
    }
}
data class Point(val x: Int ,val y: Int) {
}
fun main(){
    val x1=Fraction(1,2)
    val x2=Fraction(1,2)
    println(x1+x2)
    println(x1*x2)

    val x3=Point(2,4)
    val x4=Point(2,4)
    println(x3)
    println(x4)
    println(x3==x4)
}
