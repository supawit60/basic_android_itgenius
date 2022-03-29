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

    // กรณีที่ต้องการให้วนลูปจากค่าแรกไปจนถึง ก่อนค่าสุดท้าย ให้กำหนดช่วงข้อมูลด้วย until เช่น
    for (a in 0 until 100 step 10) {
        println(a)
    }
    println("-----------------")
    // ถ้าต้องการเรียงลำดับแบบย้อนกลับ ก็กำหนดช่วงข้อมูลด้วย downTo เช่น
    for (i in 10 downTo 1) {
        println(i)
    }

    println("-----------------")
    repeat(5) {
        println("Kotlin")
    }

    println("-----------------")
    // การใช้ลูปแบบ while
    // ถ้าเลขนั้นยกกำลังสองแล้วได้ค่าน้อยกว่า 100 ก็ให้วนลูปไปเรื่อยๆ
    var n = 1
    while ((n * n) < 100) {
        n += 1
        println(n)
    }
    println("n = $n") //n = 10

    println("-----------------")
    // การใช้ลูปแบบ do-while
    do {
        print("กรุณาใส่รหัส >> ")
        var code = readLine()
    } while (code != "1234")
    println("ขอบคุณค่ะ")
}