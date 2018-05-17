open class BackedByMap {
    protected val _map = mutableMapOf<String, Any?>()
    val map get() = _map.filterValues { it != null }
}

class Foo : BackedByMap() {
    var foo: String? by _map
    var bar: Int? by _map
}

val f = Foo()
println(f.map)
f.foo = "moo"
f.bar = 5
println(f.map)
f.foo = null
println(f.map)
f.bar = null
println(f.map)
