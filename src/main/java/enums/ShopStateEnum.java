package enums;

/**
 * Created by sky on 2018/11/26.
 */
public enum  ShopStateEnum {
    CHECK(0,"审核中"),OFFLINE(-1,"非法店铺"),
    PASS(2,"通过认证"),SUCCESS(1,"操作成功");
    private String stateInfo;
    private  int state;
    private  ShopStateEnum(int state,String stateInfo){
        this.state=state;
        this.stateInfo=stateInfo;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public int getState() {
        return state;
    }

    /**
     * 根据传入的state返回相应的enum值
     */
    public  static  ShopStateEnum stateof(int state){
        for (ShopStateEnum shopStateEnum:values()){
            if (shopStateEnum.getState()==state){
                return  shopStateEnum;
            }
        }
    }
}
