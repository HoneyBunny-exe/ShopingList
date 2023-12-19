package com.example.shopinglist.domain

class GetShopItemByIdUseCase(private val shopListRepo: ShopListRepo) {
    fun getShopItemById(id:Int):ShopItem
    {
        return shopListRepo.getShopItemById(id)
    }
}