fun kArray() {
    // ตัวอย่างการใช้ Pair
    val size = Pair(50, 100)
    val width = size.first
    val height = size.second
    println(width)
    println(height)

    println("-----------------")
    val name = Pair("James", "Bond")
    val msg = "Hi ${name.first} ${name.second}" //Hi James Bond
    println(msg)
    println("-----------------")
    val error = Pair(404, "Not Found")
    println("Error: ${error.first} - ${error.second}")  //Error 404 - Not Found

}