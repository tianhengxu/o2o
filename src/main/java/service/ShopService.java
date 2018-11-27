package service;

import model.Shop;
import org.springframework.stereotype.Service;
import vo.ShopExecution;

import java.io.File;

/**
 * Created by sky on 2018/11/27.
 */
@Service
public interface ShopService {
     ShopExecution addShop(Shop shop, File file);
}
