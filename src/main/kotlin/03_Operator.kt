fun kOperator() {
    // ตัวอย่าง โอเปอเรเตอร์สำหรับการคำนวณ
    val a = 4 + 2
    val b = 4 - 2
    val c = 4 * 2
    val d = 4 / 2
    val e = 10 % 3 //e = 1 เพราะค่ามากที่สุดที่ไม่เกิน 13 ซึ่ง 3 หารลงตัวคือ 12 ค่าที่เหลือคือ (13 - 12) = 1
    val f = 19 % 5 //f = 4 เพราะค่ามากที่สุดที่ไม่เกิน 19 ซึ่ง 5 หารลงตัวคือ 15 ค่าที่เหลือคือ (19 - 15) = 4
    val g = 100 % 20 //g = 0 เพราะหารลงตัวพอดี

    print("$a\n$b\n$c\n$d\n$e\n$f\n$g\n")

    println("--------------------------")
    // ตัอย่าง โอเปอเรเตอร์สำหรับการคำนวณและกำหนดค่า
    var h = 10; h += 5 // 15
    var i = 20; i -= 15 // 5
    var j = 30; j *= 2 // 60
    var k = 40; k /= 4 // 10
    var l = 50; l %= 7 // 1

    print("$h\n$i\n$j\n$k\n$l\n")

    println("--------------------------")
    // โอเปอเรเตอร์การเพิ่มและลดค่า
    var x = 10
    x++
    println(x) // 11
    ++x
    println(x) // 12
    x--
    println(x) // 11
    --x
    println(x) // 10

    println("--------------------------")
    var m = 10
    var n = 20
    m += n++
    println(m) // 30
    println(n) // 21

    println("--------------------------")
    var mm = 10
    var nn = 20
    mm += ++nn
    println(mm) // 31
    println(nn) // 21

    println("--------------------------")
    val d1 = (2 == 1); println(d1) // false
    val d2 = (2 != 1); println(d2)  // true
    val d3 = (2 > 1); println(d3) // true
    val d4 = (2 <= 1); println(d4) // false
    val d5 = "kotlin" == "kotlin"; println(d5) // true
    val d6 = "android" == "Android"; println(d6) // false
}