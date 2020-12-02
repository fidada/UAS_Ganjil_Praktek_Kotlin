package com.bilqismufida.uasganjilpraktekkotlin

fun main() {

    val orangJepang = arrayOf("Naruto", "Sasuke", "Sakura")
    val orangAmerika = arrayOf("Bryan", "Jack", "Rose")
    val orangIndonesia = arrayOf("Susanti", "Soleh", "Budi")
    val orangKorea = arrayOf("Jungkook", "Jimin", "Suga")

    println("Masukan Nama : ")
    val nama = readLine()

    when(nama){
        in orangJepang -> {
            println("$nama tuh, bule jepang")
            println("Pokokne bukan rang indo")
        }
    }

    when(nama){
        in orangAmerika -> {
            println("$nama tuh, bule barat uhuy")
            println("Pokokne bukan rang indo")
        }
    }

    when(nama){
        in orangIndonesia -> {
            println("$nama warga +62")
            println("Warga shantuyyy")
        }
    }

    when(nama){
        in orangKorea -> {
            println("$nama tuh, bule korea")
            println("Pokokne bukan rang indo")
        }
    }
}