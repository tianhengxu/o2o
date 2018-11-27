package com.java.o2o;

import com.BaseTest;
import model.Area;
import model.PersionInfo;
import model.Shop;
import model.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.ShopService;
import vo.ShopExecution;

import java.io.File;
import java.util.Date;

/**
 * Created by sky on 2018/11/19.
 */
public class ShopDaoTest extends BaseTest{
    @Autowired
    private ShopService shopService;
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
        shop.setAdvice("耐心等待！");
        shop.setLastEditTime(new Date());
        shop.setShopName("美食店");
        shop.setPhone("1376666666");
        shop.setShopDesc("網紅店");
        File file=new File("C:\\Users\\sky\\Desktop\\image\\robot.jpg");
        ShopExecution execution=shopService.addShop(shop,file);
        System.out.println(execution.getState());
    }
}
