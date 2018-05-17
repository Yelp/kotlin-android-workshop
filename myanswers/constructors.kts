open class Parent(arg: Unit = println("4")) {
    private val a = println("5")

    init {
        println("6")
    }

    constructor(arg: Int, arg2: Unit = println("3")) : this() {
        println("8")
    }

    private val b = println("7")
}

class Child(arg: Unit = println("2")) : Parent(2) {
    val a = println("9")

    init {
        println("10")
    }

    val b = println("11")

    constructor(arg: Int, arg2: Unit = println("1")) : this() {
        println("13")
    }

    init {
        println("12")
    }
}

Child(2)