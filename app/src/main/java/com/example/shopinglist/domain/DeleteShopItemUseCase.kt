package com.example.shopinglist.domain

class DeleteShopItemUseCase(private val shopListRepo: ShopListRepo){
    fun deleteShopItem(shopItem: ShopItem)
    {
        shopListRepo.deleteShopItem(shopItem)
    }
}