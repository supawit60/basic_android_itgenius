fun kConditions() {
    var balance = 30_000
    val withdraw = 2_510
    if (balance < withdraw) {
        print("ยอดเงินคงเหลือไม่เพียงพอ\n")
    } else if (withdraw > 20_000) {
        print("ถอนได้ไม่เกิน 20000 บาท\n")
    } else if (withdraw % 100 != 0) {
        print("ต้องเป็นจำนวนเต็มร้อยเท่านั้น\n")
    } else {
        balance -= withdraw
        print("ยอดเงินคงเหลือ: $balance บาท\n")
    }

    println("-----------------")
    val remain = 1
    val r = if (remain > 0) "มีสินค้า" else "สินค้าหมด"
    println(r)
    println("-----------------")
    val ext = ".kt"
    println(if (ext == ".java") "Java File" else "Kotlin File")
    println("-----------------")


}