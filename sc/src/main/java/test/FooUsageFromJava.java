package test;

import example.Foo;

public class FooUsageFromJava {
    public static void main(String[] args) {
        Foo foo1 = Foo.Companion.bar(4);
        System.out.println(foo1);
        Foo foo2 = Foo.baz(5);
        System.out.println(foo2);
        Foo foo3 = Foo.Companion.baz(6);
        System.out.println(foo3);
    }
}