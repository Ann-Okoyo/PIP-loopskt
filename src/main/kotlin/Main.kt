fun main() {
    //Write a Kotlin program to print the first
//n natural numbers using a for loop.

    val numbers = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in 0..9) {
        println("0 is  the first")
    }
    for (number in 1..9) {
        println("natural numbers")
    }
//    Write a Kotlin program to print the first
//            n even numbers using a for loop.
    val a = (1..10)
    val b = a.filter { r -> r % 2 == 0 }
    println(b)
    workit()
    work()
    doit()

}
//    Write a Kotlin program to print the first
//            n odd numbers using a for loop.
fun work(){
    var nums = 1..15
    var nums2 =nums.filter{x ->x%2 !=0}
    println(nums2)
}
fun workit(){
    var values = 1..15
    for(x in values){
        if(x %2!=0){
        }
        println(x)
    }

}
//Write a Kotlin program to print the
//sum of the natural numbers using a for loop.
fun doit(){
    val b =0..10
    var sum =0
    for (i in b){
      sum+=i
        println(sum)

    }
}
//Write a Kotlin program to check if a
//number is prime using a for loop.
fun prime(num1:Int):Int{
    for (l in nums){
        l%nums && l%1


    }


    }


