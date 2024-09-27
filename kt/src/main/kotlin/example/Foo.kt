package example

class Foo private constructor(private val i: Int) {
    companion object {
        fun bar(i: Int) = Foo(i)
        @JvmStatic fun baz(i: Int) = Foo(i)
    }

    override fun toString(): String = "Foo($i)"
}