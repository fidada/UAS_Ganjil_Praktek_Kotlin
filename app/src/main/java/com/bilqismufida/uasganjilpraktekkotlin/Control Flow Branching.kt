package com.bilqismufida.uasganjilpraktekkotlin

fun main() {
    val duid = 25
    when(duid){
        in 5..10 -> println("Aku akan jajan bakpau")
        in 20..50 -> println("Aku akan jajan chatime")
        in 70..100 -> println("Aku akan jajan skincare")
        else -> println("Aku tidak akan jajan")
    }

    val makhluk = "Makhluk Bumi"
    if (makhluk == "Makhluk Bumi"){
        println("Ohayou")
    }else println("ALIEN!!!")
}