package tanveer.ansari.koneapp.kotlinexs

fun main() {

//    val enc1: (String) -> String = { input -> input.toUpperCase() }
//
//  println(  encodeMsg(msg = "welcom",enc1))

    //trailinng lamda

    encodeMsg {
            input -> input.toLowerCase()
    }
}

fun encodeMsg(msg: String = "hello world",
              encode: (String) -> String): String {

    return encode(msg)
}


fun double(x: Int) = x * 2

fun drive(speed: String = "fast",speedVal:Int) {
    println("driving $speed at $speedVal")
}
