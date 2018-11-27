package com.java.o2o;

import com.BaseTest;
import dao.ShopDao;
import model.Area;
import model.PersionInfo;
import model.Shop;
import model.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by sky on 2018/11/19.
 */
public class ShopDaoTest extends BaseTest{
    @Autowired
    private ShopDao shopDao;
    @Test
    public void addshop(){
        Shop shop=new Shop();
        PersionInfo persionInfo=new PersionInfo();
        Area area=new Area();
        ShopCategory shopCategory=new ShopCategory();
        area.setAreaId(1);
        persionInfo.setUserId(1);
        shopCategory.setShopCategoryId(1L);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setPersionInfo(persionInfo);
        shop.setAdvice("好好干1！");
        shop.setLastEditTime(new Date());
        shop.setShopName("珍珠奶茶店");
        shop.setPhone("13723412312");
        shop.setShopDesc("百年老店");
        shop.setShopId(1L);

        int id=shopDao.updateShop(shop);
        assertEquals(1,id);
    }
}
