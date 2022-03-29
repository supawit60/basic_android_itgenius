fun kNullSafety() {
//    var a: Int = null
//    var b: String = "Hello "
//    b = null

    var books: Int? = null
    // วิธีที่ 1 ใช้ if ตรวจสอบ
    if (books != null) {
        books = books.dec()
        println(books)
    }

    // วิธีที่ 2 ใช้ Call Safety (?)
    books = books?.dec()
    println(books)

    println("-------------------------")
    val a: Int? = null
    val x = a ?: 0 //หาก a เป็น null ตัวแปร x จะเท่ากับ 0 แต่หากไม่เป็น null ตัวแปร x = a
    println(x) // 10
    /* เทียบเท่ากับ
      val x = if (a != null) a else 0
    */
    val b: Double? = 1.23
    val y = b ?: -1.0
    println(y) // 1.23

    println("-------------------------")

    val aa: Int? = 10
    val bb: Int? = 20
    val c: Int = aa!! + bb!!
    println(c)
    val str: String? = "123"
    val xx: Int = str!!.toInt()
    print(xx)

}