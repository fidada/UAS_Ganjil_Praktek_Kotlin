package com.bilqismufida.uasganjilpraktekkotlin

fun main() {
    //Sesi 1 MasterChef
    val nilaiDessert = 95
    val nilaiSideDish = 89
    val nilaiAppetizers = 91

    val apakahLolosSesiDessert = nilaiDessert > 80
    val apakahLolosSesiSideDish = nilaiSideDish > 80
    val apakahLolosSesiAppetizers = nilaiAppetizers > 80

    val apakahLolosSesi1 = apakahLolosSesiAppetizers && apakahLolosSesiDessert && apakahLolosSesiSideDish
    println(apakahLolosSesi1)


    //Sesi 2 MasterChef
    val nilaiPlatting = 84
    val nilaiPenamaan = 61

    val apakahLolosSesiPlatting = nilaiPlatting > 80
    val apakahLolosSesiPenamaan = nilaiPenamaan > 80

    val apakahLolosSesi2 = apakahLolosSesiPlatting || apakahLolosSesiPenamaan
    println(apakahLolosSesi2)
}