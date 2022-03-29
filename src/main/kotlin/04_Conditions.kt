fun kConditions() {
    var balance = 30_000
    val withdraw = 2_510
    if (balance < withdraw) {
        print("ยอดเงินคงเหลือไม่เพียงพอ")
    } else if (withdraw > 20_000) {
        print("ถอนได้ไม่เกิน 20000 บาท")
    } else if (withdraw % 100 != 0) {
        print("ต้องเป็นจำนวนเต็มร้อยเท่านั้น")
    } else {
        balance -= withdraw
        print("ยอดเงินคงเหลือ: $balance บาท\n")
    }

}