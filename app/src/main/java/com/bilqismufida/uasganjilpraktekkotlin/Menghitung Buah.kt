package com.bilqismufida.uasganjilpraktekkotlin

fun main() {
    val buah = arrayOf(
        "Apple", "Banana", "Mango", "Melon",
        "Mango", "Apple", "Mango", "Banana",
        "Melon", "MAngo", "Apple", "Mango"
    )

    var mango = 0
    var banana = 0

    for (item in buah){
        if(item == "Mango"){
            mango += 1
        }
        if (item == "Banana"){
            banana += 1
        }
    }

    println("Total Mango = $mango")
    println("Total Banana = $banana")
}