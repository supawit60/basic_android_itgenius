fun kDataType() {
    println("# Signed Integral Type \n -------------")
    val kByte: Byte = 120   // -128 to 127
    val kShort: Short = 20_000  // -32768 to 32767
    val kInt: Int = 2_147_483_647   // -2147483648 to 2147483647
    val kLong: Long = 9_223_372_036_854_775_807L    // -9223372036854775808 to 9223372036854775807

    println("kByte = $kByte")
    println("kShort = $kShort")
    println("kInt = $kInt")
    println("kLong = $kLong")
}