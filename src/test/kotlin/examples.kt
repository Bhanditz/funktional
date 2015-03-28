package nl.mplatvoet.funktional.examples

import nl.mplatvoet.funktional.types.Failure
import nl.mplatvoet.funktional.types.Success
import nl.mplatvoet.funktional.types.Try

val halfFn = fun (a: Int): Try<Int> = if (a and 1 == 1) Failure(IllegalStateException("$a is uneven")) else Success(a / 2)

fun main(args: Array<String>) {

    println(Success(20).bind(halfFn).bind(halfFn).bind (halfFn))
}

