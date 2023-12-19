package com.example.shopinglist.domain

class GetShopListUseCase(private val shopListRepo: ShopListRepo) {
    fun getShopList():List<ShopItem>
    {
        return shopListRepo.getShopList()
    }
}