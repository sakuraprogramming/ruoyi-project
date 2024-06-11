package com.ruoyi.develop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 accounts
 * 
 * @author ruoyi
 * @date 2024-06-11
 */
public class Accounts extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 账号ID */
    private Long accountId;

    /** 账号名 */
    @Excel(name = "账号名")
    private String accountName;

    /** 姓名 */
    @Excel(name = "姓名")
    private String userName;

    /** 密码 */
    @Excel(name = "密码")
    private String userPassword;

    /** 身份 */
    @Excel(name = "身份")
    private String identify;

    /** 学校 */
    @Excel(name = "学校")
    private String school;

    /** 报名组别 */
    @Excel(name = "报名组别")
    private String groupType;

    /** 头像 */
    @Excel(name = "头像")
    private String avatar;

    public void setAccountId(Long accountId) 
    {
        this.accountId = accountId;
    }

    public Long getAccountId() 
    {
        return accountId;
    }

    public void setAccountName(String accountName) 
    {
        this.accountName = accountName;
    }

    public String getAccountName() 
    {
        return accountName;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }

    public void setUserPassword(String userPassword) 
    {
        this.userPassword = userPassword;
    }

    public String getUserPassword() 
    {
        return userPassword;
    }

    public void setIdentify(String identify) 
    {
        this.identify = identify;
    }

    public String getIdentify() 
    {
        return identify;
    }

    public void setSchool(String school) 
    {
        this.school = school;
    }

    public String getSchool() 
    {
        return school;
    }

    public void setGroupType(String groupType) 
    {
        this.groupType = groupType;
    }

    public String getGroupType() 
    {
        return groupType;
    }

    public void setAvatar(String avatar) 
    {
        this.avatar = avatar;
    }

    public String getAvatar() 
    {
        return avatar;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("accountId", getAccountId())
            .append("accountName", getAccountName())
            .append("userName", getUserName())
            .append("userPassword", getUserPassword())
            .append("identify", getIdentify())
            .append("school", getSchool())
            .append("groupType", getGroupType())
            .append("avatar", getAvatar())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
