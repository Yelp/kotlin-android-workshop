val any: Any = Any()
val maybe: Any? = null

fun show(maybe: Any?) = print(maybe)
fun reallyShow(any: Any) = print(any)

show(any)
show(maybe)

reallyShow(any)
reallyShow(maybe)         // compiler error
maybe?.run(::reallyShow)  // OK