import java.io.File

fun main(args: Array<String>) {
    // **********Part I**************
    // Create a list of 3 elements
    var favouriteCity = mutableListOf("Riyadh", "Jeddah", "Hail")
    //add more 2 elements
    favouriteCity.addAll(0, listOf("Makkah", "Dammam"))
    //update last element
    favouriteCity[favouriteCity.size - 1] = "Alkhobar"
    //print the whole list with the numbers
    for (index in 0 until favouriteCity.size) {
        println("$index - ${favouriteCity[index]}")
    }

    //***********Part II************
    //Create a list of integer with 5 elements
    var integerList = mutableListOf(7, 10, 27, 5, 30)
    //pdate the 3th element to 12
    integerList[3] = 12
    //check if the 12 is existing
    println(integerList[3])
    //delete the element
    integerList.removeAt(3)
    //print the list
    println(integerList)

    //*****  more practice  *****
    //Create a text file and read it
    var integerFile = File("data/input.txt").readText().split("\n")
    println(integerFile)
    //Create a list of 10 number
    var numberList= listOf(2,17,5,45,18,20,27,9,13,7)
    //return the maximum number
    println("the maximum number is: ${numberList.maxOrNull()}")
}
