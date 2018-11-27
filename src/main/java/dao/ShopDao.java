package dao;

import model.Shop;

/**
 * Created by sky on 2018/11/19.
 */
public interface ShopDao {
    /*
    新增店铺
     */
    int insertShop(Shop shop);
    int updateShop(Shop shop);
}
