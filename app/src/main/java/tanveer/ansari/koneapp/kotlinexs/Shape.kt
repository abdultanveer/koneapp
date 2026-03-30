package tanveer.ansari.koneapp.kotlinexs

interface Shape {
    fun computeArea() : Double
}
class Circle(val radius:Double) : Shape {
    override fun computeArea() = Math.PI * radius * radius
}

class Triangle(val side:Double) : Shape {
    override fun computeArea() =  0.5 * side * side
}
