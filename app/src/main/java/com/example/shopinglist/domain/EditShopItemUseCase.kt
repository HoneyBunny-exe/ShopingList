package com.example.shopinglist.domain

class EditShopItemUseCase(private val shopListRepo: ShopListRepo){
    fun editShopItem(shopItem: ShopItem)
    {
        shopListRepo.editShopItem(shopItem)
    }
}