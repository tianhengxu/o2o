package service;

import model.Shop;
import org.springframework.stereotype.Service;
import vo.ShopExecution;

import java.io.File;

/**
 * Created by sky on 2018/11/27.
 */
@Service
public interface ShopService {//店铺接口
     ShopExecution addShop(Shop shop, File file);
}
