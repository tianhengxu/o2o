package vo;

import enums.ShopStateEnum;
import model.Shop;

import java.util.List;

/**
 * Created by sky on 2018/11/26.
 *
 */
public class ShopExecution {
    //结果状态
    private  int state;
    //状态标识
    private String stateInfo;
    //店铺数量
    private int count;
    //操作的shop（增删改店铺的时候用到）
    private Shop shop;
    //shop 列表（查询店铺列表的时候用）
    private List<Shop> shopList;

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public int getCount() {
        return count;
    }

    public Shop getShop() {
        return shop;
    }

    public List<Shop> getShopList() {
        return shopList;
    }

    public ShopExecution(){

    }
    //失败的构造器
    public ShopExecution(ShopStateEnum shopStateEnum){
        this.state=shopStateEnum.getState();
        this.stateInfo=shopStateEnum.getStateInfo();
    }
    //成功的构造器
    public ShopExecution(ShopStateEnum shopStateEnum, Shop shop){
        this.state=shopStateEnum.getState();
        this.stateInfo=shopStateEnum.getStateInfo();
        this.shop=shop;
    }
    //成功的构造器
    public ShopExecution(ShopStateEnum shopStateEnum, List<Shop> shop){
        this.state=shopStateEnum.getState();
        this.stateInfo=shopStateEnum.getStateInfo();
        this.shopList=shop;
    }


}
