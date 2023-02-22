import java.util.*

fun main() {
Girls()
    Cities()
    addition()
   println( Persons())

}
fun Girls(){
    var girls = arrayOf("Mourin","Ann","Jemimah","Loise")
    println(girls.contentToString())
}
fun Cities(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { city -> println(city.capitalize()) }


}
fun addition(){
    var numArray = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum =( numArray[1] ) + (numArray[4])
    println(sum)

    var index = numArray.indexOf(158)
    println(index)

    var sortedNums = numArray.sortedArray()
    println(Arrays.toString(sortedNums))

}
fun Persons():String{
    var namesArray = arrayOf("Favor","Milly","Joy")
     return namesArray.contentToString()

}
