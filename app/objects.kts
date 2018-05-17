interface Factory<T: Any> {
    var mock: T?
    fun get(): T
}

class Provider<T: Any>(init: () -> T): Factory<T> {
    override var mock: T? = null
    val instance: T by lazy(init)

    override fun get() = mock ?: instance
}

class UserRepo {
    companion object : Factory<UserRepo> by Provider({ UserRepo() })
}

class BizRepo {
    companion object : Factory<BizRepo> by Provider({ BizRepo() })
}



UserRepo.get() // returns the real repo
BizRepo.get()  // returns the real repo
UserRepo.mock = mock(UserRepo)
BizRepo.mock = mock(BizRepo)
UserRepo.get() // returns the mock repo
BizRepo.get()  // returns the mock repo
UserRepo.mock = null
BizRepo.mock = null