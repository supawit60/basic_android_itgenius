fun kNullSafety() {
//    var a: Int = null
//    var b: String = "Hello "
//    b = null

    var book: Int = 5
    if (book != null) {
        book = book.dec()
        println(book)
    }
}