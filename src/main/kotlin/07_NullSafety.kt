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
}