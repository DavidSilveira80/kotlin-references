package functionTest

import functions.sayHello
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SayHelloTest{
    @Test
    fun sayHelloTest(){
        Assertions.assertEquals("Hi! Hello", sayHello())
    }

}