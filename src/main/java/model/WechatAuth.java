package model;

import java.util.Date;

/**
 * Created by sky on 2018/11/5.
 */
public class WechatAuth {
    private Long wechatAuthorId;
    private  String openId;
    private Date createTime;
    private  PersionInfo persionInfo;

    public Long getWechatAuthorId() {
        return wechatAuthorId;
    }

    public void setWechatAuthorId(Long wechatAuthorId) {
        this.wechatAuthorId = wechatAuthorId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersionInfo getPersionInfo() {
        return persionInfo;
    }

    public void setPersionInfo(PersionInfo persionInfo) {
        this.persionInfo = persionInfo;
    }
}
