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

    println("-----------------")
    val (latitude, longitude) = Pair(80.1234, 100.5678)
    println(latitude)
    println("-----------------")
    val (firstname, lastname) = Pair("James", "Bond")
    println("Hi $firstname $lastname")

// ตัวอย่างการเก็บข้อมูลในแบบ Triple
    val boxSize = Triple(10, 20, 30)
    val volume = boxSize.first * boxSize.second * boxSize.third
    val (date, month, year) = Triple(1, "มกราคม", 2565)
    println("วันนี้ตรงกับ $date $month $year")
    println("-----------------")
    val (hour, minute, _) = Triple(12, 30, 0)
    println("ขณะนี้เวลา $hour:$minute")
    println("-----------------")

}