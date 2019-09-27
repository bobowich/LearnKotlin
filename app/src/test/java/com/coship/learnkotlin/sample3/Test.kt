package com.coship.learnkotlin.sample3

import org.junit.Test

class Test {
    @Test
    fun testFilter() {
        val list = listOf(1, 2, 3, 4, 5)
        println(list)
        val list1 = list.filter {
            it > 3
        }
        println(list1)
    }

    @Test
    fun testAsSequence(){
        val list = listOf(1, 2, 3, 4, 5)
        println(list)
        list//.asSequence()
            .filter {
                println("filter : $it")
                it >= 3
            }.map {
                println("map : $it")
                "*".plus(it)
            }/*.toList()
            .run {
                println(this)
            }*/
    }

    @Test
    fun testAction() {
        plus(null)
        plus("s")
        compute {
            (0..10)
                .forEach {
                    println("forEach $it")
                }
        }
        compute {
            (0..100)
                .filter { it > 50 }
                .count { it > 75 }
                .run {
                    println(this)
                }
        }
    }

    fun compute(action: (() -> Unit)?) {
        action?.invoke()
    }

    fun plus(s: String?) {
        println(s?.plus("***"))
    }
}