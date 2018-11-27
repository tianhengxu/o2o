package model;

import java.util.Date;

/**
 * Created by sky on 2018/11/5.
 */
public class LocalAuth {
    private  Long localAuthId;
    private  String userName;
    private  String password;
    private  Date createTime;
    private Date lastEditTime;
    private  PersionInfo persionInfo;

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public PersionInfo getPersionInfo() {
        return persionInfo;
    }

    public void setPersionInfo(PersionInfo persionInfo) {
        this.persionInfo = persionInfo;
    }
}
