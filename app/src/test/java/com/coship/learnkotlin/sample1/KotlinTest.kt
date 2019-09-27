package com.coship.learnkotlin.sample1

import org.junit.Test


class KotlinTest{
    @Test
    fun testAlso(){
        Book(500,"light , weight")
            .also {
                it.getInfo()
                it.plus(50)
            }.let {
                it.getInfo()
            }
    }

    @Test
    fun testRun(){
        Book(500,"light , weight")
            .run {
                getInfo()
                plus(50)
                println(name)
                this
            }.let {
                it.getInfo()
            }
    }

    @Test
    fun testLet(){
        Book(500,"light , weight")
            .let {
                it.getInfo()
                it.plus(50)
                it
            }.let {
                it.getInfo()
            }
    }

    @Test
    fun testWith() {
        with(receiver = Book(500,"light , weight")){
            getInfo()
            plus(50)
            this
        }.let {
            it.getInfo()
        }
    }

    @Test
    fun testApply(){
        //apply 类似builder模式
        Book().apply {
            name = "bobowich"
            price = 200
        }.let {
            it.getInfo()
        }
    }
}