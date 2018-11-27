package model;

import java.util.Date;

/**
 * Created by sky on 2018/11/5.
 */
public class ProductCategory {
    private Long productCategroyId;
    private  Long shopId;
    private  String productCategroyName;
    private  Integer priority;
    private Date createTime;

    public Long getProductCategroyId() {
        return productCategroyId;
    }

    public void setProductCategroyId(Long productCategroyId) {
        this.productCategroyId = productCategroyId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getProductCategroyName() {
        return productCategroyName;
    }

    public void setProductCategroyName(String productCategroyName) {
        this.productCategroyName = productCategroyName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
