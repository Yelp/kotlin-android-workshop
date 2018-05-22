// !!! COPY ME INTO A SCRATCH FILE FIRST !!!
// !!! COPY ME INTO A SCRATCH FILE FIRST !!!
// !!! COPY ME INTO A SCRATCH FILE FIRST !!!

open class Parent(arg: Unit = println("Parent primary default argument")) {
    private val a = println("Parent.a")

    init {
        println("Parent.init")
    }

    constructor(arg: Int, arg2: Unit = println("Parent secondary default argument")) : this() {
        println("Parent secondary constructor")
    }

    private val b = println("Parent.b")
}

class Child(arg: Unit = println("Child primary default argument")) : Parent(2) {
    val a = println("Child.a")

    init {
        println("Child.init 1")
    }

    val b = println("Child.b")

    constructor(arg: Int, arg2: Unit = println("Child secondary default argument")) : this() {
        println("Child secondary constructor")
    }

    init {
        println("Child.init 2")
    }
}

Child(2)