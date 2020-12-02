package com.bilqismufida.uasganjilpraktekkotlin

fun main() {
    var angka = 30
    while (angka <= 70){
        print("$angka ")
        angka++
    }

    val makanan = listOf("Spaghetti", "Ubi Bakar", "Es Krim", "Soto")
    for (foods in makanan){
        print("$foods ")
    }
}