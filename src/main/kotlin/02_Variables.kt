fun kVariables() {
    // var ชื่อตัวแปร: ชนิดข้อมูล
    var x: Int
    var result: Double
    var str: String
//    var a, b, c: String // Error

    var kByte: Byte = 100
    println(kByte)
    kByte = 127
    println(kByte)

    // ชนิดข้อมูลแบบ Double ไม่สามารถกำหนดจำนวนเต็มให้มันได้ (Java ทำได้)
    // var d1: Double = 100 // Error
    var d2: Double = 100.50
    println(d2)

    // ข้อมูลชนิด Char ต้องอยู่ใน '' เท่านั้น
    var grade: Char = 'A'
    var size: Char = 'M'
    var a: Char = '\u0061'
    println(grade)
    println(size)
    println(a)

    val pi: Float = 3.141f
    val pricePerUnit: Short = 1000
    val lat: Double = 100.12345
    val lon: Double = 80.67890
//    lat = 2121.2121 // error
}