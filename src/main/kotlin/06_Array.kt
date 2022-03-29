import kotlin.math.*

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

    // การสร้างอาร์เรย์แบบไม่ระบุชนิดข้อมูล
    val oddNumbers = arrayOf(1, 3, 5, 7, 9)
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    val data = arrayOf(1, true, "three") //อาจเก็บข้อมูลต่างชนิดกันก็ได้
//    val emptyArray = arrayOf()  //Error ต้องกำหนดสมาชิกเริ่มแรกเสมอ

// การสร้างอาร์เรย์ของชนิดข้อมูลพื้นฐาน
    // ใช้คลาส XxxArray เมื่อ Xxx คือชนิดข้อมูลพื้นฐาน เช่น ByteAray, IntArray, LongArray,
    //UIntArray, UShortArray, DoubleArray, CharArray
    val oddNums: IntArray = IntArray(3) //3 คือจำนวนสมาชิกของอาร์เรย์
    oddNums[0] = 1 //กำหนดค่าให้กับสมาชิก
    oddNums[1] = 2
    // oddNums[2] = 3.5 //Error สมาชิกต้องเป็นชนิด Int ตามชื่อคลาสเท่านั้น
    // oddNums[3] = 4 //Error จำนวนสมาชิกมีได้เพียง 3 ตัว

    println("-----------------")
    // การเข้าถึงสมาชิกของอาร์เรย์ด้วยลูป for-in
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var sum = 0
    for (n in nums) {
        sum += n //เข้าถึงสมาชิกทุกตัว
    }
    println(sum) //45

    // การเข้าถึงสมาชิกของอาร์เรย์ด้วยลูป forEach()
    val cars = arrayOf("Benz", "BMW", "Jaguar", "Ford")
    cars.forEach {
        println(it) //it คือตัวแปรที่ถูกสร้างขึ้นโดยอัตโนมัติ เพื่อใช้อ้างถึงสมาชิกในแต่ละลูป
    }

    // ตัวอย่างการใช้ เมธอดที่น่าสนใจของอาร์เรย์
    val numbers = intArrayOf(7, 11, 1009, 108, 101)
    val len = numbers.count() //หรือ numbers.size
    println(len)
    if (!numbers.contains(99)) {
        println("Error")
    }
    // val str = numbers.joinToString(" - ")
    // println(str) //7 - 11 - 1009 - 108 - 101

    println("-----------------")

    // ฟังก์ชันสำหรับการคำนวณ
    val radius = 10.0
    val circleArea = PI * radius.pow(2)
    println(circleArea)

}