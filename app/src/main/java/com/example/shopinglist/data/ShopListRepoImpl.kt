package com.example.shopinglist.data

import com.example.shopinglist.domain.ShopItem
import com.example.shopinglist.domain.ShopListRepo

object ShopListRepoImpl : ShopListRepo {

    //Данные будут храниться в списке
    private val data = mutableListOf<ShopItem>()
    private var idIncrement = 0
    override fun addShopItem(shopItem: ShopItem) {
        if(shopItem.id == ShopItem.UNDEFINED_ID)
            shopItem.id = idIncrement++
        data.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        data.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldShopItem = getShopItemById(shopItem.id)
        data.remove(oldShopItem)
        addShopItem(shopItem)
    }

    override fun getShopItemById(id: Int): ShopItem {
        return data.find { it.id == id } ?: throw NullPointerException()
    }

    override fun getShopList(): List<ShopItem> {
        return data.toList()
    }

}