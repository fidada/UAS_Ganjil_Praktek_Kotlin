package com.bilqismufida.uasganjilpraktekkotlin

fun main() {
    val animals = arrayOf("Lion", "Wolf", "Eagle", "Shark")
    for (animal in animals){
        println(animal)
    }

    val numbers = intArrayOf(3, 4, 5, 2)
    for (number in numbers.indices){
        println(numbers[number])
    }
}