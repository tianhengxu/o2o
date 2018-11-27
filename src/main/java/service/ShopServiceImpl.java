package service;

import dao.ShopDao;
import enums.ShopStateEnum;
import model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import utils.ImageUtils;
import utils.PathUtils;
import vo.ShopExecution;

import java.io.File;
import java.util.Date;

/**
 * Created by sky on 2018/11/27.
 */
@Component
public class ShopServiceImpl implements  ShopService {
    @Autowired
    private ShopDao shopDao;
    @Override
    @Transactional
    public ShopExecution addShop(Shop shop, File file) {
        //空值判断
        if (shop==null||file==null){
            return  new ShopExecution(ShopStateEnum.FAIL);
        }
        try {
            //附初始值
            shop.setEnableStatus(0);
            shop.setCreateTime(new Date());
            shop.setLastEditTime(new Date());
            int effect=shopDao.insertShop(shop);
            if (effect<1){
                throw new RuntimeException("店铺创建失败！");
            }else {
                //存储图片
                addShopImg(shop,file);
                //更新店铺地址
                effect=shopDao.updateShop(shop);
                if (effect<1){
                    throw  new RuntimeException("图片路径更新失败");
                }
            }
        }catch (Exception e){
            throw new RuntimeException("add error"+e.getMessage());
        }
        return new ShopExecution(ShopStateEnum.CHECK);
    }

    private void addShopImg(Shop shop, File file) {
        //获取图片存储路径
        String imagePath= PathUtils.getShopImagePath(shop.getShopId());
        String path= ImageUtils.generateThumbnail(file,imagePath);
        shop.setShopImg(path);

    }
}
