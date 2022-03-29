fun kLoop() {
    // พิมพ์เลย 1-10
    for (x in 1..10) {
        println(x)
    }

    println("-----------------")
    val min = 1
    val max = 100
    var count = 0
    for (i in min..max) {
        if (i % 3 == 0) {
            count++
        }
    }
    println("จาก $min - $max มีเลขที่ 3 หารลงตัวเท่ากับ $count จำนวน")

}