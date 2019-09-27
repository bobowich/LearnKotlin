package com.coship.learnkotlin.sample1

class Book (var price : Int = 0,var name : String = ""){
    /*lateinit var name:String
    var price:Int = 0
    constructor(price : Int, name : String) : this() {
        this.price = price
        this.name = name
    }*/

    fun getInfo(){
        println("Book name is $name ,price is $price")
    }

    fun plus(increment: Int) {
        price+=increment
    }
}