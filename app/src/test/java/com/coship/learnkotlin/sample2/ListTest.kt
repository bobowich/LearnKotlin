package com.coship.learnkotlin.sample2

import org.junit.Test

class ListTest {
    @Test
    fun testList(){
        val list = listOf(1, 2, 3, 4, 5)
        println("list before : $list")
        val number = list.get(0)
        println("get(0) : $number")
        //list.add(6)  //not support
        val mutableList = mutableListOf(1,2,3,4,5)
        println("mutableList before : $mutableList")
        mutableList.add(6)
        println("mutableList after : $mutableList")
    }

    @Test
    fun testSet() {
        // 存储唯一元素
        val set = setOf(1,1,2,3,3,4,5)
        println(set)  // [1, 2, 3, 4, 5]

        val set1 = set.map {
            "*".plus(it)
        }

        println("map1 : $set1")
        val first = set.first()
        println(first)

        val last = set.last()
        println(last)

        set.filter {
            print(it)
            it>3
        }.let {
            println(it)
        }

        set.first {
            println(it)
            it>2
        }.let {
            println(it)
        }

        set.last {
            println(it)
            it>2
        }.let {
            println(it)
        }
    }

    @Test
    fun testMap() {
        val map = mapOf("Monday" to 1, "Tuesday" to 2)
        println("map : $map")
        map.forEach { t, u ->  println("key : $t,value : $u")}
        val value = map["Monday"]
        println(value)
        println(map.get("Sunday"))
        val mutableMap = mutableMapOf("Monday" to 1, "Tuesday" to 2)
        println("mutableMap : $mutableMap")
        mutableMap.put("Subday",7)
        println("mutableMap : $mutableMap")
    }
}