package my.demo.common

interface Factory<T: Any> {
    var mock: T?
    fun instance(): T
}
open class Provider<T: Any>(init: () -> T): Factory<T> {
    override var mock: T? = null
    private val instance: T by lazy(init)
    override fun instance() = mock ?: instance
}
